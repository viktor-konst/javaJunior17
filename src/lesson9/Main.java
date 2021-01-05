package lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите количество строк: ");
        Scanner scanner =new Scanner(System.in);
        int colRows = scanner.nextInt();
        System.out.println("введите количество колонок:");
        int colCol =scanner.nextInt();
        System.out.println("введите количество мин:");
        int colMines =scanner.nextInt();

        MineField mineField= new MineField(colRows,colCol);
        mineField.addMinesToField(colMines);

        System.out.println("------------ игоровое поле --------------------");
       //mineField.printField();
       mineField.printFinal();
    }
}
