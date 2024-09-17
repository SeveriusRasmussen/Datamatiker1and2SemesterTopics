package Semester1.Gamle1SemesterEmner.Arrays.FindElementInArray;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        int index = findElement(numbers, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }

    // Funktion til at finde et element i et array
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;  // Returner indekset hvor elementet er fundet
            }
        }
        return -1;  // Returner -1 hvis elementet ikke findes
    }
}
