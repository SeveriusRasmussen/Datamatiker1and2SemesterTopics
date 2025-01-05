package Semester2.HashMapAndSet.HashSet;

import java.util.HashSet;

public class ModifiyHashSet {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();

        // Adding some cars
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Totoya");
        cars.add("Mazda");
        cars.add("BMW");

        // Print out the HashSet Cars
        for (String i : cars) {
            System.out.println(i);
        }

        // Check if an Item exists
        System.out.println(cars.contains("BMW")); // Prints "True"

        // Check size of the set.
        System.out.println(cars.size());

        // Remove an Item
        cars.remove("BMW");
        // Checks if BMW is removed
        for (String i : cars) {
            System.out.println("Cars: " + i);
        }

        // Clear the set
        cars.clear();
        // Checks if BMW is removed
        for (String i : cars) {
            System.out.println("Cars: " + i);
        }
        // Nothing printed out cause the set is empty.
    }
}
