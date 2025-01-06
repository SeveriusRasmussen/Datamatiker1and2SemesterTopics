package Semester1.EksamenEmner.MainTopic.Arrays.RealLifeExamples;

public class AverageAges {
    public static void main(String[] args) {
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Loop through the elements of the array
        for (int age : ages) {
            sum += age; //Adding the ages in one sum
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;
        // like this: (20+22+...+70)/8 = average age.

        // Print the average age
        System.out.println("The average age is: " + avg);
    }
}
