package StudentRoster;

import java.util.Arrays;
import java.util.Scanner;
public class StudentRosterList {

    public static void Students(){
//      Prompts the user to input the number of students in class
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter number of students in class: ");
        int numberOfStudents = input.nextInt();

        String[] studNames = new String[numberOfStudents];
        int size = studNames.length;

//      Prompts user to input names to store in array.
        System.out.println("Enter names: ");
        for(int index = 0 ; index < size; ++index){
            studNames[index] = input.next().toUpperCase();
        }

        System.out.println("\nThe number of students is " + size + "\n******* Student Roster *******\n" +"Names: "+Arrays.toString(studNames));
    }

    public static void Time(){
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

    public static void main(String[] args){
        Students();
        System.out.println(" ");


////   *Reverse countdown from user defined time.
//       ReverseInput.countDownInput();
//       System.out.println("\n");
//
////   *Reverse countdown from Reverse class with array
//       System.out.println("\nHere is another countdown that is being set to 10");
//       Reverse.countdown();


//     *Time converter
         Time();

    }
}
