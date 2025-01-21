package Semester1.EksamenEmner.MainTopic.interfacePolymorphism.Interface.MultiInterfaces;

// Here the main part of Multi Interface is with the comma and both interfaces.
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some Text...");
    }

    public void myOtherMethod() {
        System.out.println("Some other Text...");
    }
}
