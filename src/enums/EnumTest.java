package enums;

import java.util.Scanner;

/**
 * 枚举测试类
 *
 * @author 13033
 */
public class EnumTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation="+size.getAbbreviation());
        if (size==Size.EXTRA_LARGE) {
            System.out.println("Good job--you paid attention to the _.");
        }
    }

}

/**
 * 码数枚举
 */
enum Size {

    // s码
    SMALL("S"),
    // m码
    MEDIUM("M"),
    // l码
    LARGE("L"),
    // xl码
    EXTRA_LARGE("XL");

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    private final String abbreviation;
}