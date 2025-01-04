package Semester1.EksamenEmner.MainTopic.interfacePolymorphism.Interface.Animal;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
