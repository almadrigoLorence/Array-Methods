package StudentRoster;

import java.util.Scanner;
public class DaysToHours {

    public static void computeDaysToHours(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter days to convert to hours: ");
        int days = input.nextInt();
        input.close();

        int hours = days * 24;
        System.out.println(days + " days is converted to " + hours+ " hours.");
    }
}
