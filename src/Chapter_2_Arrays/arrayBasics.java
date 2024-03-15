package Chapter_2_Arrays;

import java.util.Scanner;

public class arrayBasics {
    public static void main(String[] args) {

        //Declaration
        int arr[];
        //Allocation
        arr = new int[10];
        //Initialization
        int marks[] = {10,20,30,40,50};

//        Taking input in array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();
        int arr1[] = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Enter the value for index "+index+": ");
            arr[index] = sc.nextInt();
        }

        System.out.println("Normal For Loop");
        int n = marks.length;
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i]);
        }
//      System.out.println(marks[5]); //ArrayIndexOutOfBound

        System.out.println("For Each Loop");
        for (int number:marks){
            System.out.println(number);
        }

        sc.close();
    }
}