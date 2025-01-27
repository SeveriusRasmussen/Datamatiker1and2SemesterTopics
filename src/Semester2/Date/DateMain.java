package Semester2.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateMain {
    public static void main(String[] args) {
        // Show the current date
        System.out.println(LocalDate.now());

        // Show the current time
        System.out.println(LocalTime.now());

        // Show both and use one object to print out
        LocalDateTime DateTime = LocalDateTime.now();
        System.out.println(DateTime);
        // Showing both is ugly to look at.

        //Then this is better formatted
        System.out.println(DateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        // But the above code is ugly and a bit hard to read then the below code is better using a DateTimeFormatter class.
        DateTimeFormatter DateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String dateAndTime = DateTime.format(DateTimeFormat);
        System.out.println(dateAndTime); // See the text in the parentheses, simpely text right?

        /* The ofPattern() methods:
        yyyy-MM-dd = "1998-09-29"
        dd/MM/yyyy = "29/09/1998"
        dd-MMM-yyyy = "29-Sep-1998"
        E, MMM dd yyyy = "Thu, Sep 29 1998"
        MM = Month as number
        MMM = Month as text
         */

    }
}
