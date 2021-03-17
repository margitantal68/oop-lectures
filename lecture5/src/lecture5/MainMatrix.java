package lecture5;

public class MainMatrix {
    public static void main(String [] args){
        Matrix matrix1 = new Matrix( 2, 3);
        matrix1.fillMatrix(6, 10);
        matrix1.printMatrix();
        System.out.println();

        Matrix matrix2 = new Matrix( 2, 3);
        matrix2.fillMatrix(1,5);
        matrix2.printMatrix();
        System.out.println();

        Matrix matrix3 = Matrix.add( matrix1, matrix2);
        matrix3.printMatrix();
        System.out.println();

    }
}
