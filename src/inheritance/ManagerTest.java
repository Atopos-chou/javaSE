package inheritance;

/**
 * @author zxl
 */
public class ManagerTest {
    public static void main(String[] args) {
        Manager carl = new Manager("Carl", 80000, 1987, 12, 15);
        carl.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = carl;
        staff[1] = new Employee("Harry", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy", 40000, 1990, 3, 15);

        for (Employee employee : staff) {
            System.out.println("name=" + employee.getName() + ", salary=" + employee.getSalary());
        }
    }
}
