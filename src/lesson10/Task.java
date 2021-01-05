package lesson10;

public class Task {
    public static void main(String[] args) {
        Triangle triangle1 =new Triangle(4,5,2);
        Triangle triangle2 =new Triangle(3,4,2);
        Rectangle rectangle1 = new Rectangle(3,4);
        Rectangle rectangle2 = new Rectangle(2,7);
        Ellipse ellipse1 =new Ellipse(2,5);
        Ellipse ellipse2 =new Ellipse(7,8);
        Figures[] figures={triangle1,triangle2,rectangle1,rectangle2,ellipse1,ellipse2};
        for(Figures figure: figures){
            System.out.println("Площадь равна: "+figure.area());
            System.out.println("Периметр равен: "+figure.perimeter());
        }
    }
}
