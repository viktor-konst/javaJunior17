package lesson7;

public class Ellipse {
    private double halfAxisA;
    private double halfAxisB;


    public void setHalfAxisA(double halfAxis) {
        halfAxisA = halfAxis;
    }

    public void setHalfAxisB(double halfAxis) {
        halfAxisB = halfAxis;
    }


    public double perimeter() {
        double p = 2 * Math.PI * Math.sqrt((halfAxisA * halfAxisA + halfAxisB * halfAxisB) / 2);
        return p;
    }

    public double area() {
        double s = Math.PI * halfAxisA * halfAxisB;
        return s;
    }

    public boolean equally(Ellipse secondEllips) {
        if ((halfAxisB == secondEllips.halfAxisB || halfAxisB == secondEllips.halfAxisA) && (halfAxisA == secondEllips.halfAxisA || halfAxisA == secondEllips.halfAxisB)) {
            return true;
        } else {
            return false;
        }
    }
}
