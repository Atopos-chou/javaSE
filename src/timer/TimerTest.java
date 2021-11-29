package timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * @author 13033
 */
public class TimerTest {

    public static void main(String[] args) {
        ActionListener listener = new TimePointer();

        // construct a timer that calls the listener
        // once every 10 seconds
        Timer timer = new Timer(5000, listener);
        timer.start();

        JOptionPane.showConfirmDialog(null, "Quit program?");


        LengthComparator comparator = new LengthComparator();
        String[] friends = {"Peter", "paul", "Mar"};
        Arrays.sort(friends, comparator);
        for (String friend : friends) {
            System.out.println(friend);
        }

        System.exit(0);
    }
}

/**
 * 事件监听器实现类
 */
class TimePointer implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}

/**
 * 字符串长度比较器
 */
class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }
}
