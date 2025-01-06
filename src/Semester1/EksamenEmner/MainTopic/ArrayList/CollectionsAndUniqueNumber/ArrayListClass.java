package Semester1.EksamenEmner.MainTopic.ArrayList.CollectionsAndUniqueNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArrayListClass {
    public static void main(String[] args) {

        //_________Wrapper class for ArrayList_____________________//
        // Why wrapper class? Because String is an object, not primitive which Int and Double is.
        ArrayList<Integer> myNumbers = new ArrayList<>();
        myNumbers.add(1);
        myNumbers.add(4);
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(1);
        myNumbers.add(3);
        myNumbers.add(2);

        //____Sort the Numbers (With collections class)______________//
        System.out.println("Unsorted: " + myNumbers);
        Collections.sort(myNumbers);
        System.out.println("Sorted: " + myNumbers);


        //__One way: print how many unique numbers (Bad example)______//
        ArrayList<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number : myNumbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        System.out.println("ArrayList unique numbers: " + uniqueNumbers.size());

        //__Other way: HashSet method on how many unique numbers (good example)__//
        System.out.println("All numbers: " + myNumbers);
        // Adding the myNumbers list into one HashSet
        HashSet<Integer> uniqueNumbers2 = new HashSet<>(myNumbers);
        // HashSet will ignore any extra number that isn't unique
        System.out.println("New list of the numbers with HashSet: " + uniqueNumbers2);
        System.out.println("Number of unique numbers: " + uniqueNumbers2.size());
    }
}
