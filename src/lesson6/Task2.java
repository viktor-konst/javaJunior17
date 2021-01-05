package lesson6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scaner= new Scanner(System.in);
        System.out.println("Введите текст:");
        String text=scaner.nextLine();
        System.out.println(StringUtils.revers(text));

        System.out.println("Введите текст:");
        String testText=scaner.nextLine();
        System.out.println(StringUtils.countSoglasnie(testText));
    }
}
