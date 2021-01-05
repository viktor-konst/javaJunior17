package lesson4;

public class HardTask3 {
    public static void main(String[] args) {
        int[][] units= new int[4][7];
        for (int i = 0; i < units.length; i++) {
            for (int j = 0; j < units[i].length; j++) {
                if (j >= units[i].length / 2 - i  && j <= units[i].length / 2 + i) {
                    System.out.print(units[i][j] + "   ");
                } else System.out.print("    ");
            }
            System.out.println();
        }
    }
}
