package Semester1.MainTopic.ArrayList.OneItemModifier;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        //__Adding some names_____________________________//
        ArrayList<String> names = new ArrayList<>();
        names.add("Søren");
        names.add("Søren");
        names.add("Søren");
        names.add("Søren");
        names.add("Anna");
        names.add("Kathrine");
        names.add("Uffe");
        names.add("Uffe");

        //__Access One and print out_____________________________//
        System.out.println(names.get(4)); // Print the Anna which is firth place in the list.
        //The list starts from index 0, that's why we get Anna instead of Søren.

        //___Add an item at a specified position_________________//
        names.add(0,"Severius");
        // This adds "Severius" on index 0.
        System.out.println("Severius added: " + names);

        //____Remove one with index_________________________________________//
        names.remove(0);
        // We removed the recently added name
        System.out.println("Severius deleted: " + names);

        //_____Remove one with object_____________________//
        names.remove("Søren");
        // We removed Søren once, not all.
        System.out.println("One Søren removed " + names);

        //______Remove all Sørens________________________________//
        // Stringen man vil fjerne
        String target = "Søren";
        //Fjern alle forekomster af target
        names.removeAll(Arrays.asList(target));
        // Udskriv den opdaterede liste
        System.out.println("All Søren's removed: " + names);

        //________See the size of the ArrayList__________________//
        System.out.println(names.size());
    }
}
