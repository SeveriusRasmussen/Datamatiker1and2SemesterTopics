package Semester1.Gamle1Semester.Gamle1SemesterEmner.OOParv.CastingDowncasting;


public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
    void fetch() {
        System.out.println("Dog is fetching a ball");
    }
}
