package ExtraExercises.OVERRIDEandSTATIC;

public class Main {
    public static void main(String[] args) {
        // Statisk Metoder (uden @Override)
        // Kalder den statiske metode fra SuperClass
        SuperClass.myMethod();

        // Kalder den statiske metode fra SubClass
        SubClass.myMethod();

        // instansmetoder med @Override:
        //----alternative med @Override istedet for statisk metoder.
        /*
        //Opretter en instans af SuperClass
        SuperClass superClassInstance = new SuperClass();
        // Kalder myMethod() på SuperClass instansen
        superClassInstance.myMethod(); // Output: SuperClass myMethod

        //Opretter en instans af SubClass
        SubClass subClassInstance = new SubClass();
        // Kalder myMethod() på SubClass instansen
        subClassInstance.myMethod(); // Output: SubClass myMethod
         */
    }
}
