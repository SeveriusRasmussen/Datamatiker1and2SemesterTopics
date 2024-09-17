package Semester1.Gamle1SemesterEmner.ObjectOrientedProgrammering.PrivatePublicProtectedPackage;

public class Main {

    /*
    Package-private variabel (Ingen adgangsmodifikator)
    Hvis man ikke angiver nogen adgangsmodifikator, antages det at være package-private.
    Dette betyder, at metoder og variabler kan tilgås af andre klasser i den samme pakke,
    men ikke af klasser i andre pakker.
    */
    int defaultAccessVar;

    // Public variabel (Kan tilgås fra enhver klasse)
    public int publicVar;

    // Private Variabel (Kan kun tilgås inden for den samme klasse.)
    private int privateVar;

    // Protected Variabel (Kan tilgås inden for samme pakke og af subklasser, selv udenfor pakken.)
    protected int protectedVar;
}
