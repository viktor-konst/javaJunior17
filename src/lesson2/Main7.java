package lesson2;

public class Main7 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 0, 9, 5, 3, 1, 7, 48, 657};
        System.out.println(numbers[9]);
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
