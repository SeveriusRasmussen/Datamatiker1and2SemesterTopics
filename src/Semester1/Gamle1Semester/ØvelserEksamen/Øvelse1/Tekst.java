package Semester1.Gamle1Semester.ØvelserEksamen.Øvelse1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Tekst {
    public static void main(String[] args) {

        // 1. Lav en klasse med en liste attributten med variabel navn tekstlinjer
        ArrayList<String> tekstLinjer = new ArrayList<>();

        // 2. Tilføje nogle tekster, nogle af dem er den samme.
        tekstLinjer.add("Ulrik");
        tekstLinjer.add("Ulrik");
        tekstLinjer.add("Sofia");
        tekstLinjer.add("Sofia");
        tekstLinjer.add("Sofia");
        tekstLinjer.add("Tine");
        tekstLinjer.add("Mike");
        tekstLinjer.add("Mike");

        System.out.println(findAntalUnikke(tekstLinjer));
    }

    // 3. Tilføj en metode til finde unikke tekster.
    public static String findAntalUnikke(ArrayList tl) {
        HashSet<String> textLines = new HashSet<>(tl);
        return "" + textLines.size();
    }
}
