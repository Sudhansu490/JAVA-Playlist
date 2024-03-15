package Chapter_3_Functions;

public class functionAndArrays {

//    Q.1->WAF to print the array.
/*    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        printArr(arr);
    }*/
    public static void printArr(int arr[]){
        for (int element:arr){
            System.out.println(element);
        }
    }

//    Q.2->WAF to return the sum of all elements in the array.
/*    public static void main(String[] args) {
        int arr[] = {5,15,25,35,45};
        int result = sumArr(arr);
        System.out.println("Sum of all elements of the array are "+result);
    }
    public static int sumArr(int arr[]){
        int sum = 0;
        for (int element:arr){
            sum += element;
        }
        return sum;
    }*/

//    Q.3->WAF to double the values present inside an array.
    public static void main(String[] args) {
        int arr[] = {5,7,9,11,13};
        System.out.println("Before Manipulating the Array");
        printArr(arr);
        doubleArr(arr);
        System.out.println("After Manipulating the Array");
        printArr(arr);
    }
    public static void doubleArr(int arr[]){
        for (int index = 0; index < arr.length; index++) {
            arr[index] = 2*arr[index];
        }
    }


}
