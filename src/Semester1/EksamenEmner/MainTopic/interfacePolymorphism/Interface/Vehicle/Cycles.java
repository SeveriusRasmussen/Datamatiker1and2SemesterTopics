package Semester1.EksamenEmner.MainTopic.interfacePolymorphism.Interface.Vehicle;

public class Cycles {
    public static void main(String[] args) {
        // Bicycle
        Bicycle bc = new Bicycle();
        bc.changeGear(2);
        bc.speedUp(4);
        bc.applyBrakes(1);

        System.out.println("Bicycle present state :");
        bc.printStates();

        // Bike
        Bike b = new Bike();
        b.changeGear(2);
        b.speedUp(5);
        b.applyBrakes(1);

        System.out.println("Bike present state :");
        b.printStates();
    }
}
