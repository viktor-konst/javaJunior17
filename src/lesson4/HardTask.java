package lesson4;

public class HardTask {
    public static void main(String[] args) {
        int[][] units = new int[7][7];
        for (int i = 0; i < units.length; i++) {
            if (i <= units.length / 2 ) {
                for (int j = 0; j < units[i].length; j++) {
                    if (j <= units[i].length / 2 + i - 1 && j >= units[i].length / 2 - i) {
                        System.out.print(units[i][j]);
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            } else {
                for (int j = 0; j < units[i].length; j++) {
                    if (j <= units[i].length / 2 - i + units.length - 1 && j >= i + units[i].length / 2 - units.length) {
                        System.out.print(units[i][j]);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }

        }

    }
}
