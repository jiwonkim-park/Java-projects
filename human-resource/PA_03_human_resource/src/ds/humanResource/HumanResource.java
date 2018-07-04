package ds.humanResource;

public class HumanResource {
	private ParPtrTree PPT;
	private static final int MAXMEMBER = 100000;
	
	public HumanResource(){
		PPT = new ParPtrTree(MAXMEMBER);
	}
	
	public void Hire(int member, int ability){
		// fill your code
		PPT.setAbility(member, ability);
		PPT.setGroupAbility(member, ability);
		PPT.setGroupSize(member, 1);
	}
	
	public boolean Merge(int member1, int member2){
		// fill your code
		Integer root1 = PPT.FIND(member1);
		Integer root2 = PPT.FIND(member2);
		if (PPT.differ(root1, root2) == true) {
			//Integer groupsize1 = PPT.getGroupSize(root1);
			//Integer groupability1 = PPT.getGroupAbility(root1);
			//Integer groupsize2 = PPT.getGroupSize(root2);
			//Integer groupability2 = PPT.getGroupAbility(root2);
			if (PPT.getGroupAbility(root1) > PPT.getGroupAbility(root2)) {
				
				PPT.addGroupAbility(root1, PPT.getGroupAbility(root2));
				PPT.addGroupSize(root1, PPT.getGroupSize(root2));
				PPT.UNION(member1, member2);
			} else if (PPT.getGroupAbility(root1) < PPT.getGroupAbility(root2)) {
				
				PPT.addGroupAbility(root2, PPT.getGroupAbility(root1));
				PPT.addGroupSize(root2, PPT.getGroupSize(root1));
				PPT.UNION(member2, member1);
			} else {
				if (root1 > root2) {
					
					PPT.addGroupAbility(root2, PPT.getGroupAbility(root1));
					PPT.addGroupSize(root2, PPT.getGroupSize(root1));
					PPT.UNION(member2, member1);
				} else {
					
					PPT.addGroupAbility(root1, PPT.getGroupAbility(root2));
					PPT.addGroupSize(root1, PPT.getGroupSize(root2));
					PPT.UNION(member1, member2);
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	public void AbilityOfPerson(int member){
		// fill your code
		System.out.println(PPT.getAbility(member));
	}
	
	public void DepthOfPerson(int member){
		// fill your code
		System.out.println(PPT.getDepth(member));
	}
	
	public void AbilityOfGroup(int member) {
		// fill your code
		System.out.println(PPT.getGroupAbility(member));
	}
	
	public void SizeOfGroup(int member) {
		//fill your code
		System.out.println(PPT.getGroupSize(member));
	}
}
