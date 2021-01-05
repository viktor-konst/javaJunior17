package lesson4;

public class HardTask4 {
    public static void main(String[] args) {
        int[][] units = new int[10][8];
        for (int i = 0; i < units.length - 3; i++) {

            for (int j = 0; j < units[i].length; j++) {
                if ((i == 0 && j <= units[i].length - 3 && j >= 2)
                || ((i > 0 && i < 3) && (j > 0 && j < units[i].length - 1))
                || (i > 2)) {
                    System.out.print(units[i][j] + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for (int i = units.length - 3; i < units.length; i++) {
            for (int j = 0; j < units[i].length; j++) {
                if ((i == units.length - 1 && j <= units[i].length - 3 && j >= 2)
                || ((i <= units.length - 2) && (j > 0 && j < units[i].length - 1))) {
                    System.out.print(units[i][j] + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
