package paramTest;

/**
 * @author Jason
 */
public class ParamTest {
    public static void main(String[] args) {
        /*
         * Test1: Method can't modify numeric parameters
         */
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /*
         * Test2: Method can change the state of object parameters
         */
        System.out.println("\nTesting tripleSalary");
        Employee harry = new Employee("Harry", 5000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        /*
         * Test3: Method can't attach new objects to object parameters
         */
        System.out.println("\nTesting swap:");
        Employee alice = new Employee("Alice", 7000);
        Employee bob = new Employee("Bob", 6000);
        System.out.println("Before: Alice=" + alice.getName()+alice.getSalary());
        System.out.println("Before: Bob=" + bob.getName()+bob.getSalary());
        swap(alice, bob);
        tripleSalary(alice);
        tripleSalary(bob);
        System.out.println("After: Alice=" + alice.getName()+alice.getSalary());
        System.out.println("After: Alice=" + bob.getName()+bob.getSalary());
    }

    private static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }

    private static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    private static void tripleValue(double x) {
        x = x * 3;
        System.out.println("End of method: x=" + x);
    }


}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary + byPercent / 100;
        salary += raise;
    }
}
