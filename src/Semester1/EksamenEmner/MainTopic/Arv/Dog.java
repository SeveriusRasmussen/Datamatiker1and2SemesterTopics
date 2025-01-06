package Semester1.EksamenEmner.MainTopic.Arv;

public class Dog extends Animal {
    //Lav attributter som kun Dog har.
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Kalder konstruktør fra super-klassen
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks");
    }

    // Specifik metode for hund
    public void fetch() {
        System.out.println(name + " is fetching a ball");
    }

    // Info med dyrets specifikke attributter.
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Breed: " + breed);
    }

    //Hvis man har brug for at ændre lidt i eat-metode i super-klassen.
    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }
}
