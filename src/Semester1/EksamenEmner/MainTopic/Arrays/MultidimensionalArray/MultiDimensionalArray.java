package Semester1.EksamenEmner.MainTopic.Arrays.MultidimensionalArray;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        int[][] myNumbers = { {1,2,3,4}, {5,6,7,8}};
        /*
        This makes a "tabel" with the numbers like this:
        1 2 3 4
        5 6 7 8

        the first [] is the rows
        the second [] is the columns.
        REMEMBER starts with 0! not 1.

        [0][2] takes the "3", an example like this:
        1 2(3)4
        5 6 7 8

         */

        // Print out the elements
        System.out.println(myNumbers[1][2]); //Prints the number 7
        System.out.println(myNumbers[0][2]); //Prints the number 3

        // Change one element
        myNumbers[1][0] = 9;
        System.out.println(myNumbers[1][0]); // Prints the changed number 5 which is turned into 9.

        // Loop through the array
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
