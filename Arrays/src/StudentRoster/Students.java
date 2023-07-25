package StudentRoster;

import java.util.Arrays;
import java.util.Scanner;

public class Students {
    public static void checkStudentRoster() {
//      Prompts the user to input the number of students in class
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter number of students in class: ");
        int numberOfStudents = input.nextInt();

        String[] studNames = new String[numberOfStudents];
        int size = studNames.length;

//      Prompts user to input names to store in array.
        System.out.println("Enter names: ");
        for (int index = 0; index < size; index++) {
            studNames[index] = input.next().toUpperCase();
        }
        System.out.println("\nThe number of students is " + size + "\n******* Student Roster *******\n" + "Names: " + Arrays.toString(studNames));
    }

}
