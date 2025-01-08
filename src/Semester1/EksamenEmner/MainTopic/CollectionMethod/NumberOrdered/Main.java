package Semester1.EksamenEmner.MainTopic.CollectionMethod.NumberOrdered;

public class Main {
    public static void main(String[] args) {
        NumberList myNumList = new NumberList();
        myNumList.printNumbers(); // Udskriver de oprindelige tal

        myNumList.sortNumbers(); // Sorterer tallene
        myNumList.printNumbers(); // Udskriver de sorterede tal

        // Adder et tal 4 til listen og se hvad sker.
        myNumList.addNumber(4);
        myNumList.printNumbers();
        // Nu er 4 foran 10 i listen er i forvejen sorteret, nu er det ødelagt igen.
        myNumList.sortNumbers();
        myNumList.printNumbers();
        // Nu bliver alt god igen.
    }
}
