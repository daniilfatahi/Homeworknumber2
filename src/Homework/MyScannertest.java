package Homework;

import java.util.Scanner;

public class MyScannertest {

    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        System.out.println(("Введите год сейчас"));
        int year = inScanner.nextInt();
        System.out.println("Как давно родился Ваш друг?");
        int old = inScanner.nextInt();

        System.out.println("Ваш друг родился в: " + (year - old));
    }
}

