package StudentRoster;

import java.util.Scanner;

public class Time {
    public static void timeConverter() {
        int choice;

        Scanner newChoice = new Scanner(System.in);
        System.out.println("Choose number from 1 to 4 to convert");
        System.out.println("1 is to convert Hour to Minute\n2 is to convert Days to Hours\n3 is to convert Minutes to Hours\n4 is to convert Hours to Days\n");
        System.out.print("Choice: ");
        choice = newChoice.nextInt();

        switch (choice) {
            case 1 -> HourToMinute.convertHourToMinute();
            case 2 -> DaysToHours.computeDaysToHours();
            case 3 -> MinutesToHours.convertMinuteToHour();
            case 4 -> HoursToDays.convertHoursToDays();
            default -> System.out.println("Choice unknown!");
        }
    }
}
