package lecture4;

import java.util.ArrayList;
import java.util.Collections;

public class MainArrayList {
    /**
     * 1. Declare a reference of type ArrayList: ArrayList<Type> aList;
     * 2. Creating ArrayLists: aList = new ArrayList<Type>();
     * 3. Adding elements: aList.add( new Type(...));
     * 4. Deleting/removing elements: aList.remove( index ), aList.remove( reference)
     * 5. Size: aList.size()
     * 6. Access an item: aList.get(index)
     * 7. Change an item: aList.set(index, value)
     * 8. Remove all elements: aList.clear()
     * 9. Sort an ArrayList: Collections.sort( aList )
     *
     */
    public static void main( String[] args){

        ArrayList<String> list1 = new ArrayList<>();
        System.out.println( list1.size() );
        list1.add("Monday");
        list1.add("Tuesday");
        // : - colon
        // ; - semicolon
        for( String e: list1 ){
            System.out.print( e +" ");
        }
        System.out.println();
        System.out.println( list1.get( 1 ));

        list1.set(0, "monday");
        System.out.println( list1 );
        list1.add("Wednesday");
        list1.add("Thursday");
        System.out.println( list1 );
        list1.remove( 0 );
        System.out.println( list1 );
        Collections.sort( list1 );
        System.out.println( list1 );
    }
}
