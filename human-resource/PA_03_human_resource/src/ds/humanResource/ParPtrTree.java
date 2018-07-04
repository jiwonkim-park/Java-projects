package ds.humanResource;

public class ParPtrTree {
	private Integer[] Parent; // The value of the array is the index of parent
	private Integer[] Ability; // The value of the array is the ability of corresponding member
	private Integer[] GroupAbility; // The value of the array is the total group ability. This is available only for leader.
	private Integer[] GroupSize; // The value of the array is the number of group members. This is available only for leader.
	
	public ParPtrTree(int size) {
		Parent = new Integer[size]; // Create parent array
		for (int i = 0; i < size; i++)
			Parent[i] = null;
		
		Ability = new Integer[size]; // Create ability array
		for (int i = 0; i < size; i++)
			Ability[i] = null;
		
		GroupAbility = new Integer[size]; // Create GroupAbility array
		for (int i = 0; i < size; i++)
			GroupAbility[i] = null;
		
		GroupSize = new Integer[size]; // Create GroupSize array
		for (int i = 0; i < size; i++)
			GroupSize[i] = null;
	}
	
	public void setAbility(Integer index, Integer ability) {
		// fill your code
		Ability[index] = ability;
 	}
	
	public void setGroupAbility(Integer index, Integer GA) {
		// fill your code
		if (Parent[index] == null) {
			GroupAbility[index] = GA;
		} else {
			GroupAbility[FIND(index)] = GA; //Group-ability is only useful for the leader. Therefore, non-leaders may have dummy values.
		}
		
	}
	
	public void setGroupSize(Integer index, Integer GS) {
		// fill your code
		if (Parent[index] == null) {
			GroupSize[index] = GS;
		} else {
			GroupSize[FIND(index)] = GS; 
		}
	}
	
	public void addGroupAbility(Integer index, Integer GA) {
		// fill your code
		//Integer indexroot = FIND(index);
		GroupAbility[index] += GA;
		
	}
	
	public void addGroupSize(Integer index, Integer GS) {
		// fill your code
		Integer indexroot = FIND(index);
		
		GroupSize[indexroot] += GS;
	}
	
	public Integer getAbility(Integer index) {
		// fill your code
		return Ability[index];
	}

	public Integer getGroupAbility(Integer index) {
		// fill your code
		if (Parent[index] == null) {
			return GroupAbility[index];
		} else {
			return GroupAbility[FIND(index)];
		}
	}
	
	public Integer getGroupSize(Integer index) {
		// fill your code
		if (Parent[index] == null) {
			return GroupSize[index];
		} else {
			return GroupSize[FIND(index)];
		}
	}
	
	public Integer getDepth(Integer index) {
		// fill your code
		Integer depth = 0;
		Integer temp = index;
		while (Parent[temp] != null) {
			depth++;
			temp = Parent[temp];
		}

		return depth;
	}

	/** Determine if nodes are in different trees */
	public boolean differ(int a, int b) {
		// fill your code
		int root1 = FIND(a);
		int root2 = FIND(b);
		return root1 != root2;
	}

	/** Merge two subtrees.
	 * 'b' group is attached to 'a' group, which means that the leader of 'a' group goes to the leader of the merged group. */
	public void UNION(int a, int b) {
		// fill your code
		int root1 = FIND_pathCompression(a);
		int root2 = FIND_pathCompression(b);
		if (differ(root1, root2) == true) {
			Parent[root2] = root1;
		}
	}

	/** Find the root node and connect the curr node to root directly. **/
	public Integer FIND_pathCompression(Integer curr) {
		// fill your code
		// must use path compression
		if (Parent[curr] == null) {
			return curr;
		} else {
			Parent[curr] = FIND_pathCompression(Parent[curr]);
			return Parent[curr];
		}
	}
	
	/** Find the root of the curr’s tree. No path compression */
	public Integer FIND(Integer curr) {
		// fill your code
		// without path compression
		if (Parent[curr] == null) {
			return curr;
		} else {
			while (Parent[curr] != null) {
				curr = Parent[curr];
			}
			return curr;
		}
	}
}
