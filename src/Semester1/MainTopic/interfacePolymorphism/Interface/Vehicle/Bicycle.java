package Semester1.MainTopic.interfacePolymorphism.Interface.Vehicle;

public class Bicycle implements Vehicle {

    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    // To increase speed
    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    // To decrease speed
    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("speed: " + speed + " gear: " + gear);
    }
}
