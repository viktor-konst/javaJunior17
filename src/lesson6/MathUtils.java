package lesson6;

public class MathUtils {
    public static String areaOfTriangle(double sideA, double sideB, double sideC) {
        if (sideA >= sideB + sideC || sideB >= sideC + sideA || sideC >= sideA + sideB) {
            return "Треугольника с такими сторонами не существует";
        } else {
            return ("Площадь треугольник= " + Math.sqrt((sideA / 2 + sideB / 2 + sideC / 2) * (sideA / 2 + sideB / 2 - sideC / 2) * (sideA / 2 - sideB / 2 + sideC / 2) * (sideC / 2 + sideB / 2 - sideA / 2)));
        }
    }

    public static void arrayOfEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
    public static double sumOfFructons (double numerator1,double numerator2, double denominator1,double denominator2){
       double sum=(numerator1/denominator1)+(numerator2/denominator2);
        return sum;
    }
}
