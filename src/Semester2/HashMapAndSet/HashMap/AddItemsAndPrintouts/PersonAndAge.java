package Semester2.HashMapAndSet.HashMap.AddItemsAndPrintouts;

import java.util.HashMap;

public class PersonAndAge {
    public static void main(String[] args) {

        // HashMap with String/Integer
        HashMap<String, Integer> person = new HashMap<>();

        person.put("Søren", 36);
        person.put("Bob", 25);
        person.put("Birgitte", 14);
        person.put("Bente", 76);

        for (String i : person.keySet()) {
            System.out.println(i + " er " + person.get(i) + " år");
        }
    }
}
