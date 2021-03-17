package lecture5;

import java.util.Random;

public class Matrix {
//    blank final variable
    private final int rows;
//    blank final variable
    private final int columns;
    private double[][] data;

    public Matrix( int rows, int columns ){
        this.rows = rows;
        this.columns = columns;
        this.data = new double[ rows ][ columns ];
    }

    public void printMatrix(){
        for( int i=0; i<rows; i++){
            for( int j=0; j<columns; ++j){
                System.out.printf("%6.2f ", this.data[ i ][ j ]);
            }
            System.out.println();
        }
    }
//    matrix addition - static method

    public static Matrix add( Matrix m1, Matrix m2 ){
        if( m1.rows != m2.rows || m1.columns != m2.columns){
            return null;
        }
//        result = m1 + m2
        Matrix result = new Matrix( m1.rows, m1.columns);
        for( int i=0; i<result.rows; ++i){
            for( int j=0; j<result.columns; ++j){
                result.data[ i ][ j ] = m1.data[ i ][ j ] + m2.data[ i ][ j ];
            }
        }
        return result;

    }

//    initialize the matrix with random values from [a, b)
    public void fillMatrix( double a, double b){
        Random random = new Random();
        for( int i=0; i<this.rows; ++i){
            for( int j=0; j<this.columns; ++j) {
                this.data[ i ][ j ] = random.nextDouble() * (b - a ) + a;
            }
        }
    }

}
