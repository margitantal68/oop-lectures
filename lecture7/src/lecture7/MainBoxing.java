package lecture7;

import java.util.ArrayList;

public class MainBoxing {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        for( int i=0; i<10; ++i){
            intList.add( i );
        }
        System.out.println( intList );
    }
}
