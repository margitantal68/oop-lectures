package lecture7;

public class MainEquals {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Mezen", 3000, 1999);
        Employee emp2 = new Employee("Mezen", 3000, 1999);
//        NO equals overriding --> emp1 == emp2
        System.out.println( emp1.equals(emp2));
        System.out.println( emp1.equals(emp1));// this will be always TRUE
        System.out.println( emp1.equals("name"));// this will be always FALSE
        System.out.println();
        EmployeeWithEquals emp3 = new EmployeeWithEquals("Mezen", 3000, 1999);
        EmployeeWithEquals emp4 = new EmployeeWithEquals("Mezen", 3000, 1999);
        System.out.println( emp3.equals(emp4));
        System.out.println( emp3.equals(emp4));// this will be always TRUE
        System.out.println( emp3.equals("name"));// this will be always FALSE

    }
}
