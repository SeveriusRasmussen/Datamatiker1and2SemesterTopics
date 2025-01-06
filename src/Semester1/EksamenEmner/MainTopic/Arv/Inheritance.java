package Semester1.EksamenEmner.MainTopic.Arv;

public class Inheritance {
    public static void main(String[] args) {
        // opret en animal objekt
        Animal myAnimal = new Animal("Søren", 35);
        myAnimal.showInfo();
        myAnimal.makeSound();
        myAnimal.eat();

        // opret en dog objekt
        Dog myDog = new Dog("Fido", 8, "Bernhard");
        myDog.showInfo();
        myDog.makeSound();
        myDog.eat();
        myDog.fetch();

        // opret en cat objekt
        Cat myCat = new Cat("Felix", 10, true);
        myCat.showInfo();
        myCat.makeSound();
        myCat.showMood();
        myCat.eat();
        myCat.lick();
        myCat.sleep();

        // Anderledes måde at skrive ny objekt på:
        Animal myCat1 = new Cat("Garfield", 4, false);
        myCat1.makeSound();
        /*
        Man kan bruge 'Animal' i stedet for 'Cat',
        men det kan ikke bruge Cat's metoder selvom new Cat();
        fordi det er kun metoder i Animal klassen man kan bruge.
        Altså myCat1.showMood(); kan ikke bruges.

        En anden eksempel:
            Man har klasserne:
                public class Vehicle {...}
                public class Car extends Vehicle {...}
                public class SUV extends Car {...}

            Så disse er korrekte sætninger i java:
            SUV s = new SUV();
            Vehicle v = new SUV();
            Car c = new SUV();
            Vehicle v = new Car();

            Disse er IKKE KORREKTE!
            SUV s = new Car();
            Car c = new Vehicle();
            Begrundelse:
            SUV er ikke Car's Super klasse
            Samme glæder for Car, Vehicle er Superklassen, ikke subklassen!
        */
    }
}
