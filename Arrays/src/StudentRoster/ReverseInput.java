package StudentRoster;

import java.util.Scanner;
public class ReverseInput {
    public static void countDownInput(){
        Scanner input = new Scanner(System.in);

//      Prompt user to input how many count to be initiated
        System.out.print("Enter time to count: ");
        int number = input.nextInt();
        int[] count = new int[number];
        int size = count.length;

//      Display counting in reverse
        System.out.println("Counting...");
        for(int counting = size; counting >= 1; --counting){
            System.out.println(counting);
        }

    }
}
