package Semester2.Singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
            System.out.println("instance has been created!");
        } else {
            System.out.println("Something is wrong.");
        }
        return uniqueInstance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
