package codeStepByStep.BigOh1;

public class c {
    public static void main(String[] args) {
        // c)
        int N = 1;
        int sum = N;
        for (int i = 0; i < 1000000; i++) {
            for (int j = 1; j <= i; j++) {
                sum += N;
            }
            for (int j = 1; j <= i; j++) {
                sum += N;
            }
            for (int j = 1; j <= i; j++) {
                sum += N;
            }
        }
        System.out.println(sum);

        // 0(1)
        /*
        c)
        Her har vi en løkke, der kører 1.000.000 gange, og inde i denne løkke har vi tre nested løkker, der hver kører i gange.
        Da i maksimalt kan være 1.000.000, kan vi sige, at hver af de tre løkker maksimalt kører 1.000.000 gange.
        Derfor er Big Oh-noteringen for dette eksempel O(1.000.000 * 1.000.000) = O(10^12).
        Men da N ikke er involveret i denne kompleksitet, kan vi sige, at dette eksempel har en konstant kompleksitet, O(1), i forhold til N.

         */
    }
}
