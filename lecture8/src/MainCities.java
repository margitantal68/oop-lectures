import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainCities {
    public static void main(String[] args) {
        ArrayList<Pair> cities = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner( new File("lecture8/countries_cities.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if( line.isEmpty() ){
                continue;
            }
            String items[] = line.split(",");
            cities.add( new Pair( items[ 0 ].trim(), items[ 1 ].trim()));
        }
        System.out.println("Size: "+ cities.size());
        System.out.println("Initial order: ");
        printCities(cities, 100);

        Collections.sort( cities );
        System.out.println("Natural order: ");
        printCities(cities, 100);

        System.out.println("Countries alphabetically + cities alphabetically order: ");
        Collections.sort(cities, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if( p1.getCountry().equals( p2.getCountry())){
                    return p1.getCity().compareTo( p2.getCity());
                }
                return p1.getCountry().compareTo( p2.getCountry());
            }
        });
        printCities(cities, 100);
    }

    public static void printCities( ArrayList<Pair> pairs, int numCities ){
        System.out.println("Cities 1 ... " + numCities);
        for( int i=0; i<numCities; ++i){
            System.out.println( pairs.get( i ));
        }
    }
}
