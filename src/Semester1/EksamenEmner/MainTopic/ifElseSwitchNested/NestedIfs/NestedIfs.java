package Semester1.EksamenEmner.MainTopic.ifElseSwitchNested.NestedIfs;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class NestedIfs {
    // Ligesom i IfElse klassen. En Nested If er en if sætning placeret ind i en anden if-sætning.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Giv mig et tal, så skal jeg sige dig om det.");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Tallet er positivt.");

            // Nested if for at kontrollere, om tallet er lige eller ulige.
            if (number % 2 == 0) {
                System.out.println("Tallet er lige.");
            } else {
                System.out.println("Tallet er ulige.");
            }
        } else if (number < 0) {
            System.out.println("Tallet er negativt.");
        } else {
            System.out.println("Tallet er nul");
        }
    }
}
