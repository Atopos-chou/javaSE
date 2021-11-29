package employeeTest;

import java.time.LocalDate;

/**
 * @author zxl
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Car", 75000, 1987, 3, 15);
        employees[1] = new Employee("Car", 75000, 1987, 3, 15);
        employees[2] = new Employee("Car", 75000, 1987, 3, 15);

        for (Employee employee : employees) {
            employee.raiseSalary(5);
        }

        for (Employee employee : employees) {
            System.out.println("name=" + employee.getName() + ",salary=" + employee.getSalary()
                    + ",hireDay=" + employee.getHireDay());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
