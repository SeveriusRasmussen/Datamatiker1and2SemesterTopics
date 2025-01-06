package Semester1.EksamenEmner.MainTopic.Arv;

public class Cat extends Animal {
    //Lav attributter som kun Cat har.
    public boolean mood;

    public Cat(String name, int age, boolean mood) {
        super(name, age);
        this.mood = mood;
    }

    public void showMood() {
        if (mood) {
            System.out.println(name + " is happy");
        } else {
            System.out.println(name + " is angry");
        }
    }

    public void makeSound() {
        System.out.println(name + " meows");
    }

    public void lick() {
        System.out.println(name + " is licking itself.");
    }

    //Hvis man har brug for at ændre lidt i eat-metode i super-klassen.
    @Override
    public void eat() {
        System.out.println(name + " is eating cat food.");
    }
}
