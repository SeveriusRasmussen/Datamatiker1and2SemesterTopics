package Semester1.EksamenEmner.ExtraTopic.ExceptionsAndThrow.TryCatchAndThrow;

public class tryCatchThrow {
    public static void main(String[] args) {
        checkAge(15); // Set age to 15 (which is below 18)
        checkAge(20); // This will not be executed since the first one is executed and output is already made.
    }
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
