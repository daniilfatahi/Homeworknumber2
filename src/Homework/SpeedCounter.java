package Homework;
import java.util.Scanner;
public class SpeedCounter {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Enter your distance in meteres: ");
        float metres = inScanner.nextInt();
        System.out.println("Enter how many hours it took: ");
        float hours = inScanner.nextInt();
        System.out.println("Enter how many minutes it took: ");
        float minutes = inScanner.nextInt();
        System.out.println("Enter how many seconds it took: ");
        float secs = inScanner.nextInt();

        float TimeSeconds = (hours * 3600) + (minutes*60)+secs;
        float msspeed = metres/TimeSeconds;
        float kmh = (metres/1000)/(TimeSeconds/3600);

        System.out.println("Your speed in meters/second is: " + msspeed);
        System.out.println("Your speed in km/h " + kmh);




    }
}
