import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zxl
 */
public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is the highest number you can draw?");
        int n = in.nextInt();

        System.out.println("How many numbers do you need to draw?");
        int k = in.nextInt();

        int[] number = new int[n];
        for (int i = 0; i <= number.length - 1; i++) {
            number[i] = i;
        }

        int[] result = new int[k];

        for (int i = 0; i <= result.length - 1; i++) {
            int index = (int) (Math.random() * n);
            result[i] = number[index];
            number[index] = number[n - 1];
            n--;
        }

        Arrays.sort(result);
        System.out.println("Bet the fllowing combination. It'll may you rich!");
        for (int i : result) {
            System.out.println(i);
        }
    }
}
