package lesson7;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;


    public void setSideA(double side) {
        sideA = side;
    }

    public void setSideB(double side) {
        sideB = side;
    }

    public void setSideC(double side) {
        sideC = side;
    }

    public double perimetr() {
        double p = sideA + sideC + sideB;
        return p;
    }

    public double area() {
        double s = Math.sqrt(this.perimetr() / 2 * (this.perimetr() / 2 - sideB) * (this.perimetr() / 2 - sideC) * (this.perimetr() / 2 - sideA));
        return s;
    }

    public void typeOfTriangle() {
        if (sideA == sideB && sideA == sideC && sideB == sideC) {
            System.out.println("Равносторониий треугольник");
        } else if (sideA != sideB && sideA != sideC && sideB != sideC) {
            System.out.println("Разностороний треугольник");
        } else {
            System.out.println(" Равнобедренный треугольник");
        }
    }
}
