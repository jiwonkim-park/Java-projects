package ds.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BabyCalculator babyCalculator = new BabyCalculator();
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String command = sc.next();

			if ("ADD".equals(command)) {
				String equation = sc.next();
				// TODO Put your code to enqueue the item
				babyCalculator.murmurAdd(equation);
				System.out.println("RESULT " + babyCalculator.getValue());
			} else if ("SHOW".equals(command)) {
				// TODO Put your code to enqueue the item
				System.out.println("VALUE " + String.valueOf(babyCalculator.getValue()));
			} else if ("CLEAR".equals(command)) {
				// TODO Put your code to enqueue the item
				babyCalculator.setValue(0);
				System.out.println("VALUE CLEARED");
			} else if ("SET".equals(command)) {
				int newValue = sc.nextInt();
				// TODO
				babyCalculator.setValue(newValue);
				System.out.println("VALUE SET TO " + String.valueOf(babyCalculator.getValue()));
			} else if ("EXIT".equals(command)) {
				// TODO
				System.out.println("FINAL VALUE " + String.valueOf(babyCalculator.getValue()));
				return;
			}
		}
		sc.close();
	}
}
