package with_harry_exmples;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Exmple_24_CwHarryDateANDTime {
    public static void main(String[] args) {

        System.out.println("The maximum value of long is :" + Long.MAX_VALUE);
        System.out.println("The value of current time in ms : " + System.currentTimeMillis());


        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());

        // Deprecated
        System.out.println("The current date is : "+ d.getDate());
        System.out.println("The current year is : "+ d.getYear()); //19
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());

        Date d1 = new Date(2022,4,30);
        System.out.println("The number of milliseonds passed since Jan 1, 1970 :" +d1.getTime() );
        System.out.println(d1.compareTo(d));
        System.out.println("The date calculated form miliseconds is passed since January 1, 1970 : " + d1);


        // CALENDER
        //Calendar c =  Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        //   GregorianCalendar

        GregorianCalendar ca = new GregorianCalendar();

        c.roll(Calendar.MONTH, true);
        c.roll(Calendar.DATE, false);
        c.roll(Calendar.YEAR, true);

        System.out.println("Date after rolling : " + ca.getTime());
        System.out.println("Calendar : " + ca.getTime());
        System.out.println("The hashcode for this calendar is : "+ ca.hashCode());


        GregorianCalendar cal = new GregorianCalendar();

        System.out.println(cal.isLeapYear(2018));
        System.out.println(cal.isLeapYear(2021));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);




    }
}
