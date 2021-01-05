package lesson4;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        int[][] numbres = {{2, 3, 5, 6},
                {1, 4, 6, 4},
                {4, 3, 6, 9},
                {1, 7, 2, 7}};
        for (int i = 0; i < numbres.length; i++) {
            for (int j = 0; j < numbres[i].length; j++) {
                if (numbres[i][j] % 2 == 0) {
                    sum += numbres[i][j];
                }

            }
        }
        System.out.println(sum);
    }
}
