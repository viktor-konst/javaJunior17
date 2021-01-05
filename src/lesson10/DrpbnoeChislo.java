package lesson10;

public class DrpbnoeChislo implements FractionNumber {
    private int dividend;
    private int divisor;

    @Override
    public void setDividend(int dividend) {
        this.dividend = dividend;
    }

    @Override
    public int getDividend() {
        return dividend;
    }

    @Override
    public void setDivisor(int divisor) throws IllegalArgumentException {
        this.divisor = divisor;
    }

    @Override
    public int getDivisor() {
        return divisor;
    }

    @Override
    public double value() {
        return this.dividend / (double) this.divisor;
    }

    @Override
    public String toString() {
        return this.dividend+"/"+this.divisor;
    }
    }
