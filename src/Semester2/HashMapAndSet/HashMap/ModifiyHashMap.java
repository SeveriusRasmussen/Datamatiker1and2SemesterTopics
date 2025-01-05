package Semester2.HashMapAndSet.HashMap;

import java.util.HashMap;

public class ModifiyHashMap {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities with String/String
        HashMap<String, String> capitalCities = new HashMap<>();


        // Add items
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Danmark", "København");

        System.out.println(capitalCities);

        // Access an Item (of key)
        System.out.println(capitalCities.get("England")); // Print the value of the key
        System.out.println(capitalCities.containsKey("England")); //Prints true if the key found

        // Remove an Item (of key)
        capitalCities.remove("England");
        System.out.println(capitalCities);

        // Size (of keys)
        System.out.println(capitalCities.size());

        // Remove all Items (all keys and their values)
        capitalCities.clear();
        System.out.println("HashMap contains: " + capitalCities);
    }
}
