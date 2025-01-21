package Semester1.EksamenEmner.MainTopic.interfacePolymorphism.Abstraction;

public class Main {
    public static void main(String[] args) {
        // Can't make an object of Animal class because abstract class.
        // But the pig class can be used as object since it's not abstract.
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
