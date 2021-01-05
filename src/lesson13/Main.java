package lesson13;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(10, 10);
        double[][] data = {{2, 1,3,2,12},
                {2, 2,3,8,9},
                {2,1,4,4,7},
                {5,6,1,5,14},
                {5,6,1,5,2}
               }
                ;
        double[][] data1 = {{-9, 3,3},
                {6, 20,3}, {-1, 0,2},

        };
        Matrix matrix2 = new Matrix(data);
        Matrix matrix3 = new Matrix(data1);
        System.out.println(matrix2.determinant());
        System.out.println(matrix3.determinant());


    }

}
