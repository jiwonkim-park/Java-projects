package ds.bst;

import ds.list.SingleLinkedList;

public class GradeSearch {
	private BinaryTree bst;
	private int studentsNum;
	private SingleLinkedList gradeList;
	
	public GradeSearch(){
			
		// fill your code
		bst = new BinaryTree();
		studentsNum = bst.size();
		gradeList = new SingleLinkedList();

	}
	
    // Implement more constructors HERE
	
	public void add(String name, int grade){
		
		// fill your code
		bst.insert(name, grade); //insert to tree
		studentsNum++;
	}
	
	public int remove(String name){
		// fill your code
		int find = bst.find(name);
		int removed = 0;
		if (find == -1) {
			removed = -1;
		} else {
			removed = bst.remove(name);
			studentsNum--;
			
		}
		return removed;
		
	}
	
	public int get(String name){
		
		// fill your code
		int getScore = bst.find(name);
		if (getScore == -1) {
			return -1; 
		} else {
			return getScore;
		}
	}
	
	public int size(){
		
		// fill your code

		return bst.size();
	}
	
	public void order(){

		// fill your code
		gradeList.clear();
		bst.inorder(gradeList);
		if (studentsNum > 0) {
			gradeList.moveToStart();
			for (int i = 0; i < gradeList.length(); i++) {
				String name = gradeList.getValue();
				int grade = bst.find(name);
				System.out.println("ORDER: " + name + " " + grade);
				gradeList.next();
			}
		}

	}
	
	public String first(){
		
		// fill your code
		gradeList.clear();
		bst.inorder(gradeList);
		if (bst.root == null) {
			return null;
		} else {
			gradeList.moveToStart();
			String name = gradeList.getValue();
			int grade = bst.find(name);
			return (name + " " + grade);
		}
	}
	
	public String last(){
		
		// fill your code
		gradeList.clear();
		bst.inorder(gradeList);
		if (bst.root == null) {
			return null;
		} else {
			gradeList.moveToEnd();
			gradeList.prev();
			String name = gradeList.getValue();
			int grade = bst.find(name);
			return (name + " " + grade);
		}

	}
	
	public int range(String from, String to){
		
		// fill your code
		int numInRange = bst.rangeSearch(from, to);
		return numInRange;
	}
	
    // Implement more functions HERE

}
