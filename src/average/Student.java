package average;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = keyboardInput.nextLine();
		System.out.println("Enter your surname: ");
		String surname = keyboardInput.nextLine();
		System.out.println("Enter the grade you had in January: ");
		Double grade1 = keyboardInput.nextDouble();
		System.out.println("Enter the grade you had in February: ");
		Double grade2 = keyboardInput.nextDouble();
		System.out.println("Enter the grade you had in March: ");
		Double grade3 = keyboardInput.nextDouble();
		System.out.println("Enter the grade you had in April: ");
		Double grade4 = keyboardInput.nextDouble();
		Double average = ((grade1 + grade2 + grade3 + grade4) / 4);
		System.out.println("Your name is " + name + " " + surname + " and your final grade is: " + average);
	}

}
