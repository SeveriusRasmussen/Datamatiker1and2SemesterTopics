package Semester2.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        // Forsøg på at få Singleton-instansen
        Singleton singleton = Singleton.getInstance();

        // Kalder en metode på Singleton-instansen
        singleton.showMessage();
    }
}
