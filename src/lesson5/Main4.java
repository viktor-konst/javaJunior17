package lesson5;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Выберите фигуру:");
        System.out.println("--Круг");
        System.out.println("--Прямоугольник");
        System.out.println("--Треугольник");
        System.out.println("--Овал");
        Scanner scanner = new Scanner(System.in);
        String inputFigure = scanner.nextLine();
        System.out.println("Площадь или периметр:");
        String inputAction = scanner.nextLine();
        if (inputFigure.equalsIgnoreCase("круг")) {
            System.out.println("Введите радиус");
            String radius = scanner.nextLine();
            Double r = Double.parseDouble(radius);
            if (inputAction.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь круга" + Math.PI * (r * r));
            } else {
                System.out.println("Периметр круга= " + Math.PI * (2 * r));

            }
        }
        if (inputFigure.equalsIgnoreCase("прямоугольник")) {
            System.out.println("Введите длину первой стороны:");
            String sideA = scanner.nextLine();
            System.out.println("Введите длину второй стороны:");
            String sideB = scanner.nextLine();
            Double lenghtA = Double.parseDouble(sideA);
            Double lenghtB = Double.parseDouble(sideB);
            if (inputAction.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь прямоугольника= " + lenghtA * lenghtB);
            } else {
                System.out.println("Периметр прямоугольника= " + (lenghtA + lenghtB) * 2);

            }

        }
        if (inputFigure.equalsIgnoreCase("треугольник")) {
            System.out.println("Введите длину первой стороны:");
            String sideA = scanner.nextLine();
            System.out.println("Введите длину второй стороны сторону:");
            String sideB = scanner.nextLine();
            System.out.println("Введите длину третьей стороны сторону:");
            String sideС = scanner.nextLine();
            Double lenghtA = Double.parseDouble(sideA);
            Double lenghtB = Double.parseDouble(sideB);
            Double lenghtС = Double.parseDouble(sideС);
            if (lenghtA>=lenghtB+lenghtС || lenghtB>=lenghtС+lenghtA || lenghtС>=lenghtA+lenghtB){
                System.out.println(" Треугольника с такими сторонами не существует");
                return;
            }
            if (inputAction.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь треугольник= " + Math.sqrt((lenghtA / 2 + lenghtB / 2 + lenghtС / 2) * (lenghtA / 2 + lenghtB / 2 - lenghtС / 2) * (lenghtA / 2 - lenghtB / 2 + lenghtС / 2) * (lenghtС / 2 + lenghtB / 2 - lenghtA / 2)));
            } else {
                System.out.println("Периметр треугольника= " + (lenghtA + lenghtB + lenghtС));

            }

        }
        if (inputFigure.equalsIgnoreCase("овал")) {
            System.out.println("Введите длину первой полуоси:");
            String sideA = scanner.nextLine();
            System.out.println("Введите длину второй полуоси:");
            String sideB = scanner.nextLine();
            Double lenghtA = Double.parseDouble(sideA);
            Double lenghtB = Double.parseDouble(sideB);
            if (inputAction.equalsIgnoreCase("площадь")) {
                System.out.println("Площадь овала= " + Math.PI * lenghtA * lenghtB);
            } else {
                System.out.println("Периметр овала= " + 2 * Math.PI * Math.sqrt((lenghtA * lenghtA + lenghtB * lenghtB) / 2));

            }

        }
    }
}