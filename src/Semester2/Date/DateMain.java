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

        // Show both
        LocalDateTime DateTime = LocalDateTime.now();
        System.out.println(DateTime);
        // Showing both is ugly to look at.

        //Then this is better formatted
        System.out.println(DateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
        // The format is ugly aswell then this is better
        DateTimeFormatter DateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(DateTime.format(DateTimeFormat));

        /* The ofPattern methods:
        yyyy-MM-dd = "1998-09-29"
        dd/MM/yyyy = "29/09/1998"
        dd-MMM-yyyy = "29-Sep-1998"
        E, MMM dd yyyy = "Thu, Sep 29 1998"
        MM = Month as number
        MMM = Month as text
         */

    }
}
