package ds.bst;

import ds.list.SingleLinkedList;

/**
 * A class of a binary tree.
 */
public class BinaryTree {
    /** Head node for this tree */
    BinaryNode root;
    int nodecount;
    SingleLinkedList BTList;
    // Declare more variables HERE

 	/** Constructor */
	public BinaryTree() { 

		// fill your code
		root = null;
		nodecount = 0;
	}
    // Implement more constructors HERE
	
	public BinaryTree(BinaryNode node, int n) {
		root = node;
		nodecount = n;
	}

	/** Reinitialize tree */
	public void clear() { 
		// fill your code
		root = null;
		nodecount = 0;

	}

	/** Insert a record into the tree. */
	public void insert(String name, int grade) {
		
		// fill your code
		root = inserthelp(root, name, grade);
		nodecount++;
		

	}

	/** Remove a record from the tree. */
	public int remove(String name) {
		// fill your code
		int temp = find(name);
		if (temp != 0) { //what about test score = 0?
			root = removehelp(root, name);
			nodecount--;
		}
		return temp;

	}


	/** @return Record with key value k, null if none exist. */
	public int find(String name) { 
		// fill your code
		return findhelp(root,name);
	}

	/** @return The number of records. */
	public int size() { 
		
		// fill your code
		return nodecount; 
	}
	private int findhelp(BinaryNode rt, String name) {

		// fill your code
		if (rt == null) {
			return -1;
		} else {
			if (rt.getKey().compareTo(name) > 0) {
				return findhelp(rt.getLeft(), name);
			} else if (rt.getKey().compareTo(name) < 0) {
				return findhelp(rt.getRight(), name);
			} else {
				return rt.getElement();
			}
		}
				
	}

	public void inorder(SingleLinkedList list) { 
		inorderHelper(root, list); 
	}
	
	private void inorderHelper(BinaryNode rt, SingleLinkedList list){

		// fill your code
		if (rt == null) {
			return;
		} else {
			inorderHelper(rt.getLeft(), list);
			list.insert(rt.getKey());
			list.next();
			inorderHelper(rt.getRight(), list);
		}

		
	}
	
	public int rangeSearch(String from, String to) { 
		return rangeSearchHelper(root, from, to); 
	}
	
	private int rangeSearchHelper(BinaryNode rt, String from, String to){
		
		// fill your code
		int rangeNum = 0;
		if (rt == null) {
			return rangeNum = 0;
		} else {
			if (rt.getKey().compareTo(from) < 0) {
				rangeNum += rangeSearchHelper(rt.getRight(), from, to);
			} else if ((rt.getKey().compareTo(from) >= 0) && (rt.getKey().compareTo(to) <= 0)) {
				rangeNum++;
				rangeNum += rangeSearchHelper(rt.getLeft(), from, to) + rangeSearchHelper(rt.getRight(), from, to);
			} else {
				rangeNum += rangeSearchHelper(rt.getLeft(), from, to);
			}
			return rangeNum;
		}
		
	}
	
	
	/** @return The current subtree, modified to contain
 the new item */
	private BinaryNode inserthelp(BinaryNode rt, String name, int grade) {
	
		// fill your code
		if (rt == null) {
			return new BinaryNode(name, grade);
		} else {
			if (rt.getKey().compareTo(name) > 0) {
				rt.setLeft(inserthelp(rt.getLeft(), name, grade));
			} else {
				rt.setRight(inserthelp(rt.getRight(), name, grade));
			}
			return rt;
		}
		
	}
	
	/** Remove a node with key value k
  @return The tree with the node removed */
	private BinaryNode removehelp(BinaryNode rt, String name) {
		if (rt == null) {
			return null;
		} else {
			if (rt.getKey().compareTo(name) > 0) {
				rt.setLeft(removehelp(rt.getLeft(), name));
			} else if (rt.getKey().compareTo(name) < 0) {
				rt.setRight(removehelp(rt.getRight(), name));
			} else {
				if (rt.getLeft() == null) {
					return rt.getRight();
				} else if (rt.getRight() == null) {
					return rt.getLeft();
				} else {
					BinaryNode temp = getmin(rt.getRight());
					rt.setElement(temp.getElement());
					rt.setKey(temp.getKey());
					rt.setRight(deletemin(rt.getRight()));
				}
			} return rt;
		}
		
	}
	
	private BinaryNode getmin(BinaryNode rt) {
		// fill your code
		if (rt.getLeft() == null) {
			return rt;
		} else {
			return getmin(rt.getLeft());
		}
	}
	
	private BinaryNode deletemin(BinaryNode rt) {
		if (rt.getLeft() == null) {
			return rt.getRight();
		} else {
			rt.setLeft(deletemin(rt.getLeft()));
			return rt;
		}
	}
	


    // Implement more functions HERE
}
