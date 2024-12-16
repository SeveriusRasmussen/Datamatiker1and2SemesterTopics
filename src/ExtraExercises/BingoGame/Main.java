package ExtraExercises.BingoGame;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> bingo = new HashSet<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to add a new unique number to the bingo board.");

        // fortsæt indtil HashSet indeholder alle numre fra 0 til 99
        while (bingo.size() < 100 ) {
            scanner.nextLine(); // Vent på Enter-tast

            int number = random.nextInt(100); // Generer et tal mellem 0 og 99
            if (bingo.add(number)) { // Tilføj kun hvis det ikke allerede er der.
                System.out.println(number + " added to the bingo board");
            } else if (bingo.size() == 100) {
                System.out.println("Duplicate number generated, Try again.");
            }
        }
        System.out.println("All unique numbers added to the bingo board:");
        System.out.println(bingo);
        scanner.close();

//        System.out.println(Math.round(Math.random() * 100) + " added to the bingo board");
//
//        System.out.println(bingo);
    }
}
