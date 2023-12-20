package Pack1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1)Create a Java program that implements a simple calculator using methods. 
		//Define methods for addition, subtraction, multiplication, and division. 
		//Take two numbers as parameters and return the result. In the `main` method, demonstrate the use of each operation.
		
		
		System.out.println("Please give me two numbers:");

        Scanner kb = new Scanner(System.in);
        double x = kb.nextDouble();
        double y = kb.nextDouble();
        
        System.out.println("What operation would you like to perform? (addition, subtraction, multiplication, division):");
        kb.nextLine(); 
        String command = kb.nextLine();

        switch (command) {
            case "addition":
                System.out.println("Result: " + add(x, y));
                break;
            case "subtraction":
                System.out.println("Result: " + sub(x, y));
                break;
            case "multiplication":
                System.out.println("Result: " + mult(x, y));
                break;
            case "division":
                System.out.println("Result: " + div(x, y));
                break;
            default:
                System.out.println("Invalid operation.");
        }

        kb.close();
	}
	 public static double add(double x, double y) {
	        return x + y;
	    }

	    public static double sub(double x, double y) {
	        return x - y;
	    }

	    public static double mult(double x, double y) {
	        return x * y;
	    }

	    public static double div(double x, double y) {
	       
	            return x / y;
	       
	        }
	    }
	
