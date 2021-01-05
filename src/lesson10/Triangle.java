package lesson10;

public class Triangle implements Figures {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC){
       this.sideA=sideA;
       this.sideB=sideB;
       this.sideC=sideC;
    }

    public double area() {
        return Math.sqrt(this.perimeter() / 2 * (this.perimeter() / 2 - sideB) * (this.perimeter() / 2 - sideC) * (this.perimeter() / 2 - sideA));
    }

    @Override
    public double perimeter() {
        return sideA + sideC + sideB;
    }
}
