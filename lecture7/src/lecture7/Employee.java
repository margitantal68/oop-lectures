package lecture7;

// Base/Parent class
public class Employee {
//    protected - accessible also in derived/subclass
    protected String name;
    protected double salary;
    protected final int birthYear;

//    This class does not have default constructor!

    public Employee(String name, double salary, int birthYear) {
        this.name = name;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "name=" + name + ", salary=" + salary +  ", birthYear=" + birthYear;
    }
}
