package StudentRoster;

public class CheckPrimeNumber {
    static void text(){
        System.out.println("Prime Number in Java");
        System.out.println("A prime number (or prime) is a natural number higher than one that cannot be divided by two lesser natural numbers. \nA composite number is a natural number greater than one that is not prime.");
        System.out.println("\nFor example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.");
    }
    public static int checkPrime(int number){
        int flag = 0;

        for(int i = 2; i <= number - 1; ++i){
            if(number % i == 0){
                flag = 1;
                break;
            }
        }

        if(flag == 1){
            System.out.println(number+" is Not a Prime Number");
        } else {
            System.out.println(number+ " is Prime Number");
        }
        return flag;
    }
}
