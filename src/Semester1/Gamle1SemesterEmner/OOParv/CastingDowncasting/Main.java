package Semester1.Gamle1SemesterEmner.OOParv.CastingDowncasting;

public class Main {
    public static void main(String[] args) {
        // Upcasting: Dog-objektet behandles som et Animal-objekt
        Animal animal = new Dog(); // Upcasting
        animal.makeSound(); // Dette vil køre Dog's makeSound() på grund af polymorfi

        // Downcasting
        Dog myDog = (Dog) animal;
        myDog.fetch();
    }
}
