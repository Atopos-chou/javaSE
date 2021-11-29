package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;


/**
 * @author 13033
 */
public class LambdaTest {

    public static void main(String[] args) {

        String[] plants = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter",
                "Saturn", "Uranus", "Neptune"};

        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted in dictionary order");
        Arrays.sort(plants);
        System.out.println(Arrays.toString(plants));
        System.out.println("Sorted by length:");
        Arrays.sort(plants, (String first, String second) -> {
            return first.length() - second.length();
        });
        System.out.println(Arrays.toString(plants));

        Timer t = new Timer(1000, event ->
                System.out.println("The time is " + new Date())
        );
        t.start();

        JOptionPane.showConfirmDialog(null, "Quit program?");
        System.exit(0);
    }
}

