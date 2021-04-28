public class CallStackMechanism {
    public static void main(String[] args) {
        System.out.println("Call addArgs: ");
        System.out.println("Result Sum: " + addArgs(args));
    }

    public static int addArgs( String args[]){
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                System.out.println("Non numerical argument" + e.getMessage());
            }
        }
        return sum;
    }
}
