package lecture6;

// a manager is a special type of employee
// inheritance - extends
// Only one parent class! - Java
// Employee - base/parent class
// Manager - subclass/ derived class
public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, int birthYear, String department) {
        // super(...) - call the parent class's constructor
        // Mandatory!
        super(name, salary, birthYear);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//    @Override
//    public String toString() {
//        return "name=" + name  + ", salary=" + salary +  ", birthYear=" + birthYear +  ", department=" + department;
//    }

    @Override
    public String toString() {
        // super.method() - calls the inherited method
        return  super.toString() + ", department=" + department;
    }
}
