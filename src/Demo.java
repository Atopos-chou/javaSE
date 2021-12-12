import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 13033
 */
public class Demo {

    public static void main(String[] args) {
        /*
        tiMu1();
        tiMu2();
        tiMu3();
        tiMu4();
        tiMu5();
        tiMu6();
        tiMu7();
        tiMu8();
        tiMu9();
        tiMu10();
        */

        // 转义符书籍
        System.out.println("书名\t作者\t价格\t销量\r\n三国\t罗贯中\t120\t\t1000");

    }

    private static void tiMu10() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100 + 1);
        }
        int sum = 0;
        int maxIndex = 0;
        int minIndex = 0;
        int maxNum = array[0];
        int minNum = array[0];
        boolean is8 = false;
        for (int j = array.length - 1; j >= 0; j--) {
            sum += array[j];
            if (array[j] > maxNum) {
                maxNum = array[j];
                maxIndex = j;
            }
            if (array[j] < minNum) {
                minNum = array[j];
                minIndex = j;
            }
            if (array[j] == 8) {
                is8 = true;
            }
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        System.out.println("平均值：" + (sum / array.length));
        System.out.println("最大值下标：" + maxIndex);
        System.out.println("最小值下标：" + minIndex);
        System.out.println("是否有8：" + is8);
    }

    /**
     * 冒泡排序
     */
    private static void tiMu9() {
        int[] array = {88, 66, 99, 55, 22, 11, 33, 77, 44};

        // 每轮最后一次交换位置
        int flag = 0;
        // 数组的有序边界（解决每轮多余的比较次数）
        int bianjie = array.length - 1;

        // 中间变量
        int tmp;
        // 循环的轮数
        for (int i = 0; i < array.length - 1; i++) {
            // 有序标记(解决多余的比较轮次)
            boolean isSorted = true;

            // 每轮比较的次数
            for (int j = 0; j < bianjie; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    flag = j;
                    isSorted = false;
                }
            }

            // 设置每轮最后一次交换的位置为有序边界
            bianjie = flag;

            // 判断序列是否已经有序
            if (isSorted) {
                break;
            }
        }

        // 输出
        Arrays.stream(array).forEach(System.out::println);
    }

    private static void tiMu8() {
        int sum = 0;
        int totalNum = 0;
        for (int b = 1; b <= 100; b++) {
            sum += b;
            totalNum += sum;
        }
        System.out.println(totalNum);
    }

    private static void tiMu7() {
        int totalNum = 0;
        for (int i = 0; i <= 100; i++) {
            totalNum += i + i * (i - 1) / 2;
        }
        System.out.println(totalNum);
    }

    private static void tiMu6() {
        int count = 0;
        for (int i = 0; i <= 100; i++) {
            count += i * (101 - i);
        }
        System.out.println(count);
    }

    private static void tiMu5() {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                count += j;
            }
        }
        System.out.println(count);
    }

    private static void tiMu4() {
        double count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                count -= 1.0 / i;
            } else {
                count += 1.0 / i;
            }
        }
        System.out.printf("%.2f%n", count);
    }

    private static void tiMu3() {
        double money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
                money *= 0.95;
            } else if (money >= 1000) {
                money -= 1000;
            } else {
                break;
            }
            count++;
        }
        System.out.println("count =" + count);
    }

    private static void tiMu2() {
        // 空心金字塔
        int num3 = 6;
        for (int i = 1; i <= num3; i++) {
            for (int k = num3 - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                if (j == 1 || j == i * 2 - 1 || i == num3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 空心菱形
        for (int i = 1; i <= num3; i++) {
            for (int k = num3 - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i * 2; j++) {
                if (j == 1 || j == i * 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = num3 - 1; i > 0; i--) {
            for (int k = num3 - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = i * 2; j > 1; j--) {
                if (j == i * 2 || j == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void tiMu1() {
        // 乘法表
        Scanner scanner = new Scanner(System.in);
        System.out.println("外层循环次数");
        int num = scanner.nextInt();
        System.out.println("内层循环次数");
        int num2 = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num2; j++) {
                if (j <= i) {
                    System.out.print(j + "X" + i + "=" + (i * j) + "\t");
                }
            }
            System.out.println();
        }
    }
}
