package lecture7;

import java.util.Objects;

public class EmployeeWithEquals {
    //    protected - accessible also in derived/subclass
    protected String name;
    protected double salary;
    protected final int birthYear;

    //    This class does not have default constructor!

    public EmployeeWithEquals(String name, double salary, int birthYear) {
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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof EmployeeWithEquals)) return false;
////        CASTING
//        EmployeeWithEquals that = (EmployeeWithEquals) o;
//        return Double.compare(that.salary, salary) == 0 && birthYear == that.birthYear && Objects.equals(name, that.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        EmployeeWithEquals that = (EmployeeWithEquals) o;
        return Double.compare(that.salary, salary) == 0 && birthYear == that.birthYear && Objects.equals(name, that.name);
    }



    @Override
    public String toString() {
        return "name=" + name + ", salary=" + salary +  ", birthYear=" + birthYear;
    }
}
