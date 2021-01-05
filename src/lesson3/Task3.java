package lesson3;

public class Task3 {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd'};
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[chars.length - i - 1];

        }
        System.out.println(result);
    }
}
