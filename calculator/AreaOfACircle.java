/*Authors: Amam Prince 20211268042
 * Anayochukwu John-Bosco
 * Amaobi Victor Chison 20211260402
 * Amaechi Victory Chisom 20211269772
 * Amaechi Henry
 * Amado Christian 20211289962
 * Amaefula Excel 20211260402
 * 
 * A Program to calculate the Area of Circle and a sector of 65 degrees.
 */
package calculator;

import java.util.Scanner;

// Class for the AreaOfACircle object
public class AreaOfACircle {
	int radiusOfTheCircle;
	double areaOfTheCircle;
	double areaOfTheSector;
	final double pi;
	final double angle;
	
	 // Constructor class to instantiate the object
	public AreaOfACircle(int radiusOfTheCircle, double areaOfTheCircle, double areaOfTheSector, double pi, double angle) {
		this.radiusOfTheCircle = radiusOfTheCircle;
		this.areaOfTheCircle  = areaOfTheCircle;
		this.areaOfTheSector = areaOfTheCircle;
		this.pi = 3.142;
		this.angle = 65.0;
	}
	
	//Class to set values from user input using the Scanner class
	public void setValuesFromInput() {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to Group 2 CIT202 IFT Project");
		System.out.println("Input the Value Of The Radius");
		this.radiusOfTheCircle = userInput.nextInt();
		
		this.areaOfTheCircle = areaOfTheCircle();
		this.areaOfTheSector = areaOfTheSector();
	}
	
	// Formula to calculate for the Area of the circle
	private double areaOfTheCircle() {
		return pi * Math.pow(radiusOfTheCircle, 2);
	}
	
	// Formula to calculate for the Area of the sector
	private double areaOfTheSector() {
		return (angle/2) * Math.pow(radiusOfTheCircle, 2);
	}
	
	// Class to create a new object and parse the print values arguments 
	public static void main(String[] args) {
		// Instance/object of the class
		AreaOfACircle areaOfACircle = new AreaOfACircle(0, 0.0, 0.0, 0.0, 0.0);
		
		areaOfACircle.setValuesFromInput();
		
		// print statements
		System.out.println("Area of the circle is: " + areaOfACircle.areaOfTheCircle);
		System.out.println("Area of the given sector is: " + areaOfACircle.areaOfTheSector);
		System.out.println("Calculation Complete!");
	}

}
