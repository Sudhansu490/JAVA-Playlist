package Chapter_1_javaBasics;

import java.math.BigDecimal;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Taking int value
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println("My Age is "+age);

//        Taking float value
        System.out.print("Enter PI Value: ");
        float pi = sc.nextFloat();
        System.out.println("PI value is "+pi);

//        Taking bigDecimal value
        System.out.print("Enter a decimal value: ");
        BigDecimal val = sc.nextBigDecimal();
        System.out.println("The value is "+val);

//        Taking boolean expression
        System.out.print("Enter true if you passed the exam: ");
        boolean res = sc.nextBoolean();
        System.out.println(res);

//        Taking character as input
        System.out.print("Enter your Character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Character is "+ ch);

//        Input the String
        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("My Name is "+ name);

        sc.close();
    }
}
