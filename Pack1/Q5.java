package Pack1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//5)	 Write a Java program that checks whether a given number is prime or not. 
		//Define a method called `isPrime` that takes an integer parameter and returns a boolean indicating whether the number is prime. 
		//In the `main` method, test the function with different numbers.
		
		
		
		Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = kb.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        kb.close();
    }

    public static boolean isPrime(int num) {
        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        return prime;
    }
}