package Semester1.EksamenEmner.MainTopic.ArrayList.Fruits;

public class Fruit {
    // Attributes
    public String name;
    public String color;

    // Constructor
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // toString til udprint af Fruit-klassen.
    @Override
    public String toString() {
        return name + " (" + color + ")";
    }
}
