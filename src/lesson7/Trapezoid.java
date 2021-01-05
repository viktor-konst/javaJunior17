package lesson7;

public class Trapezoid {
    private double upperBase;
    private double downBase;
    private double leftSide;
    private double rightSide;

    public void setUpperBase(double side) {
        upperBase = side;
    }

    public void setDownBase(double side) {
        downBase = side;
    }

    public void setRightSide(double side) {
        rightSide = side;
    }

    public void setLeftSide(double side) {
        leftSide = side;
    }

    public double perimeter() {
        double p = upperBase + leftSide + downBase + rightSide;
        return p;
    }

    public double high() {
        double h = Math.sqrt(leftSide * leftSide - (((downBase - upperBase) * (downBase - upperBase) + leftSide * leftSide - rightSide * rightSide) / (2 * (upperBase - downBase))) * (((downBase - upperBase) * (downBase - upperBase) + leftSide * leftSide - rightSide * rightSide) / (2 * (upperBase - downBase))));
        return h;
    }

    public double area() {
        double s = (upperBase + downBase) * 0.5 * this.high();
        return s;
    }

    public void typeOfTrapezoid() {
        if (rightSide == leftSide) {
            System.out.println("Это равнобедренная трапеция");
        } else if (this.high() == leftSide || this.high() == rightSide) {
            System.out.println("Это прямоугольная трапеция");
        } else {
            System.out.println("Это разносторонняя трапеция");
        }
    }

    public boolean equally(Trapezoid secondTrapezoid) {
        if ((upperBase == secondTrapezoid.upperBase || upperBase == secondTrapezoid.downBase) &&
                (downBase == secondTrapezoid.downBase || downBase == secondTrapezoid.upperBase)
                && (leftSide == secondTrapezoid.leftSide || leftSide == secondTrapezoid.rightSide)
        && (rightSide==secondTrapezoid.rightSide|| rightSide==secondTrapezoid.leftSide)) {
            return true;
        } else {
            return false;
        }
    }
}
