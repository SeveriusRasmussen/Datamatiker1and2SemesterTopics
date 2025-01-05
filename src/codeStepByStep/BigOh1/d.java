package codeStepByStep.BigOh1;

import java.util.ArrayList;

public class d {
    public static void main(String[] args) {
        // d)
        int N = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= N * N; i++) {
            for (int j = 1; j <= N; j++) {
                list.add(i + j);
            }
        }

        for (int i = 1; i <= 2 * N; i++) {
            list.remove(list.size() - 1);
        }
        System.out.println("done!");

        // 0(N^3)
        /*
        d)
        Her har vi to løkker.
        Den første løkke kører N^2 gange, og den anden løkke kører 2N gange.
        Da de ikke er næstede, kan vi blot addere deres kompleksiteter.
        Derfor er Big Oh-noteringen for dette eksempel O(N^2 + 2N) = O(N^2).

         */
    }
}
