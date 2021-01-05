package lesson4;

public class HardTask1new {
    public static void main(String[] args) {
        int[][] units = new int[18][18];
        if (units.length % 2 == 1) {
            for (int i = 0; i < units.length; i++) {
                for (int j = 0; j < units[i].length; j++) {
                    if (((i < units.length / 2 && j < units[i].length / 2) && (j >= units[i].length / 2 - i ))
                            || ((i < units.length / 2 && j >= units[i].length / 2) && (j <= units[i].length / 2 + i))
                            || ((i >= units.length / 2 && j < units[i].length / 2) && (j >= i - units[i].length / 2))
                            || ((i >= units.length / 2 && j >= units[i].length / 2) && (j < units[i].length - i + units[i].length / 2))) {
                        System.out.print(units[i][j] + "   ");
                    } else System.out.print("    ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < units.length; i++) {
                for (int j = 0; j < units[i].length; j++) {
                    if (((i < units.length / 2 && j < units[i].length / 2) && (j >= units[i].length / 2 - i - 1))
                            || ((i < units.length / 2 && j >= units[i].length / 2) && (j <= units[i].length / 2 + i))
                            || ((i >= units.length / 2 && j < units[i].length / 2) && (j >= i - units[i].length / 2))
                            || ((i >= units.length / 2 && j >= units[i].length / 2) && (j < units[i].length - i + units[i].length / 2))) {
                        System.out.print(units[i][j] + "   ");
                    } else System.out.print("    ");
                }
                System.out.println();
            }

        }
    }
}
