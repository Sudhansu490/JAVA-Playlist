package Chapter_2_Arrays;

import java.util.Scanner;

public class arrayBasicProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int index = 0; index < size; index++) {
            System.out.print("Enter the value for "+index+ " index: ");
            arr[index]= sc.nextInt();
        }

//        Q.1->Find sum of all values in an array.
/*        int sum = 0;
        for (int i:arr) {
            sum = sum + i;
        }
        System.out.println("Total sum: "+sum);*/
        
//        Q.2->Find multiplication of all values in an array.
        int mul = 1;
        for (int i: arr){
            mul = mul*i;
        }
        System.out.println("Multiplication of all values are "+mul);

//        Q.3->Find min value in an array.
/*        int arr[] = {30,8,25,-12,-35,10,0,5,-1,50};
        int mini = Integer.MAX_VALUE;
        for (int num:arr){
            if (num < mini){
                mini = num;
            }
        }
        System.out.println("Minimum Number is "+mini);*/

//        Q.4->Find max value in an array.
/*        int arr[] = {30,8,25,-12,-35,10,0,5,-1,50};
        int max = Integer.MIN_VALUE;
        for (int num: arr){
            if (num > max){
                max = num;
            }
        }
        System.out.println("Maximum Number is "+max);*/

        sc.close();
    }
}
