package Semester1.Gamle1SemesterEmner.OOParv.Protected;

public class Main {
    /*
    Om Protected: Tjek i ObjectOrientedProgrammering mappen -> PrivatePublicProtectedPackage
    Her i OOP handler Protected om at hvordan man bruger protected i Super/sub klasser.
     */
    public static void main(String[] args) {
        Dog hund = new Dog();
        hund.printType();
        // 'Dog.printType();' can't be used cause no static on the method from Dog-class.
    }
}
