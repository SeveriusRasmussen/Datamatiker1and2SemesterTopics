package Semester1.EksamenEmner.MainTopic.Loops.NestedForLoop;

public class NestedForLoop {
    public static void main(String[] args) {
        /*
        Nested For-loop is used for iterate multi loops
         */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2; j++) {
                System.out.println("Hello the number is " + i + "," + j);
            }
        }
    }
}
