package lesson1;

public class Main3 {
    public static void main(String[] args) {
        int mark = 4;
        switch (mark) {
            case 5:
                System.out.println("отлично!");
                break;
            case 4:
                System.out.println("хорошо!");
                break;
            case 3:
                System.out.println("неочень!");
                break;
            case 2:
                System.out.println("ужас");
                break;
            default:
                System.out.println("это не оценка");
        }
    }
}
