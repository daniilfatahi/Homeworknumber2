package Homework;
import java.util.Random;
import  java.util.Scanner;
public class Randomiser {

    public static void main(String[] args) {
   Scanner inScanner = new Scanner(System.in);
        Random Rand = new Random();

   System.out.println("Enter first range for randomising: ");
   int r1 = inScanner.nextInt();
        System.out.println("Enter second range for randomising: ");
        int r2 = inScanner.nextInt();

        //Generate random in value in entered borders
        int random_int = (int) Math.floor(Math.random()*(r2-r1+1)+r1);

        System.out.println("Your random int in range " + r1 + " and " + r2 + " is : " + random_int);







    }
}
