

/**
 * @author zxl
 */
public class Retirement3 {

    private static final int TEN = 10;

    private static final double INSERT = 0.1;

    public static void main(String[] args) {

        //警告！在循环中，检测两个浮点数是否相等需要格外小心。
        //因为0.1无法精确地用二进制表示，所以，x将从9.999999 99999998跳到10.099999 999999 98
        for (double i = 0; i != TEN; i += INSERT) {
            System.out.println(i);
        }
        System.out.println("break!");
    }
}
