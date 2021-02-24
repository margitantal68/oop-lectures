package lecture2;

public class Counter {
    // Data/attribute
    private int value = 0;

//    default constructor
//    no parameters
//    empty block
    public Counter(){
    }
//    constructor - special method
//    initilization of the object
//    called only once, after memory allocation
//    the name of the constructor = name of the class
//    does not have return type
    public Counter( int value ){
        // this.value - attribute/data field
        // value - parameter of the function
        this.value = value;
    }
    // Methods working on data fields
    public void inc(){
        ++this.value;
    }

    // getter method
    public int getValue(){
        return this.value;
    }
}
