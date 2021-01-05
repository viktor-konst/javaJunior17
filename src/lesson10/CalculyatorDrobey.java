package lesson10;

public class CalculyatorDrobey implements FractionNumberOperation {

    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        // a= 5/6
        // b= 2/4
        int obshiZnamenatel = a.getDivisor() * b.getDivisor();
        int obshiChislitel = a.getDividend() * b.getDivisor() + a.getDivisor() * b.getDividend();
        DrpbnoeChislo result = new DrpbnoeChislo();
        result.setDivisor(obshiZnamenatel);
        result.setDividend(obshiChislitel);
        return result;
    }

    public FractionNumber socrachenie(FractionNumber a) {
        int nod = 1;
        int dividend = a.getDividend();
        int divisor = a.getDivisor();
        if (dividend <= divisor) {
            for (int i = 2; i <= dividend; i++) {
                if (dividend % i == 0 && divisor % i == 0) {
                    nod = i;
                }
            }

        } else {
            for (int i = 2; i <= divisor; i++) {
                if (dividend % i == 0 && divisor % i == 0) {
                    nod = i;
                }

            }
        }
        DrpbnoeChislo result = new DrpbnoeChislo();
        result.setDividend(dividend/nod);
        result.setDivisor(divisor/nod);
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        int obshiZnamenatel = a.getDivisor() * b.getDivisor();
        int obshiChislitel = a.getDividend() * b.getDivisor() - a.getDivisor() * b.getDividend();
        DrpbnoeChislo result = new DrpbnoeChislo();
        result.setDivisor(obshiZnamenatel);
        result.setDividend(obshiChislitel);
        return result;

    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        int obshiZnamenatel = a.getDivisor() * b.getDivisor();
        int obshiChislitel = a.getDividend() * b.getDividend();
        DrpbnoeChislo result = new DrpbnoeChislo();
        result.setDivisor(obshiZnamenatel);
        result.setDividend(obshiChislitel);
        return result;

    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        int obshiZnamenatel = a.getDivisor() * b.getDividend();
        int obshiChislitel = a.getDividend() * b.getDivisor();
        DrpbnoeChislo result = new DrpbnoeChislo();
        result.setDivisor(obshiZnamenatel);
        result.setDividend(obshiChislitel);
        return result;
    }
}
