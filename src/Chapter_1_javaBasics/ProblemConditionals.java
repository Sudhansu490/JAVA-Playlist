package Chapter_1_javaBasics;

import java.util.Scanner;

public class ProblemConditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Q.1->Take age input and print if/she is eligible to vote or not.
/*        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("You are not eligible.");
        }*/

//        Q.2->Take input 5 subject marks and print the overall percentage of student.
/*        System.out.print("Enter Subject-1 mark: ");
        float s1 = sc.nextFloat();
        System.out.print("Enter Subject-2 mark: ");
        float s2 = sc.nextFloat();
        System.out.print("Enter Subject-3 mark: ");
        float s3 = sc.nextFloat();
        System.out.print("Enter Subject-4 mark: ");
        float s4 = sc.nextFloat();
        System.out.print("Enter Subject-5 mark: ");
        float s5 = sc.nextFloat();
        float percentage = ((s1+s2+s3+s4+s5)/500)*100;
        System.out.println("Percentage is "+percentage);*/

//        Q.3->Take input a lowercase character and print its uppercase version.
/*        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);
        char result = (char)(ch+'A'-'a');
        System.out.println("Output is "+result);*/

//        Q.4->Take input a uppercase character and print its lowercase version.
/*        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);
        char result = (char)(ch+'a'-'A');
        System.out.println("Output is "+result);*/

//        Q.5->Take input 5 subject marks, drop the least one and calculate the overall percentage considering only the top 4 marks, print it.
        System.out.print("Enter Subject-1 mark: ");
        float s1 = sc.nextFloat();
        System.out.print("Enter Subject-2 mark: ");
        float s2 = sc.nextFloat();
        System.out.print("Enter Subject-3 mark: ");
        float s3 = sc.nextFloat();
        System.out.print("Enter Subject-4 mark: ");
        float s4 = sc.nextFloat();
        System.out.print("Enter Subject-5 mark: ");
        float s5 = sc.nextFloat();
        float percentage;
        if (s1<s2 && s1<s3 && s1<s4 && s1<s5){
            percentage = (s2+s3+s4+s5)/4;
            System.out.println("Percentage is "+percentage);
        } else if (s2<s1 && s2<s3 && s2<s4 && s2<s5) {
            percentage = (s1+s3+s4+s5)/4;
            System.out.println("Percentage is "+percentage);
        } else if (s3<s1 && s3<s2 && s3<s4 && s3<s5) {
            percentage = (s1+s2+s4+s5)/4;
            System.out.println("Percentage is "+percentage);
        } else if (s4<s1 && s4<s2 && s4<s3 && s4<s5) {
            percentage = (s1+s2+s3+s5)/4;
            System.out.println("Percentage is "+percentage);
        } else {
            percentage = (s1+s2+s3+s4)/4;
            System.out.println("Percentage is "+percentage);
        }

        sc.close();
    }
}
