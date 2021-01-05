package MyProject;

import java.util.concurrent.ThreadLocalRandom;

public class Game1 {
    int[][] minnoePole;
    boolean[][] visibleField;

    public Game1(int colRows, int colColums) {
        minnoePole = new int[colRows + 2][colColums + 2];
        visibleField = new boolean[colRows + 2][colColums + 2];
    }

    public void addMinesToField(int colMines) {
        for (int i = 0; i < colMines; i++) {
            addRandomMin();
        }
    }

    private void addRandomMin() {
        int row = ThreadLocalRandom.current().nextInt(1, minnoePole.length - 1);
        int roc = ThreadLocalRandom.current().nextInt(1, minnoePole[0].length - 1);
        if (minnoePole[row][roc] != -1) {
            minnoePole[row][roc] = -1;
        } else {
            addRandomMin();
        }
    }

    public void printField() {
        String indexCol = "   ";
        for (int i = 1; i < minnoePole[0].length - 1; i++) {
            indexCol += (i + "  ");
        }
        System.out.println(indexCol);
        for (int i = 1; i < minnoePole.length - 1; i++) {
            System.out.print(i + " ");
            for (int j = 1; j < minnoePole[i].length - 1; j++) {

                if (visibleField[i][j] == true) {
                    System.out.print(" " + minnoePole[i][j] + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public void printFinal() {
        String indexCol = "   ";
        for (int i = 1; i < minnoePole[0].length - 1; i++) {
            indexCol += (i + "  ");
        }
        System.out.println(indexCol);
        for (int i = 1; i < minnoePole.length - 1; i++) {
            System.out.print(i + "  ");
            for (int j = 1; j < minnoePole[i].length - 1; j++) {
                if (minnoePole[i][j] == -1) {
                    System.out.print("*  ");
                } else {
                    System.out.print(minnoePole[i][j] + "  ");
                }

            }
            System.out.println();
        }
    }

    public void countAndFillMinsNum() {
        for (int i = 1; i < minnoePole.length - 1; i++) {
            for (int j = 1; j < minnoePole[i].length - 1; j++) {
                if (minnoePole[i][j] == -1) {
                    if (minnoePole[i - 1][j - 1] != -1) {
                        minnoePole[i - 1][j - 1] += 1;
                    }
                    if (minnoePole[i - 1][j] != -1) {
                        minnoePole[i - 1][j] += 1;
                    }
                    if (minnoePole[i - 1][j + 1] != -1) {
                        minnoePole[i - 1][j + 1] += 1;
                    }
                    if (minnoePole[i][j - 1] != -1) {
                        minnoePole[i][j - 1] += 1;
                    }
                    if (minnoePole[i][j + 1] != -1) {
                        minnoePole[i][j + 1] += 1;
                    }
                    if (minnoePole[i + 1][j - 1] != -1) {
                        minnoePole[i + 1][j - 1] += 1;
                    }
                    if (minnoePole[i + 1][j] != -1) {
                        minnoePole[i + 1][j] += 1;
                    }
                    if (minnoePole[i + 1][j + 1] != -1) {
                        minnoePole[i + 1][j + 1] += 1;
                    }
                }
            }

        }
    }

    private boolean outOfBounds(int x, int y) {
        return x < 1 || y < 1 || x >= minnoePole.length - 1 || y >= minnoePole[0].length - 1;

    }

    public void openCell(int x, int y) {
        if (outOfBounds(x, y)) return;
        if (visibleField[x][y]) return;
        visibleField[x][y] = true;
        if (minnoePole[x][y] != 0) return;
        openCell(x - 1, y - 1);
        openCell(x - 1, y + 1);
        openCell(x + 1, y - 1);
        openCell(x + 1, y + 1);
        openCell(x - 1, y);
        openCell(x + 1, y);
        openCell(x, y - 1);
        openCell(x, y + 1);
    }

    public boolean gameOver(int x, int y) {
        if (minnoePole[x][y] == -1) {
            return true;
        }
        return false;
    }
    public boolean continueGame(int colMines){
       int quantity=0;
        for (int i=1;i<visibleField.length-1;i++){
            for (int j=1;j<visibleField[1].length;j++){
                if(visibleField[i][j]){
                    quantity+=1;
                }
            }
        }
        int allCells=(visibleField.length-2)*(visibleField[1].length-2)-colMines;
        if (quantity<allCells){
            return true;
        }else {
            return false;
        }
    }

}

