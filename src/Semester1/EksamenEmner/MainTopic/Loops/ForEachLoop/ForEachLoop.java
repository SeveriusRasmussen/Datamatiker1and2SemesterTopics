package Semester1.EksamenEmner.MainTopic.Loops.ForEachLoop;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
        The For-each loop is used for iteration over arrays and Collections (Arraylist, LinkedList etc.).
        This loop is easier to use than the normal for-loop for lists.
         */

        int array[] = {1,2,3,4,5};

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
