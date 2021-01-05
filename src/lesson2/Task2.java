package lesson2;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 4, 8, 7};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
