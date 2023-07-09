package StudentRoster;

import java.util.Scanner;
public class MinutesToHours {
    public static void convertMinuteToHour(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter minute to convert: ");
        int minute = input.nextInt();
        input.close();

        int hour = minute / 60;
        System.out.println(minute + " is converted to " + hour + " hours.");
    }
}
