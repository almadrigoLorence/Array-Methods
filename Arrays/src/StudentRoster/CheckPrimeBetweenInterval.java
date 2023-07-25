package StudentRoster;

public class CheckPrimeBetweenInterval {
     static boolean checkPrime(int number) {
         if(number <= 1) {
             return true;
         }

         for (int i = 2; i * i <= number; ++i) {
             if (number % i == 0) {
                 return false;
             }
         }
         return true;
     }
}
