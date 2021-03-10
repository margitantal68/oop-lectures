package lecture2;

public class Main {
    public static void main(String[] args) {
        System.out.println("OOP - Lecture 2");

        // LHS - left hand side
        // RHS - right hand side
//       LHS: counter1 - reference to an object (similar to pointer)
//       RHS: new Counter ()
//          new - dynamic memory allocation operator
//          Counter - name of a type (class)
//          () - paranthesis - methods/functions
//        [] - brackets
//        {} - braces
        Counter counter1 = new Counter();
        counter1.inc();
        System.out.println( "counter1: "+counter1.getValue());

        for(int i=0; i<10; ++i){
            counter1.inc();
            System.out.println( "counter1: "+counter1.getValue());

        }
        Counter counter2 = new Counter(10);
        System.out.println( "counter2: " + counter2.getValue() );
        Counter counter3 = new Counter(20);
        System.out.println( "counter3: " + counter3.getValue() );
        System.out.println( "anonymous: " + (new Counter(0)).getValue());

        Counter counter4;
        // 4 references of type Counter
        // 3 objects objects of type Counter

        counter4 = counter2;
        System.out.println( "counter4: " + counter4.getValue());

    }


}