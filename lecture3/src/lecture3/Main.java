package lecture3;

public class Main {
    public static void main(String args[]){
        int x = 10;
        int y = 20;
        System.out.println("x= " + x +", y= " + y);
//        a = x, b = y
        swap(x, y);
        System.out.println("x= " + x +", y= " + y);

//        swap two objects of MyInteger type
        MyInteger r1 = new MyInteger(10);
        MyInteger r2 = new MyInteger(20);
        System.out.println("r1 = "+r1.getValue()+", r2 = " + r2.getValue());
        swapObjects(r1, r2);
        System.out.println("r1 = "+r1.getValue()+", r2 = " + r2.getValue());

    }
//     exchange
// a-->b and b --> a
// parameter passing: by name = the function works with copies of the parameters

    public static void swap( int a, int b){
        int c = a;
        a = b;
        b = c;
    }

    public static void swapObjects(MyInteger i1, MyInteger i2){
        int temp = i1.getValue();
        i1.setValue( i2.getValue());
        i2.setValue( temp );
    }



}
