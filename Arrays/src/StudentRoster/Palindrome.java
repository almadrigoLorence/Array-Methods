package StudentRoster;
/*
    This method is
    To call if the Number is a Palindrome
    Or if the Number is not a Palindrome
 */
public class Palindrome {
    public static void checkPalindrome(int number, int reversedNumber){
        if(number == reversedNumber){
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }
    }
}
