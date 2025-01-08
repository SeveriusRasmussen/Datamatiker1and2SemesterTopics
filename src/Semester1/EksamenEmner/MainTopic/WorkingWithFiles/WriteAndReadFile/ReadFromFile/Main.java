package Semester1.EksamenEmner.MainTopic.WorkingWithFiles.WriteAndReadFile.ReadFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File f = new File("src/Semester1/EksamenEmner/MainTopic/WorkingWithFiles/textFile");
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}