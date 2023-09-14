/*
* Lab <Lab 2>
* Description: <Create a Bmi Calculator using scanners! >
* Name: <Shahriz Malek>
* ID: <920378989>
* Class: CSC 211-<02>
* Semester: <Spring 2020>
*/

import java.util.Scanner; 

public class BmiCalculator {
    public static void main(String[] args){
        System.out.println("Welcome to my Bmi Calculator!");
        Scanner input = new Scanner(System.in);
        
        double bmi; 
        int weight; 
        double height;         
        
        System.out.print("Enter Your weight in Kilogram: ");
        weight = input.nextInt();
        
        System.out.print("Enter your height in meters: ");
        height = input.nextDouble(); 
        
        bmi = weight / (height * height); // Calculating the bmi with math
        int bmiCast = (int) bmi; // Casting the double variable to an int 

        System.out.println("Your Weight is: " + weight + "kg"); // Printing out the weight 
        System.out.println("Your height is: " + height + "m"); // Printing out the height
        System.out.println("Your bmi is: " + bmi + "kg/m2"); // Printing out the calculated bmi
        System.out.println("---------------------------------------------");
        System.out.println("Your bmi has been casted to an int: " + bmiCast + "kg/m2"); // Making it so it is an int instead of double
        
    }
}
