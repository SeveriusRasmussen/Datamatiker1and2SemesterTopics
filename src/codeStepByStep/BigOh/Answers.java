package codeStepByStep.BigOh;



public class Answers {
    public static void main(String[] args) {
        int N = 5; //TODO skal finde ud af.
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
        A)
        B)
        C)
    */
}
