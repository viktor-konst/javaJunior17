package lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result=TextUtils.countVowel("rgEGEWEWFESFDSgREHEAGFdfshdz");
        System.out.println(result);
        Scanner scanner= new Scanner(System.in);
        String text = scanner.nextLine();
        String newText=TextUtils.coding(text);
        System.out.println(newText);
        System.out.println(TextUtils.deCoding(newText));
    }

}
