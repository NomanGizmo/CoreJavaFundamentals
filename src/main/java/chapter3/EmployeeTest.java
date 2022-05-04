package chapter3;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Noman", 35000,2021,06,01);
        staff[1] = new Employee("Kakoli", 35000,2021,06,01);
        staff[2] = new Employee( null,35000,2021,06,01);
//        staff[3] = new Employee("Anjali", 35000,2021,06,01);

        for (Employee e: staff) {
            e.raiseSalary(5);
        }
        for (Employee e: staff) {
            System.out.println(e.getName() + " " + e.getSalary() + " " + e.getJoiningDate());
        }
    }
}

class Employee {

    private String name;
    private double salary;
    private LocalDate joiningDate;

    Employee (String n, double s, int year, int month, int day) {
//        this.name = Objects.requireNonNull(n,"the name cannot be null");
        this.name = Objects.requireNonNullElse(n,"unknown");
//        this.name = n;
        this.salary = s;
        this.joiningDate = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void raiseSalary(int percent) {
        salary += salary * percent/100;
    }
}
