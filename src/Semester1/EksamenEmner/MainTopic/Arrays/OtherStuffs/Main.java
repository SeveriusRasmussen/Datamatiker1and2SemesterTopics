package Semester1.EksamenEmner.MainTopic.Arrays.OtherStuffs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        Vælg datatype til array, så skriv [] og variabel navn.
        Derefter vælg hvor mange er i array'et.
        */
        int[] myArray;
        myArray = new int[5];

        // Kan godt gøre den hele i en linje i stedet for.
        int[] myArray2 = new int[5];

        // Kan også initialize en array med værdier fra starten:
        int[] myArray3 = {1, 2, 3, 4, 5};

        // Tag den index i myArray3 og print det ud.
        int firstElement = myArray3[0];
        System.out.println(firstElement);
        //Kan skrives sådan i stedet for:
        System.out.println("Second element: " + myArray3[1]);
        System.out.println("___");

        // Ændre en index i myArray3 og print det ud.
        myArray3[0] = 10; //ændret fra 1 til 10
        int changedElement = myArray3[0];
        System.out.println(changedElement);
        System.out.println("___");

        // Print ud length af myArray3.
        int length = myArray3.length;
        System.out.println(length);
        System.out.println("___");

        // Man kan "iterate" en array ved at bruge en for-loop.
        for (int i = 0; i < myArray3.length; i++) {
            System.out.println(myArray3[i]); //i er indeks i array'et.
        }
        System.out.println("___");

        // En foreach-loop (simpelt for-loop)
        for (int element : myArray3) {
            System.out.println(element);
        }

        //__________________________
        // En multidimensional array (2D array)
        int[][] matrix = new int[3][3];
        // Men her er 3x3 array med værdi 0 i hver og sætter 1 på midt af matrix-array.
        matrix[1][1] = 1;
        // Print hele matrix-array ud
        System.out.println("______");
        // Første for-loop udprinter row og den incested for-loop udprinter columns.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______");

        // 2D array med værdier
        int [][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // adgang i 2D array med print ud.
        int value = matrix2[1][1];
        System.out.println(value);

        // Print hele matrix2-array ud
        System.out.println("______");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("______");

        //___________________________
        // Sort an array
        int[] sortArray = {4, 2, 1, 5, 3};
        for (int list : sortArray) {
            System.out.println(list);
        }
        System.out.println("___");
        Arrays.sort(sortArray); //import Arrays
        for (int list : sortArray) {
            System.out.println(list);
        }
        System.out.println("___");

        //_____________________________
        // See about two arrays are equal
        int[] arrayOne = {1, 2, 3, 4};
        int[] arrayTwo = {1, 2, 3, 4};
        boolean isEqual = Arrays.equals(arrayOne, arrayTwo);
        System.out.println(isEqual); // Output: True fordi begge er samme.


    }
}