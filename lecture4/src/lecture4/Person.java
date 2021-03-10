package lecture4;

public class Person {
    private String name;
    /**
     * implementing one-to-one relationship
     * between Person and MyDate
     */
    private MyDate birthDate;

    public Person(String name, MyDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
