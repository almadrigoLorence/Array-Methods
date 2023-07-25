package StudentRoster;

public class LCMofTwoNumbers {

    static void text(){
        System.out.println("The LCM of two integers is the smallest positive integer that is perfectly divisible by both the numbers (without a remainder).\n");
    }
    static int findLCM(int num1, int num2){
/*
Create the findLCM() method with parameters: num1 and num2.
Inside the method, set lcm equal to the largest value among num1 and num2.
Run an infinite while loop and increase the value of lcm by 1 in each iteration.
Inside the loop, check if lcm is perfectly divisible by num1 and num2.
If true, terminate the loop.
Return the value of lcm.
*/
        int lcm;
        lcm = Math.max(num1, num2);

        while(true){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                break;
            }
            ++lcm;
        }
        return lcm;
    }
}
