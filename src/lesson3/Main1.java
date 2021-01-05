package lesson3;

public class Main1 {
    public static void main(String[] args) {
        char[] qwer = {'q', 'w', 'e', 'r'};
        char[] asdf = {'a', 's', 'd', 'f'};
        char[] result = new char[qwer.length + asdf.length];
        for (int i = 0; i < result.length; i++) {
            if (i < qwer.length) {
                result[i] = qwer[i];
            } else result[i] = asdf[i - qwer.length];

        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}
