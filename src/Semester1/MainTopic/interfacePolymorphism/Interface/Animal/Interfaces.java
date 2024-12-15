package Semester1.MainTopic.interfacePolymorphism.Interface.Animal;

public class Interfaces {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Output: Woof
        myDog.eat(); // Output: Dog is eating

        myCat.makeSound(); // Output: Meow
        myCat.eat(); // Output: Cat is eating
    }
}
