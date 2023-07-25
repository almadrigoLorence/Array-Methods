package StudentRoster;
/*
    This method is to return a reversed Number
 */
public class ReversedNumber {
    public static int reversedNumber(int number){
        int reversed = 0;
        int remainder;

        while(number != 0){
            remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number /= 10;
        }
        return reversed;
    }
}
