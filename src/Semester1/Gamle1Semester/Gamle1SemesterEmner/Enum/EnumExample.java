package Semester1.Gamle1Semester.Gamle1SemesterEmner.Enum;

public class EnumExample {

    public static void main(String[] args) {
        printDayType(Day.MONDAY);
        printDayType(Day.WEDNESDAY);
        printDayType(Day.THURSDAY);
        printDayType(Day.SUNDAY);
    }

    // Metode til at afgøre, om det er en hverdag eller weekend
    public static void printDayType(Day day) {
        switch (day) {
            case SATURDAY:
            case SUNDAY:
                System.out.println(day + " is a weekend.");
                break;
            default:
                System.out.println(day + " is a weekday");
                break;
        }
    }

    /*
    1. Enum Day: Enum definerer ugens dage. En enum er en speciel type i Java,
       som bruges til at definere et sæt konstante værdier.
    2. printDayType: En metode, der tager en 'Day' som input og bruger en switch-case til at tjekke,
       om dagen er en weekend (lørdag og søndag) eller en hverdag.
    3. Main metode: Her kalder vi 'printDayType()' med forskellige værdier af enum-type 'Day'

    Hvorfor bruger ENUM?
        - Enums gør det lettere at arbejde med faste sæt af værdier, som fx dage i en uge,
          måneder i et år eller andre lignende koncepter.
        - Enum-typer forbedrer læsbarheden og sikkerheden i din kode ved at undgå magiske tal og strenge.
     */
}
