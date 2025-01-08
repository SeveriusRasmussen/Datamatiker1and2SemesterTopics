package Semester1.EksamenEmner.MainTopic.MethodsAndParameters.MethodCall;

public class MethodCall {
    public static void main(String[] args) {
        //Method call from this class
        MethodCall example = new MethodCall();
        example.callMethod();

        //Static Method call from this class
        callStaticMethod();

        //Method call from the other class
        Methods example2 = new Methods();
        example2.callMethod();

        //Static Method call from the other class
        Methods.callStaticMethod();
    }

    public static void callStaticMethod() {
        System.out.println("Hello Static Method!");
    }

    public void callMethod() {
        System.out.println("Hello Method");
    }
}
