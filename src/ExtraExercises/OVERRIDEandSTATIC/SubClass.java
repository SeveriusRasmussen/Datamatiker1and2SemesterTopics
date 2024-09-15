package ExtraExercises.OVERRIDE;

public class SubClass extends SuperClass {
    // SubClass en statisk metode
    // Skjuler myMethod fra SuperClass
    public static void myMethod() {
        System.out.println("SubClass myMethod");
    }

    // SubClass der overstyrer myMethod
    /*
    @Override
    public void myMethod() {
        System.out.println("SubClass myMethod");
    }

     */


}
