package Homework;
import java.util.Scanner;

public class TImeConverter {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        System.out.println("Введите колличество часов, которые хотите перевести в минуты: ");
        int hours = inScanner.nextInt();
        long minutes = hours * 60;
        System.out.println(minutes);



    }
}
