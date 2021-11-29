package calendarTest;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author zxl
 */
public class CalendarTest {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        // 获取当前日期的月份
        int moth = date.getMonthValue();
        // 获取当前月份的第几天
        int today = date.getDayOfMonth();

        // 往前移today-1天，获取当月的第一天
        date= date.minusDays(today-1);
        // 获取当月第一天是星期几
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        // 日历表头
        System.out.println(" Mon Tue Wed Thu Fir Sat Sun");
        // 将本月第一天移到对应的星期几的列
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }

        // 遍历当前月份的天数
        while (date.getMonthValue()==moth) {
            // 输出遍历的号数（前面有两个空格）
            System.out.printf("%3d",date.getDayOfMonth());
            // 号数如果等于今天就标记上*
            if (date.getDayOfMonth()==today) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            // 将当前天数加1，并判断如果下一天是星期一则换行
            date=date.plusDays(1);
            if (date.getDayOfWeek().getValue()==1) {
                System.out.println();
            }
        }
        // 判断如果下一个月的第一天不是以星期一开头则换行
        if ((date.getDayOfWeek().getValue()!=1)) {
            System.out.println();
        }
    }
}
