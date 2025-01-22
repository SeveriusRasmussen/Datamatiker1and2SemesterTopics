package Semester1.EksamenEmner.MainTopic.MethodsAndParameters.VoidAndReturnMethods;


public class VoidAndReturnMethods {
    public static void main(String[] args) {
        // Void method (Returns nothing but direct output from the code block.)
        MethodVoid();

        // Return method (Returns something based on the datatype.)
        String result = MethodReturnString();
        System.out.println(result);
    }

    public static void MethodVoid() {
        System.out.println("Hello World, Void method!");
    }

    public static String MethodReturnString() {
       return "Hello World, Return method!";
    }

    // This is an error. Because the return need to be an integer datatype, not a String.
    /*
    public static int MethodReturnInt() { return "hello world!"; }
     */
}
