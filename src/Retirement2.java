import java.util.Scanner;

/**
 * @author zxl
 */
public class Retirement2 {
    public static void main(String[] args) {
        // read input
        Scanner in = new Scanner(System.in);

        System.out.print("How much money will you contribute every year?");
        double payment = in.nextDouble();

        System.out.print("Insert rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;

        String input;

        do {
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;

            year++;

            // 看不懂，请复习输入输出！
            System.out.printf("After year %d, your balance is %,.2f%n", year, balance);

            System.out.print("Ready to retire?(Y/N)");
            input = in.next();
        } while ("N".equals(input));
    }
}
