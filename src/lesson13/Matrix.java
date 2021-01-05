package lesson13;

public class Matrix implements IMatrix {
    private double[][] numbers;

    public Matrix(int colRow, int colCol) {
        numbers = new double[colRow][colCol];
    }

    public Matrix(double[][] data) {
        numbers = data;
    }

    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    public int getColumns() {
        return numbers[0].length;
    }

    @Override
    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (rowIndex < this.getRows() && colIndex < this.getColumns()) {
            return numbers[rowIndex][colIndex];
        }
        System.out.println("Вы указали неверный индекс строки или колонки");
        return 0;
    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (rowIndex < this.getRows() && colIndex < this.getColumns()) {
            numbers[rowIndex][colIndex] = value;
            return;
        }
        System.out.println("Вы указали неверный индекс строки или колонки@");

    }

    @Override
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы неравны");
            return null;
        }
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы неравны");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы неравны");
            return null;
        }
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы неравны");
            return null;
        }
        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        if (this.getColumns() != otherMatrix.getRows()) {
            System.out.println("Эти матрицы нельзя умножать");
            return this;
        }
        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());

        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                for (int n = 0; n < otherMatrix.getRows(); n++) {
                    result.setValueAt(i, j, result.getValueAt(i, j) + this.getValueAt(i, n) * otherMatrix.getValueAt(n, j));
                }


            }
        }
        return result;
    }


    @Override
    public IMatrix mul(double value) {

        Matrix result = new Matrix(this.getRows(), this.getColumns());

        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return result;

    }

    @Override
    public IMatrix transpose() {
        Matrix result = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < result.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(j, i));
            }
        }
        return result;

    }

    @Override
    public void fillMatrix(double value) {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                this.setValueAt(i, j, value);
            }
        }

    }

    private Matrix minor1(int k) {
        Matrix result = new Matrix(this.getRows() - 1, this.getRows() - 1);
        for (int i = 0; i < result.getRows(); i++) {
            for (int j = 0; j < k; j++) {
                result.setValueAt(i, j, this.getValueAt(i + 1, j));

            }
            for (int j = k; j < result.getRows(); j++) {
                result.setValueAt(i, j, this.getValueAt(i + 1, j + 1));

            }
        }
        return result;
    }

    @Override
    public double determinant() {
        if (!this.isSquareMatrix()) {
            System.out.println("Эта матрица не квадратная");
            return 0;
        }


        if (this.getRows() == 1) {
            return this.getValueAt(0, 0);
        }
        if (this.getRows() == 2) {
            return this.getValueAt(0, 0) * this.getValueAt(1, 1) -
                    this.getValueAt(0, 1) * this.getValueAt(1, 0);
        }
        double result = 0;
        for (int i = 0; i < this.getRows(); i++) {
            result = result + Math.pow(-1, 2 + i) * this.getValueAt(0, i) * this.minor1(i).determinant();
        }


        return result;
    }

    @Override
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (this.getValueAt(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }





    @Override
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j) {
                    if (numbers[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (numbers[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public boolean isSquareMatrix() {
        if (this.getRows() == this.getColumns()) {
            return true;
        }
        return false;
    }

    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + " ");
            }
            System.out.println();
        }
    }
}
