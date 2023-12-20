package Pack1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Java program that includes methods for converting temperature
		// between Celsius and Fahrenheit.
		// Define two methods, `celsiusToFahrenheit` and `fahrenheitToCelsius`, that
		// take the temperature value as a parameter and return the converted value.
		// In the `main` method, demonstrate the use of these methods.

		System.out.println("what is the temperature (celcius or fahrenheit)? ");
		Scanner kb = new Scanner(System.in);
		double numb = kb.nextDouble();
		 kb.nextLine(); // Consume the newline character
		System.out.println("you want to convert it to c or f? ");
		String degree = kb.nextLine();

		switch (degree) {

		// celcius
		case "c":

			System.out.println("temperature in celcius would be " + celc(numb));
			break;

		// fahrenheit
		case "f":

			System.out.println("temperature in fahrenheit would be " + fah(numb));
			break;

		// default
		default:
			System.out.println("Invalid operation.");
		}

		kb.close();

	}

	public static double celc(double numb) {
		return (numb - 32) * 5 / 9;
	}

	public static double fah(double numb) {
		return (numb + 32) * 9 / 5;
	}

}
