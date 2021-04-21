import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainStrings {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("raspberry");
        strings.add("melon");
        strings.add("apple");
        strings.add("pear");

        System.out.print("Initial order: ");
        for(String str: strings){
            System.out.print(str+" ");
        }
        System.out.println();
//        natural ordering of String, Comparable<String>
        Collections.sort( strings );
        System.out.print("Increasing order: ");
        for(String str: strings){
            System.out.print(str+" ");
        }
        System.out.println();

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
//                reverse - decreasing order
                return s2.compareTo(s1);
            }
        });
        System.out.print("Decreasing order: ");
        for(String str: strings){
            System.out.print(str+" ");
        }
        System.out.println();

    }
}
