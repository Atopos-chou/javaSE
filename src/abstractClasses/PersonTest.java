package abstractClasses;

/**
 * @author 13033
 */
public class PersonTest {

    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Harry Hacker", 5000, 1989, 10, 5);
        people[1] = new Student("Maria Morris", "computer science");

        for (Person person : people) {
            System.out.println(person.getName() + "," + person.getDescription());
        }
    }
}
