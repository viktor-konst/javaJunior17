package lesson4;

public class Task2 {
    public static void main(String[] args) {
        int[][] numbres = {{2, 3, 5, 6},
                {1, 4, 6, 4},
                {4, 3, 6, 9},
                {1, 7, 2, 8}};
        for (int i = 0; i < numbres.length; i++) {
            for (int j = 0; j < numbres[i].length; j++) {
                if (i == numbres.length-1-j) {
                    System.out.print(numbres[i][j] + " ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
