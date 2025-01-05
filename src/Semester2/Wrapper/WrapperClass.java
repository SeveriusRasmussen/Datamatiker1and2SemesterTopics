package Semester2.Wrapper;

public class WrapperClass {
    public static void main(String[] args) {

        Integer myInt = 5;  // Could use "int" instead
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // This will output the same result as above
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // toString is useful for convert wrapper class objects to strings
        Integer myInt2 = 100;
        String myString = myInt2.toString();
        System.out.println(myString.length());
    }
}
