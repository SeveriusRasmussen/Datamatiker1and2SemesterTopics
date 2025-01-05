package Semester2.HashMapAndSet.HashMap.AddItemsAndPrintouts;

import java.util.HashMap;

public class CapitalCities {
    public static void main(String[] args) {

        // Create a HashMap object called capitalCities with String/String
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        // Instead of "add" HashMap uses "put"
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Danmark", "København");

        // Ugly printout
        System.out.println(capitalCities);

        // Awesome printout
        for (String i : capitalCities.keySet()) {
            System.out.println("Country: " + i + ", City: " + capitalCities.get(i));
        }

        // Printout with only keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Printout with only Values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }
    }
}
