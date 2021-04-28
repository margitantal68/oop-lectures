public class SumaArguments3 {
    public static void main(String[] args) {
        int sum = 0;

        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("Non numerical argument" + e.getMessage());
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("This is the end!");
    }
}
