package equals;

/**
 * @author 13033
 */
public class EqualsTest {

    public static void main(String[] args) {

        Employee alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        Employee bob = new Employee("Bob Brandon", 50000, 1989, 10, 1);

        // ==比较引用对象的地址值
        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        // 重写的equals方法比较对象的值
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob): " + alice1.equals(bob));

        // 重写的toString方法返回对象的类名+各字段的值
        System.out.println("bob.toString(): " + bob);

        Manager carl = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        // 重写的toString方法返回对象的类名+各字段的值（包含超类）
        System.out.println("boss.toString(): " + boss);
        // 重写的equals方法比较对象的值（包含超类）
        System.out.println("carl.toEquals(boss): " + carl.equals(boss));

        // 重写的hashCode方法返回各字段的hash值之和
        System.out.println("alice1.hashCode(): " + alice1.hashCode());
        System.out.println("alice3.hashCode(): " + alice3.hashCode());
        System.out.println("bob.hashCode(): " + bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());

        // 获取最大值
        double max = max(11, 12, 13, 14);
        System.out.println(max);

    }

    /**
     * 获取最大值
     *
     * @param values 任意数量数值
     * @return 返回最大的那个数值
     */
    public static double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double value : values) {
            if (value > largest) {
                largest = value;
            }
        }
        return largest;
    }

}
