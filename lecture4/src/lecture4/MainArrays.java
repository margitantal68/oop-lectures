package lecture4;

import java.util.Arrays;
import java.util.Random;

public class MainArrays {
    /**
     * 1. declaring array references
     * 2. creating array objects
     * 3. array of primitives - base type: primitive
     * 4. array of refrences - base type: reference
     * 5. print an array - for-each loop
     * 6. assignment between references of type array
     * 7. sort an array: Arrays.sort
     */
    public static void main( String[] args){
        //type: int[ ]
        // array: reference/variable
        int [] array1 = new int[ 3 ];
        System.out.println(array1.length);
        for( int e: array1 ){
            System.out.print( e +" ");
        }
        System.out.println();
        // array of references
        MyDate[ ] array2 = new MyDate[ 2 ];
        for( MyDate date: array2){
            System.out.print( date +" ");
        }
        System.out.println();
        array2[ 0 ] = new MyDate(2021, 3, 10);
        array2[ 1 ] = new MyDate(2021, 3, 8);
        for( MyDate date: array2){
            System.out.println( date +" ");
        }

        int [] array3 = new int[ 10 ];
        for ( int e: array3){
            System.out.print( e+" ");
        }
        System.out.println();
        array3 = array1;
        System.out.println("After assiggnment: array3 = array1");
        for ( int e: array3){
            System.out.print( e+" ");
        }
        System.out.println();
        Random rnd = new Random();
        for(int i=0; i<array1.length; ++i){
            array1[ i ] = rnd.nextInt( 10);
        }
        for ( int e: array1){
            System.out.print( e+" ");
        }
        System.out.println();
        System.out.println("After sort ");
        Arrays.sort( array1 );
        for ( int e: array1){
            System.out.print( e+" ");
        }
        System.out.println();


    }
}
