package ko.maeng.calendar;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        int year = ca.get(Calendar.YEAR);
        int mon = ca.get(Calendar.MONTH);
        int day = ca.get(Calendar.DAY_OF_MONTH);
        int hour = ca.get(Calendar.HOUR_OF_DAY);
    }
}
