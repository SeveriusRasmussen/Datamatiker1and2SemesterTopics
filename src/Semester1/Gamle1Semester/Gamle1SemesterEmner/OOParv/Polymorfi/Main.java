package Semester1.Gamle1Semester.Gamle1SemesterEmner.OOParv.Polymorfi;

/*
Polymorfi betyder, at du kan bruge en superklasse-reference til at arbejde med et subklasse-objekt.
Det gør det muligt at skrive mere generel kode.
 */

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Polymorfi

        myAnimal.makeSound(); // Kører Dog's version af makeSound
    }
}
