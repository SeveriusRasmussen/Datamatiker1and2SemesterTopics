package Semester1.EksamenEmner.MainTopic.KlasserObjekter;

public class MainKlasseObjekter {
    public static void main(String[] args) {

        KlasseObjekt newPerson = new KlasseObjekt("Søren", 36, 'M');
        KlasseObjekt newPerson2 = new KlasseObjekt("Karina", 34, 'F');

        System.out.println(newPerson);
        System.out.println(newPerson2);

        System.out.println(newPerson2.getName() + " er ret glad for " + newPerson.getName() + ", derfor er de gift");
    }
}
