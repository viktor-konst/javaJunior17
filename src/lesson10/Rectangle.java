package lesson10;

public class Rectangle implements Figures {
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB){
        this.sideA=sideA;
        this.sideB=sideB;
    }
    @Override
    public double area() {
        return sideA*sideB;
    }

    @Override
    public double perimeter() {
        return 2*(sideA+sideB);
    }
}
