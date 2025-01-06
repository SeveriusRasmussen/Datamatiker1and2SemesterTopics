package Semester1.EksamenEmner.MainTopic.Arrays.AdditionDeletionSetting;

public class Arrays {
    public static void main(String[] args) {

        // Array with strings
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Array with ints
        int[] myNum = {3, 2, 5, 6, 4, 8, 9};

        // You can't add directly into the array which Arraylist can with the add().

        // Access the Elements of an Array (We take the cars array)
        System.out.println("Print the index 0: " + cars[0]); // Prints the Volvo car from index 0.

        // Change an element in the Array Cars
        cars[0] = "Toyota"; // Changes the Volvo into Toyota
        System.out.println("Print the changed index 0: " + cars[0]); // Print the new car from index 0.

        // Print the length of the myNum Array. (ArrayList uses the size().)
        System.out.println("myNum: " + myNum.length);

        // Loop Through the Cars Array with For loop
        System.out.println("Print out the Cars array with for loop:");
        // i < cars.length is why the array is 4 elements but starts from 0 so that's 0-3.
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // with for each loop (easier to use)
        System.out.println("Print out the Cars array with foreach loop:");
        for (String i : cars) {
            System.out.println(i);
        }

        // Array can't extends out for more elements,
        // you need either a new array or Arraylist for that.
        int[] oldArray = {1, 2, 3};
        int[] newArray = new int[oldArray.length + 1];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
            System.out.println(newArray[i]);
        }
        newArray[oldArray.length] = 4; // Tilføj nyt element
        newArray[3] = 4;
        System.out.println(newArray[3]);
    }
}
