package chapter3;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalenderTest {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        int month = date.getMonthValue();
        System.out.println(date.getMonth());
        System.out.println("MON TUE WED THU FRI SAT SUN");
        date = date.minusDays(today - 1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue();
        for (int i = 1; i < value ; i++ ) {
            System.out.print("    ");
        }
        while (month == date.getMonthValue()) {
            System.out.printf("%3d",date.getDayOfMonth());

            if (date.getDayOfMonth() == today ) {
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
    }
}
