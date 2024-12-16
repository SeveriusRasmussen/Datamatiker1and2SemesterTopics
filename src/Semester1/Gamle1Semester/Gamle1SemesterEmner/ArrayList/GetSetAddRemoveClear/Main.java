package Semester1.Gamle1Semester.Gamle1SemesterEmner.ArrayList.GetSetAddRemoveClear;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");

        // Get metode
        String element = list.get(0);
        System.out.println(element);

        // Set metode
        list.set(0, "Banana");
        String element2 = list.get(0);
        System.out.println(element2);

        // Add metode
        list.add("Orange");
        System.out.println(list); // ugly output
        for(String str : list) {  // Better looking output
            System.out.print(str);
            System.out.print(" ");
        }
        System.out.println();

        // Remove metode
        list.remove(0);
        for (String str : list) {
            System.out.print(str);
            System.out.print(" ");
        }
        System.out.println();

        // Clear metode
        list.clear();
        System.out.println("Fruit list: " + list); // Output is empty.
    }
}
