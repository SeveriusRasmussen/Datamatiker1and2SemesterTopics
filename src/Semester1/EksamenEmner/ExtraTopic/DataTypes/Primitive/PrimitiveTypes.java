package Semester1.EksamenEmner.ExtraTopic.DataTypes.Primitive;

import org.w3c.dom.ls.LSOutput;

public class PrimitiveTypes {
    // Jeg springer over access modifier for at spare tiden.
    // Der er heltal, decimals, characters, boolean (true eller false)

    // Forskellige type af integer (Heltal) med deres max og min tal:
    byte antal = 127;
    byte antal2 = -128;

    short tal = 32767;
    short tal2 = -32768;

    int number = 2147483647;
    int number2 = -2147483648;

    long digits = 9223372036854775807L; // BEMÆRK: Bruge L ved enden!
    long digits2 = -9223372036854775808L;

    // Forskellige type af decimals (Flydende komma type) med deres max og min tal:
    float littleDecimal = 3.2342342f; // Bare 6-7 decimal digits med f
    static double bigDecimal = 3.234234223423425322342342;
    /* Mærkeligt ved double er, at det kun viser 15-16 decimal ved printout. */

    public static void main(String[] args) {
        System.out.println(bigDecimal);
    }

    // Characters (Kun ÉN tegn):
    char bogstav = 'A';

    // Boolean (Kan kun have "True" eller "False" som data.
    boolean trueOrFalse = true;
}
