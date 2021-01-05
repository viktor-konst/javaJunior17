package MyProject;

import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        System.out.println("введите количество строк: ");
        Scanner scanner = new Scanner(System.in);
        int colRows = scanner.nextInt();
        System.out.println("введите количество колонок:");
        int colCol = scanner.nextInt();
        System.out.println("введите количество мин:");
        int colMines = scanner.nextInt();

        Game1 mineField = new Game1(colRows, colCol);
        mineField.addMinesToField(colMines);
        mineField.countAndFillMinsNum();
        System.out.println("------------ игоровое поле --------------------");
        int x = 0;
        int y = 0;
        while (mineField.continueGame(colMines)) {
            mineField.printField();
            System.out.println("введите номер строки:");
            x = scanner.nextInt();
            System.out.println("введите номер столбца:");
            y = scanner.nextInt();
            mineField.openCell(x, y);
            if (mineField.gameOver(x, y)) {
                System.out.println("Вы проиграли =(");
                mineField.printFinal();
                return;
            }

        }
        System.out.println("Победа!!!");
        mineField.printFinal();
    }
}
