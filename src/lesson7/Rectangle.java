package lesson7;

public class Rectangle {
    private double sideA;
    private double sideB;


    public void setSideA(double side) {
        sideA = side;
    }

    public void setSideB(double side) {
        sideB = side;
    }


    public double perimeter() {
        double p = (sideA + sideB) * 2;
        return p;
    }

    public double area() {
        double s = sideA * sideB;
        return s;
    }

    public boolean equally(Rectangle secondRectangle) {
        if ((sideB == secondRectangle.sideB || sideB == secondRectangle.sideA) && (sideA == secondRectangle.sideB || sideA == secondRectangle.sideA)) {
            return true;
        } else {
            return false;
        }
    }

}
