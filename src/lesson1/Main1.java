package lesson1;

public class Main1 {
    public static void main(String[] args) {
        int money = 30000;
        int tripCost = 75000;
        int monthToTrip = 3;
        int salary = 20000;
        int mothlyExpended = 10000;

        int savedMoney = money + monthToTrip * (salary - mothlyExpended);

        if (savedMoney >= tripCost && tripCost < 60000) {
            System.out.println("Поедем");
        } else {
            System.out.println("Не поедем, у нас только " + savedMoney);
        }

    }
}