package lecture4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * One-to-one relationship: Person - MyDate
 *
 */
public class MainRelationships_One_to_one {
    public static void main( String args[ ]){
        ArrayList<Person> persons = new ArrayList<>();
        /**
         * CSV file - Comma Separated Values
         * Scanner - java.util package
         * helper class
         */
        Scanner scanner = null;
        try {
            scanner = new Scanner( new File("persons.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File does not exist!");
            System.exit( 1 );
        }
        /**
         * Process file line by line
         */
        while( scanner.hasNextLine()){
            String line = scanner.nextLine();
//            System.out.println( line );
            String[] items = line.split(",");
            String name = items[ 0 ].trim();
            int year = Integer.parseInt( items[ 1 ].trim() );
            int month = Integer.parseInt( items[ 2 ].trim() );
            int day = Integer.parseInt( items[ 3 ].trim() );
            persons.add( new Person(name, new MyDate(year, month, day)));
        }

//        System.out.println( persons );
        System.out.println();
        for( Person person: persons ){

            System.out.println( person.toString() );
        }
    }
}
