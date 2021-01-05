package lesson7;

public class Main1 {
    public static void main(String[] args) {
        Triangle triangle1= new Triangle();
        Triangle triangle2= new Triangle();
        triangle1.setSideA(3);
        triangle1.setSideB(3);
        triangle1.setSideC(3);
        triangle2.setSideA(4);
        triangle2.setSideB(4);
        triangle2.setSideC(4);
        System.out.println(triangle1.area());
        triangle1.typeOfTriangle();

    }
}
