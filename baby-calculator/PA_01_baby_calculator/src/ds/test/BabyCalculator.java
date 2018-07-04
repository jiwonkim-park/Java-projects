package ds.test;

import ds.stack.LinkedStack;
import ds.stack.Stack;

public class BabyCalculator {

	// Using java predefined or built-in data structures are not allowed.
	Stack<Character> stack = new LinkedStack<Character>();
	private int value;

	public int murmurAdd(String equation) {
		// TODO Implement this method
		// For ease:
		// * int digit = Character.getNumericValue(c);
		// * if (Character.isDigit(c)) {}
		
		String addition = String.valueOf(this.getValue());
		int firstParIndex = 0;
		int secondParIndex = equation.length();
		while (equation.length() >0) {
			for (int i = 0; i < equation.length(); i++) { //need to check
				if (equation.charAt(i) == '(') {
					firstParIndex = i;
					break;
				}
			}
			
			for (int j = 0; j < equation.length(); j++) {
				if (equation.charAt(j) == ')') {
					secondParIndex = j;
					break;
				}
			}
			
			if (secondParIndex == equation.length()) {
				for (int i = 0; i < equation.length(); i++) {
					stack.push(equation.charAt(i));
				}
				while (!stack.isEmpty()) {
					char popped = stack.pop();
					int addValue = Character.getNumericValue(popped);
					addition += "+" + String.valueOf(addValue);
					value += addValue;
				}
				equation = equation.substring(0,0);
				stack.clear();
			} else {
				for (int k = firstParIndex; k < secondParIndex; k++) {
					stack.push(equation.charAt(k));
				}
				int openParIndex = 0;
				
				while (true) {
					char popped = stack.pop();
					if (popped != '(') {
						openParIndex++;
						int addValue = Character.getNumericValue(popped);
						addition += "+" + String.valueOf(addValue);
						value += addValue;
						continue;
					} else {
						break;
					}
				}
				equation = equation.substring(0, secondParIndex - openParIndex - 1) + equation.substring(secondParIndex + 1, equation.length());
				secondParIndex = equation.length();
				stack.clear();
			}
		}
		System.out.println(addition);
		
		return value;
	}

	public int getValue() {
		// TODO Implement this method
		
		return value;
	}

	public void setValue(int newValue) {
		// TODO Implement this method
		value = newValue;
	}
}
