package Semester1.EksamenEmner.ExtraTopic.Overloading;

public class Overloading {
    public static void main(String[] args) {

        // Make a variable that take the method with int and string
        String antalFrugt = tekst(5, "Æbler");
        System.out.println(antalFrugt);

        // Make a variable that take the method with two strings
        String cheering = tekst("Hello", "Peter!");
        System.out.println(cheering);

        // Call the Void method "Tekst"
        tekst();

        // Notice that the methods has the same name? This is overloading.
        // They just need to have different parameters.
    }

    public static String tekst(int a, String b) {
        return a + " " + b;
    }

    public static String tekst(String a, String b) {
        return a + b;
    }

    public static void tekst() {
        System.out.println("Hello world!");
    }
}
