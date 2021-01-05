package lesson7;

public class Task {
    public static void main(String[] args) {
        Trapezoid trapezoid1 = new Trapezoid();
        trapezoid1.setDownBase(3);
        trapezoid1.setUpperBase(6);
        trapezoid1.setRightSide(4);
        trapezoid1.setLeftSide(5);
        Trapezoid trapezoid2 = new Trapezoid();
        trapezoid2.setDownBase(6);
        trapezoid2.setUpperBase(3);
        trapezoid2.setRightSide(4);
        trapezoid2.setLeftSide(5);
        if (trapezoid1.equally(trapezoid2)) {
            System.out.println("эти трапеции равны");
        } else {
            System.out.println("эти трапеции неравны");
        }

        System.out.printf("Площадь трапеции1: %f. Площадь трапеции2: %f \n", trapezoid1.area(), trapezoid2.area());
        System.out.printf("Периметр трапеции1: %f. Периметр трапеции2: %f \n", trapezoid1.perimeter(), trapezoid2.perimeter());
        trapezoid1.typeOfTrapezoid();
        trapezoid2.typeOfTrapezoid();

        Ellipse ellips = new Ellipse();
        ellips.setHalfAxisB(3);
        ellips.setHalfAxisA(5);
        System.out.println("Площадь эллипса: " + ellips.area());
        System.out.println("Периметр эллипса: " + ellips.perimeter());


        Rectangle rectangle = new Rectangle();
        rectangle.setSideB(5);
        rectangle.setSideA(2);
        System.out.println("площадь прямоугольника: " + rectangle.area());
        System.out.println("периметр прямоугольника: " + rectangle.perimeter());
    }
}
