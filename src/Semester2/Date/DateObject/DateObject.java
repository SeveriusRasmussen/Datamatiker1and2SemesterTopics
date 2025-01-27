package Semester2.Date.DateObject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateObject {
    public static void main(String[] args) {
        // Current date
        LocalDate dateObj = LocalDate.now();

        // Current time
        LocalTime timeObj = LocalTime.now();

        // Current Date and time (Ugly)
        LocalDateTime timeDateObj = LocalDateTime.now();
        // Current Date and time (Awesome formatted)
        String timeDate = timeDateObj.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

        System.out.println(dateObj + "\n" + timeObj + "\n" + timeDate);
    }
}
