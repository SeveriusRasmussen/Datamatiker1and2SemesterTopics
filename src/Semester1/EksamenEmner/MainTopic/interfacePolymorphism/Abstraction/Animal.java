package Semester1.EksamenEmner.MainTopic.interfacePolymorphism.Abstraction;

// Abstract Class
abstract class Animal {
    // Abstract Method (does not have a body)
    public abstract void animalSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}
