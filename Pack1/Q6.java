package Pack1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a Java program that calculates the distance between two points in a 2D plane. 
		//Define a method named `calculateDistance` that takes the coordinates of two points as parameters and returns the distance between them. 
		//In the `main` method, test the function with different points.
	        Scanner kb = new Scanner(System.in);

	        System.out.println("Enter the coordinates of the first point:");
	        System.out.print("x1: ");
	        double x1 = kb.nextDouble();
	        System.out.print("y1: ");
	        double y1 = kb.nextDouble();

	        System.out.println("Enter the coordinates of the second point:");
	        System.out.print("x2: ");
	        double x2 = kb.nextDouble();
	        System.out.print("y2: ");
	        double y2 = kb.nextDouble();

	        double distance = calculateDistance(x1, y1, x2, y2);

	        System.out.println("The distance between the two points is: " + distance);

	        kb.close();
	    }

	    public static double calculateDistance(double x1, double y1, double x2, double y2) {
	        double deltaX = x2 - x1;
	        double deltaY = y2 - y1;

	        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	    }
	
		
	}



