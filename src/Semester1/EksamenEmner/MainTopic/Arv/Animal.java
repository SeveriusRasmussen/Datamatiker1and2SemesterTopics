package Semester1.EksamenEmner.MainTopic.Arv;

// Denne klasse er en super-klasse, Dog og Cat er sub-klasser
// Dette øvelse er læring om DRY! (Don't Repeat Yourself!)
public class Animal {
    // Lave attributter som sub-klassen har i fælles.
    protected String name;
    protected int age;

    // Lav konstruktør så skal man ikke skrive den samme igen i sub-klassen.
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Lav metoder til sub-klassen
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // metode til at lave lyd (skal overrides af subklasser)
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    // metode til at vise information
    public void showInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}