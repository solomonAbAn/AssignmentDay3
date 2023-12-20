package Pack1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Implement a Java program that generates the Fibonacci series up to a specified limit. 
		//Create a method named `generateFibonacci` that takes an integer parameter (limit) and prints the Fibonacci series up to that limit. 
		//In the `main` method, test the function with different limits.
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the limit for Fibonacci series: ");
	        int limit = scanner.nextInt();

	        System.out.println("Fibonacci series up to " + limit + ":");
	        generateFibonacci(limit);

	        scanner.close();
	    }

	    public static void generateFibonacci(int limit) {
	        int firstNum = 0, secondNum = 1;

	        while (firstNum <= limit) {
	            System.out.print(firstNum + " ");

	            int nextNum = firstNum + secondNum;
	            firstNum = secondNum;
	            secondNum = nextNum;
	        }
	    }
	}