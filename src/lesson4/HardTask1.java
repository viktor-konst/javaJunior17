package lesson4;

public class HardTask1 {
    public static void main(String[] args) {
        int[][] units = new int[9][7];
        for (int i = 0; i < units.length / 2; i++) {

            for (int j = 0; j < units[i].length; j++) {
                if (j <= units[i].length / 2 + i && j >= units[i].length / 2 - i) {
                    System.out.print(units[i][j] + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = units.length / 2; i < units.length; i++) {
            for (int j = 0; j < units[i].length; j++) {
                if (j < units[i].length / 2 - i + units.length && j > i + units[i].length / 2 - units.length) {
                    System.out.print(units[i][j] + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }

}

