package Semester1.Gamle1Semester.Gamle1SemesterEmner.Arrays.ArrayCalculations;

/*
Forklaring:
    findMax: Finder det største element i arrayet.
    findMin: Finder det mindste element i arrayet.
    calculateTotal: Beregner summen af alle elementerne i arrayet.
    calculateAverage: Beregner gennemsnittet ved at tage totalen og dividere med antallet af elementer.
 */

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int max = findMax(numbers);
        int min = findMin(numbers);
        int total = calculateTotal(numbers);
        double average = calculateAverage(numbers);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Total: " + total);
        System.out.println("Gennemsnit: " + average);
    }

    // Funktion til at finde max værdi
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Funktion til at finde min værdi
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Funktion til at beregne total
    public static int calculateTotal(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    // Funktion til at beregne gennemsnit
    public static double calculateAverage(int[] array) {
        int total = calculateTotal(array);
        return (double) total / array.length;
    }
}
