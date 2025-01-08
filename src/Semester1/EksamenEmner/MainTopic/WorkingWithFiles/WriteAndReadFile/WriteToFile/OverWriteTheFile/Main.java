package Semester1.EksamenEmner.MainTopic.WorkingWithFiles.WriteAndReadFile.WriteToFile.OverWriteTheFile;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Opret FileWriter til at overskriv filen. UDEN den booleansk 'True'.
            FileWriter myWriter = new FileWriter("src/Semester1/EksamenEmner/MainTopic/WorkingWithFiles/textFile");
            myWriter.write("file overwrote.\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}