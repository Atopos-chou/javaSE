package equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author 13033
 */
public class Employee {

    private String name;

    private double salary;

    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
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

    @Override
    public boolean equals(Object otherObject) {
        // 1、判断是不是用一个对象引用
        if (this == otherObject) {
            return true;
        }

        // 2、判断需比较的对象是否为空，防止后面的校验报错
        if (otherObject == null) {
            return false;
        }

        // 3、判断两个对象是否为同一个类，不是则无法比较其下的字段
        if (getClass() != otherObject.getClass()) {
            return false;
        }

        // 4、将需比较对象进行向下转型，用于字段的比较
        Employee other = (Employee) otherObject;

        // 5、两个对象进行其下的字段比较，完全相等则相等，其下字段不为基础类型的需要用Objects的equals方法进行比较。
        return Objects.equals(this.name, other.name)
                && salary == other.salary
                && Objects.equals(this.hireDay, other.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
