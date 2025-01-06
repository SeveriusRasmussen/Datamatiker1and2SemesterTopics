package codeStepByStep.BigOh1;

import java.util.HashSet;
import java.util.TreeSet;

public class e {
    public static void main(String[] args) {
        // e)
        int N = 1;
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            set1.add(i);
        }

        TreeSet<Integer> set2 = new TreeSet<>();
        for (int i = 1; i <= N; i++) {
            set1.remove(i);
            set2.add(i + N);
        }
        System.out.println("done!");

        // 0(N log N)
        /*
        e)
        Her har vi to løkker, der hver kører N gange.
        Da de ikke er nested, kan vi blot addere deres kompleksiteter.
        Derfor er Big Oh-noteringen for dette eksempel 0(N log N) = O(N + N) = O(2N) = O(N).

        */
    }
}
