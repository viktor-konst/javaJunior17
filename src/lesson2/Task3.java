package lesson2;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 4, 8, 7};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
    }
}
