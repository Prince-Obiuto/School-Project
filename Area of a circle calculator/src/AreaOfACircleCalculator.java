/*
 *
 * 
 * 
 * 
 * 
 *  
 * Program to calculate the Area of a circle and a sector of 65 degrees.
 */

import java.util.Scanner;

public class AreaOfACircleCalculator {
    public static void main(String[] args) {
        Scanner radiusInput = new Scanner(System.in);
        System.out.println("Welcome to group ... assignment!!!");
        System.out.println("Enter the radius of the circle:");
        int radius = radiusInput.nextInt();

        double pi = 3.142;
        double areaOfTheCircle = pi * Math.pow(radius, 2);
        int angleOfTheSector = 65;
        double areaOfTheSector = (angleOfTheSector / 2) * Math.pow(radius, 2);

        // Print the answers
        System.out.println("The Area of the Circle = " + areaOfTheCircle);
        System.out.println("The Area of the sector = " + areaOfTheSector);

        System.out.println("End!!");
    }
}
