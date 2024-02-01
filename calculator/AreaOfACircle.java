/**Authors: Amam Pince, Anayochukwu John-Bosco, Amaobi Victor
 * A Program to calculate the Area of Circle and a sector of 65 deg.
 */
package calculator;

import java.util.Scanner;

/**Class to set values for the AreaOfACircle object
 * 
 */
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
		this.pi = 3.141;
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
	
	private double areaOfTheCircle() {
		return pi * Math.pow(radiusOfTheCircle, 2);
	}
	
	private double areaOfTheSector() {
		return (angle/2) * Math.pow(radiusOfTheCircle, 2);
	}
	
	public static void main(String[] args) {
		AreaOfACircle areaOfACircle = new AreaOfACircle(0, 0.0, 0.0, 0.0, 0.0);
		
		areaOfACircle.setValuesFromInput();
		
		System.out.println("Area of the circle is: " + areaOfACircle.areaOfTheCircle);
		System.out.println("Area of the given sector is: " + areaOfACircle.areaOfTheSector);
		System.out.println("End of operation");
	}

}
