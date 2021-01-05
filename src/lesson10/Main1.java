package lesson10;

public class Main1 {
    public static void main(String[] args) {
        DrpbnoeChislo chislo1 = new DrpbnoeChislo();
        chislo1.setDividend(49);
        chislo1.setDivisor(27);
        DrpbnoeChislo chislo2 = new DrpbnoeChislo();
        chislo2.setDividend(7);
        chislo2.setDivisor(5);
        CalculyatorDrobey calculator = new CalculyatorDrobey();
        calculator.socrachenie(calculator.add(chislo1, chislo2));
        System.out.println(calculator.socrachenie(calculator.add(chislo1, chislo2)));
        System.out.println(calculator.socrachenie(calculator.sub(chislo1, chislo2)));
        System.out.println(calculator.socrachenie(calculator.mul(chislo1, chislo2)));
        System.out.println(calculator.socrachenie(calculator.div(chislo1, chislo2)));
    }
}
