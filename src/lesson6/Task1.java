package lesson6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите стороны треугольника3");
        Scanner scaner=new Scanner(System.in);
        double sideA=scaner.nextDouble();
        double sideB=scaner.nextDouble();
        double sideC=scaner.nextDouble();
        System.out.println(MathUtils.areaOfTriangle(sideA,sideB,sideC));
        System.out.println();

        int[] array={3,6,1,2,8,14,9};
        MathUtils.arrayOfEvenNumbers(array);
        System.out.println();

        System.out.println("Введите числитель1");
        double numenator1= scaner.nextDouble();
        System.out.println("Введите числитель2");
        double numenator2= scaner.nextDouble();
        System.out.println("Введите знаменатель1");
        double denumenator1= scaner.nextDouble();
        System.out.println("Введите знаменатель2");
        double denumenator2= scaner.nextDouble();
        System.out.println(MathUtils.sumOfFructons(numenator1,numenator2,denumenator1,denumenator2));
    }
}
