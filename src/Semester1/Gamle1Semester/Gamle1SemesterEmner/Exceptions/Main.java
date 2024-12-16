package Semester1.Gamle1Semester.Gamle1SemesterEmner.Exceptions;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File txt = new File("src/Semester1/Gamle1SemesterEmner/Exceptions/tekstFile");
            System.out.println(txt.exists());
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }
}
