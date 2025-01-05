package Semester2.HashMapAndSet.HashSet.AddItemsAndPrintouts;

import java.util.HashSet;

public class Numbers {
    public static void main(String[] args) {

        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<>();

        // Add values to the set
        numbers.add(5);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set");
            } else {
                System.out.println(i + " was not found in the set");
            }
        }
    }
}
