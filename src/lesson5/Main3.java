package lesson5;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputEmail = scanner.next();
        String[] splitEmailByDog = inputEmail.split("@");
        if (splitEmailByDog.length != 2) {
            System.out.println("Неверный формат");
            return;
        }
        if (splitEmailByDog[1].indexOf('.') == -1) {
            System.out.println("Неверный формат");
            return;
        }
        if(splitEmailByDog[1].endsWith(".")){
            System.out.println("Неверный формат");
            return;
        }
        if (inputEmail.indexOf("..")!= -1){
            System.out.println(" Ytdthyj" );
        }
        System.out.println("Корректный email");
    }
}
