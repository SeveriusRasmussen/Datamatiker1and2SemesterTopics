package codeStepByStep.BigOh;



public class Answers {
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
    }
    /* BigOh 1
        a)
        Her har vi to løkker.
        Den første løkke kører N + 2 gange, og den anden løkke kører 2N gange.
        Da de ikke er næstede, kan vi blot addere deres kompleksiteter.
        Derfor er Big Oh-noteringen for dette eksempel O(N + 2N) = O(3N) = O(N).

        b)
        Her har vi en næste løkke.
        Den ydre løkke kører N - 5 gange, og den indre løkke kører (N - 5)/2 gange
        (da den kun kører for hver anden værdi af j).
        Derfor er Big Oh-noteringen for dette eksempel O((N - 5) * (N - 5)/2) = O(N^2).

        c)
        Her har vi en løkke, der kører 1.000.000 gange, og inde i denne løkke har vi tre næstede løkker, der hver kører i gange.
        Da i maksimalt kan være 1.000.000, kan vi sige, at hver af de tre løkker maksimalt kører 1.000.000 gange.
        Derfor er Big Oh-noteringen for dette eksempel O(1.000.000 * 1.000.000) = O(10^12).
        Men da N ikke er involveret i denne kompleksitet, kan vi sige, at dette eksempel har en konstant kompleksitet, O(1), i forhold til N.

        d)
        Her har vi to løkker.
        Den første løkke kører N^2 gange, og den anden løkke kører 2N gange.
        Da de ikke er næstede, kan vi blot addere deres kompleksiteter.
        Derfor er Big Oh-noteringen for dette eksempel O(N^2 + 2N) = O(N^2).

        e)
        Her har vi to løkker, der hver kører N gange.
        Da de ikke er næstede, kan vi blot addere deres kompleksiteter.
        Derfor er Big Oh-noteringen for dette eksempel O(N + N) = O(2N) = O(N).
            */
}
