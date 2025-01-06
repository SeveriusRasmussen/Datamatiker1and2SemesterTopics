package Semester1.EksamenEmner.MainTopic.ArrayList.AdditionDeletionSetting;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {

        //__Addition and Output__________________________________________//
        //ArrayList with int values and the add method and for-each loop//
        // Creating a ArrayList with the int datatype
        ArrayList<Integer> number = new ArrayList<>();

        // Adding some int values into the List
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);

        // Ugly output
        System.out.println(number);

        // For-each loop to print in nice way
        for (int n : number) {
            System.out.print(n + " ");
        }
        System.out.println();
        //____________________________________________________________//

        //__Deletion and Setting__________________________________________//

        //ArrayList with String values and the deletion and set methods //
        // Creating a ArrayList with the String datatype
        ArrayList<String> strings = new ArrayList<>();

        // Adding some String values into the list
        strings.add("Alex");
        strings.add("Bob");
        strings.add("Charles");
        strings.add("Daniel");
        strings.add("Eric");
        System.out.println("Original list: " + strings);
        // IMPORTANT: The list begins from 0, NOT 1.

        // Set a value:
        strings.set(2, "Harry"); // Change the index 2 to Harry, Charles to Harry in short.
        System.out.print("New list: " + strings);
        System.out.println("\n" + strings.get(2)); // get(0) is the same.

        // Deletion:
        strings.remove(2); // Deleting Harry
        // Commented code below is one other way to remove:
        // strings.remove("Harry");
        System.out.println("Harry deleted: " + strings);

        //___________________________________________________________________//


    }
}
