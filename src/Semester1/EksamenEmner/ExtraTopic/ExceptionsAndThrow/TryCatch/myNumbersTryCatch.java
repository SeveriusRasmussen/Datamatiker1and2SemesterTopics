package Semester1.EksamenEmner.ExtraTopic.ExceptionsAndThrow.TryCatch;

public class myNumbersTryCatch {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3, 4, 5};
            // This would be executed without problem
            System.out.println(myNumbers[2]);
            // This would get error which the catch part would catch into to avoid error message.
            System.out.println(myNumbers[10]);
            // This wouldn't get executed since the code is already "caught".
            System.out.println(myNumbers[2]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("The 'try catch' is finished");
        }
    }
}
