package Semester1.Gamle1SemesterEmner.Files.CheckFileExist;

import java.io.File;
import java.io.FileNotFoundException;

/*
Man skal have den fuld path til filen for at få adgang, ellers får man error besked.

Man kan sætte kopi af en file på en nemt måde:
 -> Kopi path/reference -> Path from Content Root

 OBS: Hvis man vil bruge så simpelt som "tekstFile"
 Så skal filen være i uden for "src"-mappen. Altså ind i projektet's mappen.


 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Tjekke om .txt filen ligger i mappen som den her.
        File f = new File("src/Semester1/Gamle1SemesterEmner/Files/tekstFile");
        System.out.println("exists returns " + f.exists());
        System.out.println("canRead returns " + f.canRead());
        System.out.println("length returns " + f.length());
        System.out.println("getAbsolutePath returns " + f.getAbsolutePath() + "\n");

        //Hvis man vil have den simpelt måde. Så se det her:
        File f2 = new File("tekstFile2");
        System.out.println("exists returns " + f2.exists());
        System.out.println("canRead returns " + f2.canRead());
        System.out.println("length returns " + f2.length());
        System.out.println("getAbsolutePath returns " + f2.getAbsolutePath());
    }
}
