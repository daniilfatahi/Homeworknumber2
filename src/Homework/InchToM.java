package Homework;
import java.util.Scanner;
public class InchToM {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
       float oneinch = (float) 0.0254;

        System.out.println("Input value in inches");
        int inches = inScanner.nextInt();
        float metres = (float) (inches * oneinch);


        System.out.println(inches + " inch is " + metres + " metres ");





    }
}
