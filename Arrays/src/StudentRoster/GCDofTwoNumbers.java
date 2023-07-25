package StudentRoster;
/*
Create a program to find the GCD of two numbers using a method.
GCD (Greatest Common Divisor) of two numbers is the largest number that can exactly divide both the numbers.
 */
public class GCDofTwoNumbers {
    static void text(){
        System.out.println("The greatest common divisor (GCD) of two or more numbers is the number that divides them precisely.\n It is often referred to as the highest common factor (HCF).\n");
    }
    static int findGCD(int num1, int num2){
        // create the findGCD() method with parameters: num1 and num2
        // compute gcd of two numbers and return it
        int gcd = 1;

        for(int i = 1; i <= num1 && i <= num2; i++){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}
