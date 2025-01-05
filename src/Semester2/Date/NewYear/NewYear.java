package Semester2.Date.NewYear;

import java.time.LocalTime;

public class NewYear {
    public static void main(String[] args) {
        // Definer det ønskede tidspunkt
        LocalTime targetTime = LocalTime.of(0, 0, 0);

        // Kontroller tiden kontinuerligt
        while (true) {
            // Hent den aktuelle tid
            LocalTime currentTime = LocalTime.now();

            // Vis den aktuelle tid
            System.out.println("Current time: " + currentTime);

            // Tjek om den aktuelle tid er lig med det ønskede tidspunkt
            if (currentTime.getHour() == targetTime.getHour() &&
                currentTime.getMinute() == targetTime.getMinute() &&
                currentTime.getSecond() == targetTime.getSecond()) {
                System.out.println("Det er nu 00:00:00!");
                break; // Afslut løkken, når det ønskede tidspunkt er nået
            }

            // Vent et sekund før næste kontrol for at undgå at spamme konsollen
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
