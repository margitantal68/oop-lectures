import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CountLinesHandle {
    // Handle the exception
    public static int countLines(String filename){
        int counter = 0;
        Scanner scanner = null;
        try {
            scanner = new Scanner( new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
            System.exit( 1 );
        }
        while (scanner.hasNextLine()) {
            ++counter;
            scanner.nextLine();
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println( countLines("./lecture9/src/SumArgumentsxx1.java" ) );
    }
}
