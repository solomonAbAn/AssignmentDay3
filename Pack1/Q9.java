package Pack1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create a Java program that validates passwords based on certain criteria. 
		//Define a method named `isPasswordValid` that takes a string parameter (password) and returns a boolean indicating whether the password is valid. 
		//In the `main` method, test the function with different passwords.
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (isPasswordValid(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }

        scanner.close();
    }

    public static boolean isPasswordValid(String password) {
        

        
        if (password.length() < 8) {
            return false;
        }

        
        boolean containsLetter = false;
        boolean containsNumber = false;

        ///
    }
}