package StudentRoster;

public class CheckSelfDividingNumber {
    static boolean checkSelfDivide(int number){
        int num = number;
        int digit;

        while(num != 0){
            // access each digit of num
            // hint: use num % 10 to get the last digit
             digit = num % 10;

            // check if any di  git doesn't divide the number
            // if it doesn't, return false
            if(num % digit != 0){
                return false;
            }

            // remove the last digit of num
            num /= 10;
        }
        return true;
    }
}
