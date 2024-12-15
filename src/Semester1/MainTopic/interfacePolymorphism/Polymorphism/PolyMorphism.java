package Semester1.MainTopic.interfacePolymorphism.Polymorphism;

public class PolyMorphism {
    // Main driver method
    public static void main(String[] args) {
        /*
        Polymorphism means "Many Forms".
        In simple words, we can define Java polymorphism as the ability
        of a message to be displayed in more than one form.

        Real-life example:
            A man can be Dad, Employee, Husband, Uncle at the same time.
            The same person possesses different behaviors in different situations.
        */

        // Calling methods from Helper class.
        // input as in arguments
        System.out.println(Helper.Multiply(2, 4));
        System.out.println(Helper.Multiply(5.5, 6.3));

        // This way you can calculate the numbers whatever that is INT or DOUBLE.
        // Notice there is method with same name?
        // Because there are TWO Methods in the Helper class, one for INT and one for DOUBLE.
        // Isn't that smart?!
    }
}
