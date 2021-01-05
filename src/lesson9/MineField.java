package lesson9;

import java.util.concurrent.ThreadLocalRandom;

public class MineField {
    int[][] minnoePole;
    boolean[][] visibleField;

    public MineField(int colRows, int colColums) {
        minnoePole = new int[colRows][colColums];
        visibleField = new boolean[colRows][colColums];
    }

    public void addMinesToField(int colMines) {
        for (int i = 0; i < colMines; i++) {
            addRandomMin();
        }
    }

    private void addRandomMin() {
        int row = ThreadLocalRandom.current().nextInt(0, minnoePole.length);
        int roc = ThreadLocalRandom.current().nextInt(0, minnoePole[0].length);
        if (minnoePole[row][roc] != -1) {
            minnoePole[row][roc] = -1;
        } else {
            addRandomMin();
        }
    }

    public void printField() {
        String indexCol = "   ";
        for (int i = 0; i < minnoePole[0].length; i++) {
            indexCol += (i + "  ");
        }
        System.out.println(indexCol);
        for (int i = 0; i < minnoePole.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < minnoePole[i].length; j++) {

                if (visibleField[i][j] == true) {
                    System.out.print(minnoePole[i][j] + " ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }

    public void printFinal() {
        String indexCol = "   ";
        for (int i = 0; i < minnoePole[0].length; i++) {
            indexCol += (i + "  ");
        }
        System.out.println(indexCol);
        for (int i = 0; i < minnoePole.length; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < minnoePole[i].length; j++) {
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
        for (int i = 0; i < minnoePole.length; i++) {
            for (int j = 0; j < minnoePole[i].length; j++) {
                if (minnoePole[i][j] == -1) {
                    for (int k = 0; k < 3; k++) {
                      if(i-1>=0 && j-1>=0 && j<minnoePole[i].length-1   ){
                          minnoePole[i-1][j-1+k]+=1;
                      }
                    }
                }

            }
        }
    }
}
