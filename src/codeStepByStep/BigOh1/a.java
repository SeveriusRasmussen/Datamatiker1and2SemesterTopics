package codeStepByStep.BigOh1;

public class a {
    public static void main(String[] args) {
        //_____BigOh1 A)_____
        int N = 1; // Skal have en variable for at fungere.
        int sum = 0;
        for (int i = 1; i <= N + 2; i++) {
            sum++;
        }
        for (int j = 1; j <= N * 2; j++) {
            sum += 5;
        }
        System.out.println(sum);

        // 0(N)
        /*
        a)
        Her har vi to løkker.
        Den første løkke kører N + 2 gange, og den anden løkke kører 2N gange.
        Da de ikke er nested, kan vi blot addere deres kompleksiteter.
        Derfor er Big Oh-noteringen for dette eksempel O(N + 2N) = O(3N) = O(N).
        */
    }
}
