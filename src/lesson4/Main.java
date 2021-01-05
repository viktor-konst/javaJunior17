package lesson4;

public class Main {
    public static void main(String[] args) {
        int[][] numbres = {{2, 3, 5, 6},
                {1, 4, 6, 4},
                {4, 3, 6, 9},
                {1, 7, 2, 8}};

        for (int i = 0; i < numbres.length; i++) {
            for (int j = 0; j < numbres[i].length; j++) {
                System.out.print(numbres[i][j] + " ");

            }
            System.out.println();
        }
    }
}
