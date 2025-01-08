package ExtraExercises.randomTrueOrFalse;

public class randomBoolean {
    public static void main(String[] args) {
        System.out.println(falseOrTrue());

    }

    public static boolean falseOrTrue() {
        double theResult = Math.random();
        if (theResult >= 0.50) {
            return true;
        } else {
            return false;
        }
    }
}
