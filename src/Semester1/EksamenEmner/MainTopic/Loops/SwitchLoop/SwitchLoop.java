package Semester1.EksamenEmner.MainTopic.Loops.SwitchLoop;

public class SwitchLoop {
    public static void main(String[] args) {
        switchLoop();
    }

    public static void switchLoop() {
        while (true) {
            int number = (int)((Math.random() * 6) + 1); // Rolls from 1 to 6, since Math.random starts from 0.
            System.out.println(number); // Prints the number
            // Switch with different names based on the number on the rolled number from Math.random.
            switch (number) {
                case 1:
                    System.out.println("Hello Uruk!");
                    break;
                case 2:
                    System.out.println("Hello Malros!");
                    break;
                case 3:
                    System.out.println("Hello Vakil");
                    break;
                case 4:
                    System.out.println("Hello Varis");
                    break;
                case 5:
                    System.out.println("Hello Måne!");
                    break;
                case 6:
                    System.out.println("Hello DM!");
                    break;
            }

            // a Try/catch to make a pause between rolls
            try {
                int pause = (int)((Math.random() * 5000) + 1000); // Tilfældig pause 5-6 sekunder.
                System.out.println("Pausing for " + (pause / 1000) + " seconds...\n");
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                System.err.println("Interrupted: " + e.getMessage());
            }
            // Try/catch is needed because the Thread.sleep can't be done without.
        }
    }
}
