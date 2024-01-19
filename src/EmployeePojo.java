import java.time.LocalDate;

public class EmployeePojo {
    public String firstName;
    public String lastName;
    private int age;

    public EmployeePojo(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String name() {
        return this.firstName + " " + this.lastName;
    }

    public int getAge() {
        return this.age;
    }
}
