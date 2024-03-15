package Chapter_1_javaBasics;

import java.util.Scanner;

public class loopProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Q.1->Print counting from n to 1.
/*        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for (int i = n; i > 1; i--) {
            System.out.println(i);
        }*/

//        Q.2->Print the 10 multiplies of n.
/*        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n*i);
        }*/

//        Q.3->Print all even numbers from 1 to 100.
/*        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }
        }*/

//        Q.4->Print the sum of all the numbers from 1 to N.
/*        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of the numbers from 1 to " +n+ " is: " + sum);*/

//        Q.5->Print all the integers in range from 50 to 100, that are perfectly divisible by 7.
/*       for (int i = 50; i <= 100; i++) {
            if (i % 7 == 0){
                System.out.println(i);
            }
        }*/

//        Q.6->Print all prime numbers from 1 to n.
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n){
        if (n <=1){
            return false;
        }
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0){
                return false;
            }
        }
        return true;
    }
}
