package codeStepByStep.BigOh1;

public class b {
    public static void main(String[] args) {
        // b)
        int N = 1;
        int sum = 0;
        for (int i = 1; i <= N - 5; i++) {
            for (int j = 1; j <= N - 5; j += 2) {
                sum++;
            }
        }
        System.out.println(sum);

        // 0(N^2)
        /*
        b)
        Her har vi en næste løkke.
        Den ydre løkke kører N - 5 gange, og den indre løkke kører (N - 5)/2 gange
        (da den kun kører for hver anden værdi af j).
        Derfor er Big Oh-noteringen for dette eksempel O((N - 5) * (N - 5)/2) = O(N^2).

         */
    }
}
