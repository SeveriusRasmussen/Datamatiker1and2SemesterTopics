package Semester1.EksamenEmner.MainTopic.interfacePolymorphism.Interface.ENUM;

public class Main {
    public static void main(String[] args) {
        // ENUM in a Switch case
        Level myVar = Level.MEDIUM;

        switch(myVar) {
            case LOW:
                System.out.println("Low level!!");
                break;
            case MEDIUM:
                System.out.println("Medium level.");
                break;
            case HIGH:
                System.out.println("HIGH LEVEL");
                break;
        }

        // Loop through a ENUM class.
        for (Level myVar2 : Level.values()) {
            System.out.println(myVar2);
        }
    }
}
