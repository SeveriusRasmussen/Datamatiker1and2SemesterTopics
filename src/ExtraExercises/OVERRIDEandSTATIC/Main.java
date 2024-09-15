package ExtraExercises.OVERRIDE;

/*
Det her viser forskellen på instansmetoder med @Override og statisk metoder (uden @Override)
    Override:
        Polymorfisme:
            @Override gør det muligt at udnytte polymorfisme ("many forms") i objektorienteret programmering.
            Polymorfisme tillader dig at behandle objekter af forskellige klasser på en ensartet måde via en
            fælles superklasse eller et interface.

            Når du overstyrer metoder fra en superklasse,
            kan du ændre adfærden af metoden i underklassen og sikre,
            at objekter af denne underklasse opfører sig på en bestemt måde.

        Korrekt implementering:
            @Override hjælper med at sikre, at du faktisk overstyrer en metode fra en superklasse.
            Hvis du laver en tastefejl i metodens navn eller parameterliste, vil kompilatoren give en fejl,
            hvilket kan forhindre potentielle bugs.

        Bedre Struktur og Vedligeholdelse:
            Ved at bruge instansmetoder og @Override kan du opbygge en hierarkisk struktur,
            der er nemmere at vedligeholde.
            Du kan ændre adfærden i underklasser uden at ændre grundklassen eller bryde eksisterende kode.

    Statiske metoder:
        Mindre Fleksibilitet:
            Statiske metoder er bundet til klassen og kan ikke udnytte polymorfisme.
            Du kan ikke ændre adfærden af en statisk metode baseret på objektets type.
        Mangel på Polymorfisme:
                          
 */

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
