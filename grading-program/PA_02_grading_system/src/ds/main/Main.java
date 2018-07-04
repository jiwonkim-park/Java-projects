package ds.main;
import java.io.StringReader;
import java.util.Scanner;

import ds.bst.GradeSearch;

public class Main {
	private static final int ADD = 0;
	private static final int REMOVE = 1;
	private static final int GET = 2;
	private static final int SIZE = 3;
	private static final int ORDER = 4;
	private static final int FIRST = 5;
	private static final int LAST = 6;
	private static final int RANGE = 7;
	private static final int ERROR = 8;

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		GradeSearch gradeSearch = new GradeSearch();
		
		while(scanner.hasNext()){
			String line = scanner.nextLine();
			Scanner i_scanner = new Scanner(new StringReader(line));
			String cmd = i_scanner.next();
			String name = null;
			int grade = 0;
			
			switch(getCommandNum(cmd)){
			case ADD:
				name = i_scanner.next();
				grade = Integer.parseInt(i_scanner.next());
				
				// fill your code
				gradeSearch.add(name, grade);
				System.out.println("ADD: " + name + " " + grade);
			
				break;
			case REMOVE:
				name = i_scanner.next();

				// fill your code
				int find = gradeSearch.get(name);
				
				if (find == -1) {
					System.out.println("GradeSearch cannot find the student");
				} else {
					gradeSearch.remove(name);
					System.out.println("REMOVE: " + name);
				}
				
				break;
			case GET:
				name = i_scanner.next();

				// fill your code
				
				int get = gradeSearch.get(name);
				if (get == -1) {
					System.out.println("GradeSearch cannot find the student");
				} else {
					System.out.println("GET: " + name + " " + get);
				}
			
				break;
			case SIZE:	

				// fill your code
				System.out.println("CURRENT_SIZE: " + gradeSearch.size());
				
				break;
			case ORDER:

				// fill your code
				if (gradeSearch.size() == 0) {
					System.out.println("GradeSearch does not have any student");
				} else {
					gradeSearch.order();
				}
			
				break;
			case FIRST:

				// fill your code
				String first = gradeSearch.first();
				
				if (first == null) {
					System.out.println("GradeSearch does not have any student");
				} else {
					System.out.println("FIRST: " + gradeSearch.first());
				}
			
				break;
			case LAST:

				// fill your code
				String last = gradeSearch.last();
				if (last == null) {
					System.out.println("GradeSearch does not have any student");
				} else {
					System.out.println("LAST: " + last);
				}
			
				break;
			case RANGE:
				String from = i_scanner.next();
				String to = i_scanner.next();

				// fill your code
				int range = gradeSearch.range(from, to);
				if (range == 0) {
					System.out.println("The range is wrong");
				} else {
					System.out.println("RANGE: " + range);
				}
			
				break;
			case ERROR:
				break;
			}
			
			
			i_scanner.close();
		}
		
		scanner.close();
	}
	
	private static int getCommandNum(String cmd){
		//System.out.println(cmd);
		if(cmd.equals("add"))
			return ADD;
		else if(cmd.equals("remove"))
			return REMOVE;
		else if(cmd.equals("get"))
			return GET;
		else if(cmd.equals("size"))
			return SIZE;
		else if(cmd.equals("order"))
			return ORDER;
		else if(cmd.equals("first"))
			return FIRST;
		else if(cmd.equals("last"))
			return LAST;
		else if(cmd.equals("range"))
			return RANGE;
		return ERROR;
	}

}
