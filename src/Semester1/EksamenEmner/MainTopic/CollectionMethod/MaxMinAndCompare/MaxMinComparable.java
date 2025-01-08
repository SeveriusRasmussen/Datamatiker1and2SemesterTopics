package Semester1.EksamenEmner.MainTopic.CollectionMethod.MaxMinAndCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxMinComparable {
    private List<String> fruits;
    private List<Integer> numbers;

    public MaxMinComparable() {
        fruits = new ArrayList<>();
        numbers = new ArrayList<>();
    }

    // Tilføj en frugt til samlingen
    public void addFruit(String fruit) {
        fruits.add(fruit);
    }

    // Tilføj et tal til samlingen
    public void addNumber(Integer number) {
        numbers.add(number);
    }

    // Find den frugt, der kommer sidst alfabetisk
    public String maxFruit() {
        return Collections.max(fruits);
    }

    // Find den frugt, der kommer først alfabetisk
    public String minFruit() {
        return Collections.min(fruits);
    }

    // Find det største tal
    public Integer maxNumber() {
        return Collections.max(numbers);
    }

    // Find det mindste tal
    public Integer minNumber() {
        return Collections.min(numbers);
    }

    // Find den sidste alfabetisk frugt ved hjælp af en comparator
    public String maxFruitWithComparator() {
        return Collections.max(fruits, Comparator.reverseOrder());
    }

    // Find den første alfabetisk frugt ved hjælp af en comparator
    public String minFruitWithComparator() {
        return Collections.min(fruits, Comparator.reverseOrder());
    }
}
