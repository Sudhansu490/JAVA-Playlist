package Chapter_2_Arrays;

public class multiDimensionalArray {
    public static void main(String[] args) {

//        Creation of 2D array
//        int arr[][] = new int[4][5];

//        Initialization
        int arr[][] = {
                {10,20,30}, {4,5,6}, {700,800,900}
        };

        int row_size = arr.length;
        int col_size = arr[0].length;
//        System.out.println(row_size + " " + col_size);
        for (int rowIndex=0; rowIndex<row_size; rowIndex++){
            for (int colIndex=0; colIndex<col_size; colIndex++){
                System.out.print(arr[rowIndex][colIndex] + "\t");
            }
            System.out.println();
        }

//        Printing of 2D Array
/*        for (int temp[]:arr){
            for (int num: temp){
                System.out.println(num);
            }
        }*/

//        Sum of all values in a 2D Array.
        int sum = 0;
        for (int rowIndex=0; rowIndex<row_size; rowIndex++){
            for (int colIndex=0; colIndex<col_size; colIndex++){
                sum = sum + arr[rowIndex][colIndex];
            }
        }
        System.out.println("Overall sum: "+sum);
    }
}
