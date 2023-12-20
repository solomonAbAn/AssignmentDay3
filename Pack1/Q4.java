package Pack1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4)Write a Java program that calculates the factorial of a given number using
		// a method.
		// Define a method called `calculateFactorial` that takes an integer parameter
		// and returns its factorial. In the `main` method,
//input a number and call the `calculateFactorial` method to display the result.

		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = kb.nextInt();
		
		System.out.println("the factorial of " + num + " would be: " + calculateFactorial(num));
		kb.close();
	
	
		
	}
	
	public static double calculateFactorial(double num) {
        double factorial = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i; // factorial = factorial * i 
            }
        }

        return factorial;
    }
}