package Semester1.EksamenEmner.MainTopic.interfacePolymorphism.Interface.Vehicle;

public class Bicycle implements Vehicle {

    int speed;
    int gear;

    // to change gear
    public void changeGear(int newGear) {
        gear = newGear;
    }

    // To increase speed
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    // To decrease speed
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}
