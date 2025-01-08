package ExtraExercises.BingoGame;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class BingoGame {
    public static void main(String[] args) {
        HashSet<Integer> bingo = new HashSet<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to add a new unique number to the bingo board.");

        // fortsæt indtil HashSet indeholder alle numre fra 0 til 99
        while (bingo.size() < 100) {
            scanner.nextLine(); // Vent på Enter-tast

            int number;
            do {
                number = random.nextInt(100); // Generer et tal mellem 0 og 99
            } while (!bingo.add(number)); // Fortsæt med at generere, indtil et unikt nummer findes.
            System.out.println(number + " added to the bingo board");
        }

        System.out.println("All unique numbers added to the bingo board:");
        System.out.println(bingo);
        scanner.close();
    }
}
