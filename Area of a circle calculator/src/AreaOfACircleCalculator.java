/*Authors: Uche Peter Onyedikachi 20211286242
 *Uchendu Samuel Chinaegbomkpam 20211261792
 * Uche Victory Chinaza 20211264432
 * Uche Chibueze Favour 20211278052
 * Udeh Grace Ezekiel 20211293132
 * Tochukwu Godsfavour Chikamnele 20211272042
 *  
 * Program to calculate the Area of a circle and of a sector of 65 degrees.
 */

import java.util.Scanner;

public class AreaOfACircleCalculator {
    public static void main(String[] args) {
        Scanner radiusInput = new Scanner(System.in);

        // Welcome the user
        System.out.println("Welcome to group ... assignment!!!");
        // Prompt for the radius
        System.out.println("Enter the radius of the circle:");
        // Capture and store the number
        int radius = radiusInput.nextInt();
        
        // Contants pi and angle value
        double pi = 3.142;
        int angleOfTheSector = 65;
        // Formula to perform the operaation
        double areaOfTheCircle = pi * Math.pow(radius, 2);
        double areaOfTheSector = (angleOfTheSector / 360) * pi * Math.pow(radius, 2);

        // Print the answers
        System.out.println("The Area of the Circle = " + areaOfTheCircle);
        System.out.println("The Area of the sector = " + areaOfTheSector);

        System.out.println("End!!");
    }
}
