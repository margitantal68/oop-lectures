import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintCommandLineArguments {
    public static void main(String[] args) {
        for( String arg: args ){
            System.out.println( args );
        }


    }
}
