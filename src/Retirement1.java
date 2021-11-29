import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Retirement1 {

    public static void main(String[] args) throws FileNotFoundException {

        //printfTest();

        PrintWriter printWriter = new PrintWriter("hello.txt");
        printWriter.write("我爱你，宝贝！");
        printWriter.close();

        /*Path path = Paths.get("hello.txt");
        Path fileName = path.getFileName();
        System.out.println(fileName);*/
    }

    private static void printfTest() {

        // 用8个字符的宽度和小数点后两个字符的精度打印x
        /*double s = 10000.0 / 3.0;
        System.out.printf("%8.2f", s);*/

        // 每一个以%字符开始的格式说明符都用相应的参数替换
        /*Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = 26;
        System.out.printf("Hello,%s.Next year,you'll be %d", name, age);*/

        // String.format()
        /*String message = String.format("Hello,%s.Next year,you'll be %d", name, age);
        System.out.println(message);*/

        //格式化打印时间
        /*System.out.printf("%Tc" ,new Date());
        System.out.println();
        System.out.printf("%1$s %2$tB %2$te,%2$tY", "Due date:",new Date());
        System.out.println();
        System.out.printf("%s %tB %<te,%<tY", "Due date:",new Date());*/
    }

}
