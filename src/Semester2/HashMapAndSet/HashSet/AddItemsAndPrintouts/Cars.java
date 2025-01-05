package Semester2.HashMapAndSet.HashSet.AddItemsAndPrintouts;

import java.util.HashSet;

public class Cars {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();

        // Adding some cars (unique only!)
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        // As told unique cars is added so the second BMW overwrote the first BMW.

        // Print out the HashSet Cars
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
