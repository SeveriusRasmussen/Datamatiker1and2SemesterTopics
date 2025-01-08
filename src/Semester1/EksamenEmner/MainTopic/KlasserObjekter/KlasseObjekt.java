package Semester1.EksamenEmner.MainTopic.KlasserObjekter;

public class KlasseObjekt {
    private String name;
    private int age;
    private char gender;

    public KlasseObjekt(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        String genderResult;
        String pronounce;
        if (gender == 'M') {
            pronounce = "han";
            genderResult = "Mand";
        } else {
            pronounce = "hun";
            genderResult = "Kvinde";
        }
        return name + " er " + age + " år, og " + pronounce + " er " + genderResult;
    }
}
