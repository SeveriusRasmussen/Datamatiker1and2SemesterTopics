package Semester1.EksamenEmner.MainTopic.ifElseSwitchNested.ifElse;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Indtastning af to tal
        System.out.print("Indtast det første tal: ");
        double num1 = scanner.nextDouble();

        System.out.print("Indtast det andet tal: ");
        double num2 = scanner.nextDouble();

        // Vælg operation (Matematisk tegn)
        System.out.println("Vælg operation: +, -, *, /");
        char operation = scanner.next().charAt(0);



        // Brug af if, else if, og else til at udføre operationen med result.
        double result;
        if (operation == '+') {
            result = num1 + num2;
            System.out.println("Resultat: " + result);
        } else if (operation == '-') {
            result = num1 - num2;
            System.out.println("Resultat: " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println("Resultat: " + result);
        }  else if (operation == '/') {
            // Nested if's here
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Resultat: " + result);
            } else {
                System.out.println("Fejl: Division med nul er ikke tilladt.");
            }
        } else {
            System.out.println("Ugyldig operation.");
        }

        scanner.close();
    }
}
