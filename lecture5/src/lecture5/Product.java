package lecture5;

public class Product {
//    instance field/data/attribute
//    should be unique!
    private int serialNumber;
//    class field - belongs to the class not to a given instance
    private static int counter = 0;

//    constructor - instance method
    public Product(){
        ++counter;
        this.serialNumber = counter;
    }
//    static factory method: create an instance and return it
    public static Product createProduct(){
        return new Product();
    }

    public static int numberOfInstances(){
        return counter;
    }

    @Override
    public String toString() {
        return "Product{" +
                "serialNumber=" + serialNumber +
                '}';
    }
}
