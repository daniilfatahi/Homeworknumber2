package Homework;
import  java.util.Scanner;
import java.math.*;

public class BMI {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter your weight in pounds: ");
        int weight = inScanner.nextInt();
        System.out.println("Enter your height in inches: ");
        int height = inScanner.nextInt();

        double bmi = (weight/Math.pow(height, 2)) * 703;

        System.out.println("Your bmi is: " + bmi);




    }
}
