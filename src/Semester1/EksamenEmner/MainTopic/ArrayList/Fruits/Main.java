package Semester1.EksamenEmner.MainTopic.ArrayList.Fruits;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Opret ArrayList
        // Til info: ArrayList<"Datatype/Klasse"> "variabel-navn" = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        // Tilføj integer elementer til ArrayList<Integer> numbers
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);

        // Fjern et element
        numbers.remove((Integer)5);
        for (int i : numbers) {
            System.out.println(i);
        }

        // Ret et element
        System.out.println("Changing 7 to 9");
        int index = numbers.indexOf(7); // Find indekset af elementet 7
        if (index != -1) { // Tjek om elementet findes
            numbers.set(index, 9); // Ret elementet på det fundne indeks til 9
            System.out.println("Change done");
        } else {
            System.out.println("Element 7 not found in the list");
        }
        System.out.println("Numbers:");
        for (Integer list : numbers) {
            System.out.println(list);
        }
        System.out.println(); // Tom linje

        // Tjek om et bestemt nummer findes i listen
        System.out.println("Checking the arraylist for '2':");
        if (numbers.contains(2)) {
            System.out.println("Hey! There is one '2' in the arraylist Numbers!");
        }
        /* Herover vises hvis der er noget '2' i arraylisten.
         Herunder vises hvis der er flere end en '2' i arraylisten. */

        // Tilføj '2' på arraylist og tjek om der er to '2'er
        numbers.add(2);
        int count = 0;
        for (int number : numbers) {
            if (number == 2) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Hey, there are exactly two '2' in the arraylist.\n");
        } else {
            System.out.println("There are not exactly two '2' in the arraylist. There are " + count + " '2's. \n");
        }

        // Hent et element baseret på index (0-... størrelse af arraylist)
        System.out.println("Updated Numbers:");
        for (Integer list : numbers) {
            System.out.println(list);
        }

        Number fourthNumber = numbers.get(3); // Henter index nummer 4. 0-1-2-(3)-4
        System.out.println("The fourth number in the Numbers arraylist is: " + fourthNumber + "\n");

        // Find størrelse af ArrayList
        int size = numbers.size();
        System.out.println("The size of the numbers Arraylist is: " + size + "\n");


        //___________________with fruit names____________________
        // Arraylist for variablen Fruits med Fruit klassen
        ArrayList<Fruit> fruits = new ArrayList<>();

        // Tilføj nogle frugt-objekter til listen
        fruits.add(new Fruit("Apple", "Red"));
        fruits.add(new Fruit("Banana", "Yellow"));
        fruits.add(new Fruit("Orange", "Orange"));
        fruits.add(new Fruit("Lemon", "Yellow"));

        // Print ud listen
        System.out.println("Fruits:");
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println(); // Tom linje

        // Tilkoble element fra både numbers og fruits liste ind i en ny arraylist.
        ArrayList<String> combinedList = new ArrayList<>();

        // arraylist: numbers (antal), fruits (navn og farve),
        for (int i = 0; i < Math.min(numbers.size(), fruits.size()); i++) {
            combinedList.add(numbers.get(i) + " " + fruits.get(i).name + " (" + fruits.get(i).color + ")");
        }

        System.out.println("Combined List:");
        for (String item : combinedList) {
            System.out.println(item);
        }
    }
}
