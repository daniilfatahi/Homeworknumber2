package Homework;
import java.util.Scanner;
public class MtoYearDays {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        //User enters the number of minutes
       System.out.println("Enter how many minutes you want to convert: ");
       int minutes = inScanner.nextInt();
       //Number of minutes in a year
        int year = minutes / 525600;
        int remainingminutes = minutes % 525600;
        int day = remainingminutes / 1440;

        System.out.println(minutes + " minutes is approx " + year + " years and " + day + " days ");




    }
}
