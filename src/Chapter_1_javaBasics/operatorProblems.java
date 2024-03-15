package Chapter_1_javaBasics;

import java.util.Scanner;

public class operatorProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Q.1->Create a program to swap two numbers.
/*        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        int var = num1;
        num1 = num2;
        num2= var;
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);*/

//        Q.2->Create a program to calculate perimeter of a rectangle.
/*        System.out.print("Enter Length: ");
        int len = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int bred = sc.nextInt();
        int perimeter = 2*(len+bred);
        System.out.println("Perimeter of the rectangle is: "+perimeter);*/

//        Q.3->Create a program to calculate area of a triangle.
/*        System.out.print("Enter Base: ");
        float base = sc.nextFloat();
        System.out.print("Enter Height: ");
        float height = sc.nextFloat();
        float area = (base*height)/2;
        System.out.println("Area of the Triangle is: "+area);*/

//        Q.4->Create a program to calculate Simple & Compound Interest.
/*        System.out.print("Enter Principal: ");
        long amount = sc.nextLong();
        System.out.print("Enter Time: ");
        float time = sc.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        float interest = sc.nextFloat();
        float si = (amount*time*interest)/100;
        System.out.println("Simple Interest: "+si);
        double ci =  amount* Math.pow((1 + interest/100), time);
        System.out.println("Compound Interest: "+ci);*/

//        Q.5->Create a program to convert Fahrenheit to Celsius.
        System.out.print("Enter Temperature in Fahrenheit: ");
        float fah = sc.nextFloat();
        float cel = ((fah-32)*5)/9;
        System.out.println("Temperature is "+cel+ "C");

    }
}
