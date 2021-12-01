package innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;


/**
 * @author 13033
 */
public class InnerClassTest {
    public static void main(String[] args) {

        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

}

class TalkingClock {

    private int interval;

    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
        TimerPrinter listener = this.new TimerPrinter();
        Timer timer = new Timer(interval, listener);
        timer.start();
    }

    public class TimerPrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("At thr tone, the time is " + new Date());
            if (TalkingClock.this.beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

}
