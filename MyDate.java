import java.util.GregorianCalendar;
/**
 * Author: Aubrie McIntyre
 * Date: 8/29/2024
 * Description: This program will output the year, month, and day elapsed from a specific amount of milliseconds.
 */
public class MyDate {
    public static void main(String[] args) {
        /** Establish new GregorianCalendar object named gcal */
        GregorianCalendar gcal = new GregorianCalendar();

        /** Determines the elapsed time */
        gcal.setTimeInMillis(34355555133101L);

        /** Prints the year */
        System.out.println(gcal.get(GregorianCalendar.YEAR));

        /** Prints the month */
        System.out.println(gcal.get(GregorianCalendar.MONTH));

        /** Prints the day */
        System.out.println(gcal.get(GregorianCalendar.DAY_OF_MONTH));
    }
}