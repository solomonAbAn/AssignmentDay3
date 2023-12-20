package Pack1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2)	Write a Java program that calculates the area of different shapes using methods. 
		//Implement methods for calculating the area of a rectangle, circle, and triangle. 
		//The methods should take necessary parameters and return the area. In the `main` method, call these methods with appropriate values.
		
		System.out.println("what shape do you want to calculate its are? rectang? circle? or triangle? ");
		Scanner kb = new Scanner(System.in);
		
		String dimensions = kb.nextLine();
		
		
		switch (dimensions) {
        
		
			//rectangle
		case "rectangle":
            System.out.println("give me the length ");
        	int length = kb.nextInt();
        	System.out.println("give me the width ");
            int width = kb.nextInt();
        	System.out.println("area = " + rect(length, width));
            break;
        
            
            //triangle
		case "triangle":
            System.out.println("give me the base ");
        	int base = kb.nextInt();
        	System.out.println("give me the height ");
            int height = kb.nextInt();
        	System.out.println("area = " + tri(base, height));
            break;
        
            
            //circle
		case "circle":
            System.out.println("give me the radius ");
        	int radius = kb.nextInt();
        	System.out.println("area = " + circ(radius));
            break;        
            
            //default
        default:
            System.out.println("Invalid operation.");
    }
		
		
		
	

    kb.close();
		
	}
	 
	

	public static double rect(double length, double width) {
	        return length * width;
	    }

	    public static double tri(double base, double height) {
	        return (base * height)/2;
	    }

	    public static double circ(double radius) {
	        return radius*radius*13.14;
	    }

	
	       
	        


	    
	    
	    
	    
	    
	    
	    
	    
	    
	    }
	
