package Semester1.EksamenEmner.MainTopic.WorkingWithFiles.WriteAndReadFile.WriteToFile.WriteAndAddToFile;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAndAddToFileMain {
    public static void main(String[] args) {
        try {
            // opret FileWriter med append-parameteren sat til true
            FileWriter myWriter = new FileWriter("src/Semester1/EksamenEmner/MainTopic/WorkingWithFiles/textFile", true);
            myWriter.write("Appending text to the file.\n"); //Appending is like adding.
            myWriter.close();
            System.out.println("Successfully appended to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
