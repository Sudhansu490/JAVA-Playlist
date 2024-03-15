package Chapter_1_javaBasics;

import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {

//        int income;
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your Income: ");
//        income = sc.nextInt();

//        If Statement
/*      if (income > 100000){
            System.out.println("Mein Amir Hun!");
        }*/

//        If-else Statement
/*      if (income > 100000){
            System.out.println("Mein Amir Hun!");
        }
        else {
            System.out.println("Mein Garib Hun!");
        }*/

//        Ternary Operator
//      System.out.println( (income > 100000) ? "Amir Hun" : "Garib Hun");

//        Nested If-else statement
/*      int age;
        System.out.print("Enter Your Age: ");
        age = sc.nextInt();
        boolean knowDriving;
        System.out.print("Are you know driving? ");
        knowDriving = sc.nextBoolean();
        if (age > 18){
            System.out.println("Your age is 18+");
            if (knowDriving){
                System.out.println("So you can get a license.");
            }
            else {
                System.out.println("Pehle driving seekh k aa bhai");
            }
        }
        else {
            System.out.println("Pehle bada hojaa bhai");
        }*/

//        If-else if-else
/*      if (income > 100000){
            System.out.println("You are among 5% indians.");
        }
        else if(income > 90000) {
            System.out.println("You are among 10% indians.");
        }
        else if(income > 50000) {
            System.out.println("You are among 20% indians.");
        }
        else if(income > 30000) {
            System.out.println("You are among 40% indians.");
        }
        else if(income > 20000) {
            System.out.println("You are among 50% indians.");
        }
        else {
            System.out.println("Aap kahin se toh aarahe ho");
        }*/

//        switch statement
        System.out.print("Enter a valid Day Number: ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You enter wrong day.");
        }
        sc.close();
    }
}