import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountLinesDeclare {

    // Handle the exception
    public static int countLines(String filename) throws FileNotFoundException {
        int counter = 0;
        Scanner scanner = new Scanner(new File(filename));
        while (scanner.hasNextLine()) {
            ++counter;
            scanner.nextLine();
        }
        return counter;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Number of lines: " + countLines("./lecture9/src/SumArguments1.java"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }


}
