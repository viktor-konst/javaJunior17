package lesson4;

public class Main2 {
    public static void main(String[] args) {
        int[][] chessDesk = new int[8][8];
        for (int i = 0; i < chessDesk.length; i++) {

            if (i % 2 == 1) {
                for (int j = 0; j < chessDesk[i].length; j += 2) {
                    chessDesk[i][j] = 1;
                }
            } else {
                for (int j = 1; j < chessDesk[i].length; j += 2) {
                    chessDesk[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < chessDesk.length; i++) {
            for (int j = 0; j < chessDesk[i].length; j++) {
                System.out.print(chessDesk[i][j] + " ");

            }
            System.out.println();
        }

    }
}
