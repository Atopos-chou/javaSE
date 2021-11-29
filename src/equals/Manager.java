package equals;

/**
 * @author 13033
 */
public class Manager extends Employee {

    private double bonus;


    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public boolean equals(Object otherObject) {

        // 1、判断需要比较的对象是否以满足父类相等的条件
        if (!super.equals(otherObject)) {
            return false;
        }

        // 2、将需要比较的对象向下转型为子类类型，以便进行子类特有子段的比较
        Manager other = (Manager) otherObject;

        // 3、进行子类字段的比较
        return this.bonus == other.bonus;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + 17 * new Double(bonus).hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}
