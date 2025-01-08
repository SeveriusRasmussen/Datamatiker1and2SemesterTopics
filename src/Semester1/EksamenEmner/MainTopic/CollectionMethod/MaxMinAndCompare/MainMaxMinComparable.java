package Semester1.EksamenEmner.MainTopic.CollectionMethod.MaxMinAndCompare;

public class MainMaxMinComparable {
    public static void main(String[] args) {
        MaxMinComparable object = new MaxMinComparable();
        object.addFruit("Apple");
        object.addFruit("Banana");
        object.addFruit("Orange");
        object.addFruit("Kiwi");
        object.addFruit("Mango");
        object.addFruit("Papaya");

        object.addNumber(10);
        object.addNumber(20);
        object.addNumber(5);
        object.addNumber(45);
        object.addNumber(17);

        System.out.println("Min fruit (natural order): " + object.minFruit());
        System.out.println("Max fruit (natural order): " + object.maxFruit());

        System.out.println("Min number: " + object.minNumber());
        System.out.println("Max number: " + object.maxNumber());

        System.out.println("Min fruit (reverse order): " + object.minFruitWithComparator());
        System.out.println("Max fruit (reverse order): " + object.maxFruitWithComparator());
    }
}
