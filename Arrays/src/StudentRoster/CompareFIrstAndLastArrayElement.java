package StudentRoster;

import java.util.Scanner;

public class CompareFIrstAndLastArrayElement {
    static void compareArray(){
        Scanner input = new Scanner(System.in);

        System.out.print("How many array to be input: ");
        int[] num = new int[input.nextInt()];

        System.out.println("*Input number*");
        for(int i = 0; i < num.length; i++){
            num[i] = input.nextInt();
        }

//        Now, compare first Array to the last array
        int first = num[0];
        int last = num[num.length - 1];

        if(first==last){
            System.out.println(first + " and " + last + " is Equal");
        } else {
            System.out.println(first + " and " + last + " is Not Equal");
        }

        input.close();
    }
}
