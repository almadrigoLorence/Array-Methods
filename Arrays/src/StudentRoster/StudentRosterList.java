package StudentRoster;
/*
This application is composed of different methods to break the main
task down to smaller subtask.
Date: 21/07/2023
Java Exercise 1.
 */
import java.util.Scanner;
public class StudentRosterList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nThis is a sample Java learning application");
        System.out.println("Choose topic\n");
        System.out.println("1. Integer Permutation");
        System.out.println("2. Standard Deviation");
        System.out.println("3. Access String Characters");
        System.out.println("4. GCD(Greatest Common Divisor) of Two Numbers");
        System.out.println("5. LCM of Two numbers");
        System.out.println("6. Self Dividing Number");
        System.out.println("7. Check Prime Number within Interval");
        System.out.println("8. Check Prime Number");
        System.out.println("9. Check if the number is Palindrome or not");
        System.out.println("10. Reverse countdown from user defined time");
        System.out.println("11. Reverse countdown from Reverse class with array");
        System.out.println("12. Time Converter");
        System.out.println("13. Students");
        System.out.println("");

        System.out.print("Choice: ");
        int learn = input.nextInt();

        switch (learn) {
            case 1 -> {
//          Permutation
                Permutation.text();
                System.out.print("\nInput number of permutation (P) : ");
                int n = input.nextInt();
                System.out.println("\nInput numbers: ");
                int[] arr = new int[n];
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("> ");
                    arr[i] = input.nextInt();
                }
                System.out.println("");

                System.out.print("Result");
                Permutation.permuteArray(arr, 0);

                System.out.println("");
                Permutation.text2();
            }
            case 2 -> {
//          Standard Deviation
                ComputeStandardDeviation.sdText();
                System.out.println("");
                System.out.print("Enter how many numbers to input: ");
                double[] numbers = new double[input.nextInt()];

                System.out.println("\nInput numbers to calculate");
                // get input for numbers
                for (int i = 0; i < numbers.length; i++) {
                    System.out.print("> ");
                    numbers[i] = input.nextDouble();
                }

                // call the calculateSD() method with the numbers array as argument
                double sd = ComputeStandardDeviation.calculateSD(numbers);
                System.out.println("Standard Deviation result: " +sd);
                input.close();
            }
            case 3 -> {
//          Access String Characters
                String text = input.next();
                for (int i = 0; i < text.length(); i++) {
                    System.out.println(text.toUpperCase().charAt(i));
                }
                input.close();
            }
            case 4 -> {
//           GCD(Greatest Common Divisor) of Two Numbers
                GCDofTwoNumbers.text();

                System.out.print("Enter first number: ");
                int number1 = input.nextInt();
                System.out.print("Enter second number: ");
                int number2 = input.nextInt();

                System.out.print("\nGCD of given two numbers: ");
                int gcd = GCDofTwoNumbers.findGCD(number1, number2);
                System.out.println(gcd);
            }
            case 5 -> {
                LCMofTwoNumbers.text();

                System.out.print("Enter first number: ");
                int num1 = input.nextInt();
                System.out.print("Enter second number: ");
                int num2 = input.nextInt();

                int lcm = LCMofTwoNumbers.findLCM(num1, num2);
                System.out.print("LCM of two numbers result: "+lcm);
            }
            case 6 -> {
//          Self Dividing Number
//          *If result is true, print Self Dividing Number*
//          *otherwise, print Not a Self Dividing Number*
                int number = input.nextInt();
                boolean result = CheckSelfDividingNumber.checkSelfDivide(number);
                if (result) {
                    System.out.println("Self Dividing Number");
                } else {
                    System.out.println("Not a Self Dividing Number");
                }
            }
            case 7 -> {
//          Check Prime Number within Interval
                int x = input.nextInt();
                int y = input.nextInt();
                for (int i = x; i <= y; i++) {
                    boolean result1 = CheckPrimeBetweenInterval.checkPrime(i);
                    if (CheckPrimeBetweenInterval.checkPrime(i)) {
                        System.out.println(i);
                    }
                }
            }
            case 8 -> {
                CheckPrimeNumber.text();

                System.out.println("\nNow, input number to check if it's Prime number or Not");
                System.out.print("\nEnter number: ");
                int num1 = input.nextInt();
                int primeOrNot = CheckPrimeNumber.checkPrime(num1);
            }
            case 9 -> {
//          Check if the number is Palindrome or not
                int num = input.nextInt();
                int reversedNumber = ReversedNumber.reversedNumber(num);
                Palindrome.checkPalindrome(num, reversedNumber);
            }
            case 10 -> {
//          Reverse countdown from user defined time.
                ReverseInput.countDownInput();
                System.out.println("\n");
            }
            case 11 -> {
//          Reverse countdown from Reverse class with array
                System.out.println("\nHere is another countdown that is being set to 10");
                Reverse.countdown();
            }
            case 12 -> {
//          Time Converter
                Time.timeConverter();
            }
            case 13 ->
//          Students Number
                    Students.checkStudentRoster();


            default -> System.out.println("Sorry, not in the choices");
        }

    }

}
