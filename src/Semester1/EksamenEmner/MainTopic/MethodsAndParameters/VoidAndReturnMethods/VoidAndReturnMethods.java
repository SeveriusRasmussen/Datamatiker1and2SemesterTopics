package Semester1.EksamenEmner.MainTopic.MethodsAndParameters.VoidAndReturnMethods;


public class VoidAndReturnMethods {
    public static void main(String[] args) {
        // Void method
        MethodVoid();

        // Return method
        String result = MethodReturn();
        System.out.println(result);
    }

    public static void MethodVoid() {
        System.out.println("Hello World, Void method!");
    }

    public static String MethodReturn() {
       return "Hello World, Return method!";
    }
}
