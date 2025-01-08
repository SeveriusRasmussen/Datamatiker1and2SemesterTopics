package Semester1.EksamenEmner.MainTopic.WorkingWithFiles.CreateAndDeleteFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
// Hvis man vil have switch case kørende, så blot kode:
// 'boolean running = true;' og 'while (running) {switch case herinde} input.close();'
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true; // flag for at holde loopet kørende

        while (running) {
            System.out.println("""
                    Choose one:
                         1. To create a new .txt file
                         2. To delete a existing .txt file
                         3. Exit the menu.
                    """);
            int choice = input.nextInt();
            input.nextLine(); // Forbruger den ekstra newLine-tegn.
            switch (choice) {
                case 1:
                    createFile();
                    break;
                case 2:
                    deleteFile();
                    break;
                case 3:
                    System.out.println("Exiting the program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input. Exiting.");
                    System.exit(0);
                    break;
            }
        }
        input.close(); // luk scanner til sidst.
    }

    // CREATE FILE her:
    public static void createFile() {
        try {
            File myObj = new File("src/Semester1/EksamenEmner/MainTopic/WorkingWithFiles/newTekstFile");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // DELETE FILE her:
    public static void deleteFile() {
        File myObj = new File("src/Semester1/EksamenEmner/MainTopic/WorkingWithFiles/newTekstFile");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}