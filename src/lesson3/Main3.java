package lesson3;

public class Main3 {
    public static void main(String[] args) {
        String password = "qwertyвравкваря";
        if (password.length() < 8) {
            System.out.println("Слабый пароль");
            return;
        }

        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0' || chars[i] == '1' || chars[i] == '2' || chars[i] == '3' || chars[i] == '4' || chars[i] == '5' || chars[i] == '6' || chars[i] == '7' || chars[i] == '8' || chars[i] == '9') {
                System.out.println("Сильный пароль");
                return;
            }
        }
        System.out.println("средний пароль");

    }
}
