package SalaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus){
        if (age < 30) {
            salary += salary * (bonus / 200); // Half bonus for people younger than 30
        } else {
            salary += salary * (bonus / 100);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %f leva",
                this.firstName,
                this.lastName,
                this.salary);
    }
}
