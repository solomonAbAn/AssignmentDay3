package Pack1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program that calculates the power of a number. 
		//Define a method named `calculatePower` that takes two parameters (base and exponent) and returns the result. 
		//In the `main` method, test the function with different base and exponent values.
		
	        Scanner kb = new Scanner(System.in);

	        System.out.print("Enter the base: ");
	        double base = kb.nextDouble();

	        System.out.print("Enter the exponent: ");
	        int exponent = kb.nextInt();

	        double result = calculatePower(base, exponent);

	        System.out.println("The result of " + base + " raised to the power of " + exponent + " is: " + result);

	        kb.close();
	    }

	    public static double calculatePower(double base, int exponent) {
	        // Using Math.pow to calculate power
	        return Math.pow(base, exponent);
	    }
	
		
		
		
		
		
	

}
