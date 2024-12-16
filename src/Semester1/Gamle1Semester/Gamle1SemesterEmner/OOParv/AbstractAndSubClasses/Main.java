package Semester1.Gamle1Semester.Gamle1SemesterEmner.OOParv.AbstractAndSubClasses;

/*
Abstrakte klasse (Animal klassen) er en klasse, der ikke kan instantieres. Den bruges som skabelon for subklasser,
der skal implementere de abstrakte metoder, som er defineret uden krop i den abstrakte klasse.
 */

public class Main {
    public static void main(String[] args) {
        Animal fido = new Dog();
        //Animal fido2 = new Animal();  <-- Can't be instantiated
        fido.makeSound();
    }
}
