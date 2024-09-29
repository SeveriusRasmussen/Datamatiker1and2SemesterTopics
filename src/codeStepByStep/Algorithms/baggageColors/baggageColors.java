package codeStepByStep.Algorithms.baggageColors;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class baggageColors {
    public static void main(String[] args) {

        //___TEST ONLY___ no method and only "shiny gold bag"
        // try/catch is used to see the file is available or not.
        try {
            File f = new File("src/codeStepByStep/Algorithms/baggageColors/baggage");
            Scanner myReader = new Scanner(f);
            int count = 0;
            while (myReader.hasNextLine()) {
               String shiny = myReader.nextLine();
               if (shiny.contains("shiny gold bag")) {
                   count += 1;
               }
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        System.out.println(baggageColors("src/codeStepByStep/Algorithms/baggageColors/baggage"));
    }
    //___The Method for the exercise.___
    public static int baggageColors(String fileName) {
        int count = 0;
        try {
            File f = new File(fileName);
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()) {
                String shiny = myReader.nextLine();
                if (shiny.contains("shiny gold bag")) {
                    count += 1;
                }
                if (shiny.contains(" shiny gold bag")) {
                    count += 1;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return count;
    }
}
