public class SumaArguments2 {
    public static void main(String[] args) {
        int sum = 0;
        try {
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println("Sum: " + sum);
        } catch( NumberFormatException e){
            System.out.println("Non numerical argument" + e.getMessage());
        }
        System.out.println("This is the end!");
    }
}
