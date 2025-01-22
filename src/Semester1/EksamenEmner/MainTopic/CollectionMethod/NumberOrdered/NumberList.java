package Semester1.EksamenEmner.MainTopic.CollectionMethod.NumberOrdered;

import Semester1.EksamenEmner.MainTopic.CollectionMethod.Angle.Angle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberList implements Comparable<NumberList> {

    private List<Integer> numbers;

    // Når man oprette et objekt, så sætter der nye numrer i listen vha. metoden initializeNumbers
    public NumberList() {
        numbers = new ArrayList<>();
        initializeNumbers();
    }

    private void initializeNumbers() {
        int[] initialNumbers = {3, 5, 2, 1, 3, 3, 7, 5, 7, 2, 9, 10};
        for (int number : initialNumbers) {
            numbers.add(number);
        }
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void sortNumbers() {
        Collections.sort(numbers);
    }

    public void printNumbers() {
        System.out.println("Numbers: " + numbers);
    }

    public int compareTo(NumberList other) {
        // Antager at begge lister har mindst ét element
        return Integer.compare(this.numbers.get(0), other.numbers.get(0));
    }

}
