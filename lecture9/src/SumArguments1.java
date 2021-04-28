// How to add command line arguments
// Toolbar: Edit Configuration --> Program Arguments

// Not robust! - Stops at the first runtime error without result!
public class SumArguments1 {
    public static void main(String[] args) {
        int sum = 0;
        for( String arg: args ){
            sum += Integer.parseInt( arg );
//            sum = sum + Integer.parseInt( arg );
        }
        System.out.println("Sum: " + sum);

    }

}
