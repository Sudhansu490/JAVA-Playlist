package Chapter_3_Functions;

import java.util.Random;
import java.util.Scanner;

public class practiceFun {

//    Q.1->WAF to print the multiplication table of a given Number.
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        printTable(num);
    }
    public static void printTable(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "X" + i + "=" + (num*i));
        }
    }*/

//    Q.2->WAF to print the sum from 1 to N.
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sum(n);
    }
    public static void sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Printing Sum-: "+sum);
    }*/

//    Q.3->WAF to return the average of two numbers.
/*    public static void main(String[] args) {
        double result = avg(5,50);
        System.out.println("Average is "+result);
    }
    public static double avg(int a, int b){
        double avg = (double)(a+b)/2;
        return avg;
    }*/

//    Q.4->WAF to return the maximum & minimum of two number.
/*    public static void main(String[] args) {
        int max = getMax(25,10);
        System.out.println("Maximum Number-: "+max);
        int min = getMin(8,4);
        System.out.println("Minimum Number-: "+min);
    }
    public static int getMin(int a, int b){
        if (a<b){
            return a;
        }
        else {
            return b;
        }
    }
    public static int getMax(int a, int b){
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }*/
//    we can do the above problem using math library function.

//    Q.5->WAF to return the absolute value of a number.
/*    public static void main(String[] args) {
        int result = getAbsolute(-58);
        System.out.println("Absolute value of the num is: "+result);
    }
    public static int getAbsolute(int num){
        if (num >= 0){
            return num;
        }
        else {
            return -num;
        }
    }*/

//    Q.6->WAF to return the exponent of a number.
/*    public static void main(String[] args) {
        int ans = getExponent(2,3);
        System.out.println(ans);
    }
    public static int getExponent(int a,int b){
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        return ans;
    }*/

//    Q.7->WAF to sum all odd numbers from 1 to a specified number n.
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        int oddSum = printOddSum(num);
        System.out.println("OddSum till " + num + " is: " + oddSum);
    }
    public static int printOddSum(int num){
        int i = 1;
        int sum = 0;
        while (i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }*/

//    Q.8->WAF that calculates the factorial of a given number.
  /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        long factorial = fact(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
    public static long fact(int num){
        if (num < 2){
            return 1;
        }
        long factor = 1;
        int i = 2;
        while (i <= num){
            factor *= i;
            i++;
        }
        return factor;
    }*/

//    Q.9->WAF to find the Least Common Multiple(LCM) of two numbers.
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNum = sc.nextInt();
        int lcm = printLCM(firstNum,secondNum);
        System.out.println("LCM of the two numbers is "+ lcm);
    }
    public static int printLCM(int firstNum, int secondNum){
        int i = 1;
        while (true){
            int result = secondNum * i;
            if (result % firstNum == 0){
                return result;
            }
            i++;
        }
    }*/

//    Q.10->WAF to find the Greatest Common Divisor(GCD) of two integers.
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNum = sc.nextInt();
        int gcd = printGCD(firstNum,secondNum);
        System.out.println("GCD of the two numbers is "+ gcd);
    }
    public static int printGCD(int firstNum, int secondNum){
        int result = 1;
        int i = 2;
        int least = getSmallNo(firstNum,secondNum);
        while (i <= least){
            if (firstNum % i == 0 && secondNum % i == 0){
                result = i;
            }
            i++;
        }
        return result;
    }
    public static int getSmallNo(int firstNum, int secondNum){
        if (firstNum < secondNum){
            return firstNum;
        }
        else {
            return secondNum;
        }
    }*/

//    Q.11->WAF to check whether a given number is prime or not.
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        boolean prime = isPrime(num);
        if (prime){
            System.out.println(num + " is Prime.");
        }
        else {
            System.out.println(num + " is not Prime.");
        }
    }
    public static boolean isPrime(int num){
        int i = 2;
        while(i < num){
            if (num % i == 0){
                return  false;
            }
            i++;
        }
        return true;
    }*/

//    Q.12->WAF to print the reverse the digits of a number.
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number: ");
        int num = sc.nextInt();
        int reverseNum = getReverse(num);
        System.out.println("Reverse of " +num+ " is: "+reverseNum);
    }
    public static int getReverse(int num){
        int reverseNum = 0;
        while (num > 0){
            int digit = num % 10;
            reverseNum = reverseNum*10 + digit;
            num = num/10;
        }
        return reverseNum;
    }*/

//    Q.13->WAF to print the Fibonacci Series up to a certain number.
/*    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = sc.nextInt();
        System.out.println("Here is the Fibonacci Series up to " +num+ " is:");
        printFibonacci(num);
    }
    public static void printFibonacci(int num){
        if (num<0) return;
        System.out.println("0");
        if (num == 0) return;
        System.out.println("1");
        int first=0 , second=1;
        while (first+second <= num){
            int third = first+second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }*/

//    Q.14->WAF to check if a number is an Armstrong number or not.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num = sc.nextInt();
        boolean armstrong = isArmstrong(num);
        if (armstrong){
            System.out.println("Number is Armstrong.");
        }
        else {
            System.out.println("Number is not Armstrong.");
        }
    }
    public static boolean isArmstrong(int num){
        int digits = countDigit(num);
        
        return false;
    }
    public static int countDigit(int num){
        int digits = 0;
        while (num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }

//    Q.->WAF to return a random value between 1 to N.
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        int randNo = getRandNo(n);
        System.out.println(randNo);
    }
    public static int getRandNo(int n){
        Random random = new Random();
        return random.nextInt(n) + 1;
    }*/

}
