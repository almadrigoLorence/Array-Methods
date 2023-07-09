package StudentRoster;

import java.util.Scanner;
public class HoursToDays {
    public static void convertHoursToDays(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours to convert to day(s): ");
        int hours = input.nextInt();
        input.close();

        int days = hours / 24;
        if(days < 24){
            System.out.println("Error! 1 day is equivalent to 24 hours in total!");
        } else {
            System.out.println(hours + " hours is converted to " + days + " days.");
        }
    }
}
