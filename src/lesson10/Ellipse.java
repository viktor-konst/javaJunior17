package lesson10;

public class Ellipse implements Figures {

    private double halfAxisA;
    private double halfAxisB;

    public Ellipse(double halfAxisA, double halfAxisB) {
        this.halfAxisA = halfAxisA;
        this.halfAxisB = halfAxisB;
    }

    public double area() {
        return Math.PI * halfAxisA * halfAxisB;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * Math.sqrt((halfAxisA * halfAxisA + halfAxisB * halfAxisB) / 2);
    }
}
