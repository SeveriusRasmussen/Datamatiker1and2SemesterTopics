package Semester1.EksamenEmner.ExtraTopic.PrintMethods;

public class PrintMethods {
    public static void main(String[] args) {
        System.out.print("Hello World! \n"); // Print without any new line, the "\n" is the new line.
        System.out.println("Hello World!"); // Print with new line
        System.out.printf("%s World!\n", "Hello"); // Print with format.

        // Another example with the printf:
        String name = "Søren";
        int age = 30;
        char initial = 'S';
        System.out.printf("Hej, %s! Du er %d år gammel, og din initial er %c.\n", name, age, initial);
        /*
        String = %s
        int = %d
        char = %c
         */

        // Printf with two strings:
        String firstName = "Søren";
        String lastName = "Hansen";
        System.out.printf("Hej, %s %s!\n", firstName, lastName);
    }
}
