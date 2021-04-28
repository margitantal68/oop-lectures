public class MainStack {
    public static void main(String[] args) {
        Stack stack1 = new Stack( 3 );
        for( int i=0; i< 5; ++i){
            try {
                stack1.push( i );
            } catch (StackException e) {
//                e.printStackTrace();
                System.out.println( e.toString());
            }
        }
        for( int i=0; i<7; ++i){
            try {
                System.out.println( stack1.pop());
            } catch (StackException e) {
                System.out.println( e.toString());
            }
        }
    }
}
