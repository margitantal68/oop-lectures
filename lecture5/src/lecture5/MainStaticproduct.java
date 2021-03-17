package lecture5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainStaticproduct {
    public static void main(String args[]){
        System.out.println( Product.numberOfInstances());
        ArrayList<Product> products = new ArrayList();
//        i = 0, 1, 2, ..., 9
        for( int i=0; i<10; ++i){
            products.add( new Product());
        }
        System.out.println( Product.numberOfInstances());
        System.out.println( products );

        for( int i=0; i<10; ++i){
            products.add( Product.createProduct());
        }
        System.out.println( products );
        System.out.println( Product.numberOfInstances());
    }
}
