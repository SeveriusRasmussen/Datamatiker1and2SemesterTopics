package Semester1.EksamenEmner.MainTopic.Loops.DoWhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
        Do-While is an Exit control loop.
        Unlike for or while loop,
        a do-while check for the condition after
        executing the statements of the loop body.
         */

        int c = 1;

        // Using do-while loop:
        do {
            System.out.println("Hello the number is " + c);
            c++;
        } while (c <= 5);

        // Well here is what happened:
        // The Do-While do something first, then the while checks the condition is true or not.
    }

}
