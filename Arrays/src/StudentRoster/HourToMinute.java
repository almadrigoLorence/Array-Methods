package StudentRoster;

import java.util.Scanner;
public class HourToMinute {
    public static void convertHourToMinute(){
        Scanner input = new Scanner(System.in);

        System.out.println("Input hour to convert: ");
        int hour = input.nextInt();
        input.close();

        int minutes = hour * 60;
        System.out.println(hour + " hour is " + minutes + " minutes");
    }
}
