package Semester1.EksamenEmner.MainTopic.MethodsAndParameters.MethodWithParameters;

import java.util.Scanner;

public class MainMethods {
    public static void main(String[] args) {

        // This will return the result but not any output
        MethodWithParameters.addNumbers(2,3);

        // This will print to the output.
        int result = MethodWithParameters.addNumbers(3, 7);
        System.out.println(result);

        // This will print strings to the output.
        String result2 = MethodWithParameters.addTexts("Hello", "World");
        System.out.println(result2);
    }
}
