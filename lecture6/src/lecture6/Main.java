package lecture6;

import java.util.ArrayList;

public class Main {
    // main + press <TAB> ---> IDEA will generate the main method
    public static void main(String[] args) {

        System.out.println("***************************************");
        System.out.println("Polymorphism: method overriding");

        Employee emp1 = new Employee("Youssef Ghammem", 4000, 2000);
        System.out.println( emp1.toString() );

        Manager man1 = new Manager("Fatima Jamal Eddine", 5000, 1999, "Frontend");
        System.out.println( man1.toString());

        //        base class reference can handle objects of inherited classes
        //        emp2 - static type (compile time type) is Employee
        //        emp2 is initialized with a Manager object --> dynamic type (runtime type) is Manager
        Employee emp2 = new Manager("Khozama Alam", 4500, 1998, "Backend");
        //        Overriding
        System.out.println( emp2.toString());


        System.out.println("***************************************");
        System.out.println("Polymorphic arraylist");

        ArrayList<Employee> emps = new ArrayList<>();
        for (int i=0; i<6; ++i){
            if( i%2 == 0 ){
                emps.add( new Manager("Mname"+i, (i+1)*1000, 1995 + i, "department" + (i+1)));
            } else{
                emps.add( new Employee("Ename"+i, (i+1)*1000, 1995 + i));
            }
        }
        for( Employee emp: emps){
//            emp.toString() - dynamically binded - binding is done during runtime
            System.out.println( emp.toString() );
        }
        System.out.println( "Number of managers: " + countManagers(emps));
        System.out.println( "departments: " + getDepartments(emps));


        System.out.println("***************************************");
        System.out.println("Polymorphic argument");
        Employee emp3 = new Employee("Youssef Ghammem", 4000, 2000);
        System.out.println( emp3.toString() );

        Manager man3 = new Manager("Fatima Jamal Eddine", 5000, 1999, "Frontend");
        System.out.println( man3.toString());

//        An object from a subclass (derived class) can substitute any object from the base/parent class
        sayHello( emp3 );
        sayHello( man3 );

    }

//    polymorphic argument
    private static void sayHello(Employee emp){
        System.out.println("Hello, " + emp.getName());
    }

    private static ArrayList<String> getDepartments( ArrayList<Employee> emps ){
        ArrayList<String> departments = new ArrayList<>();
        for( Employee emp: emps ){
            if( emp instanceof Manager ){
//                explicit conversion: (Type) reference
                departments.add( ((Manager) emp).getDepartment());
            }
        }
        return departments;
    }

    private static int countManagers( ArrayList<Employee> emps ){
        int counter = 0;
        for( Employee emp: emps ){
//            checks the dynamic type of emp reference
//            reference instanceof Type
            if ( emp instanceof Manager ){
                ++counter;
            }
        }
        return counter;
    }
}
