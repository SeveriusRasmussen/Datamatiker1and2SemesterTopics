package Semester1.Gamle1SemesterEmner.OOParv.InstanceOfAndEnhanced;

public class Main {
    public static void main(String[] args) {
        Animal fido = new Dog();
        Animal felix = new Cat();

        // The instanceof print out the makeSound() if the object fido is a dog.
        if (fido instanceof Dog dog) { // Enhanced instanceof
            dog.makeSound(); // Automatisk casting til Dog
        } else {
            System.out.println("Not a dog");
        }
        // The instanceof found error because felix is a cat, not a dog.
        if (felix instanceof Dog dog) { // Enhanced instanceof
            dog.makeSound(); // Automatisk casting til Dog
        } else {
            System.out.println("Not a dog");
        }
        // Correct way to use the cat named felix.
        if (felix instanceof Cat cat) { // Enhanced instanceof
            cat.makeSound(); // Automatisk casting til Dog
        } else {
            System.out.println("Not a cat");
        }

    }
}
