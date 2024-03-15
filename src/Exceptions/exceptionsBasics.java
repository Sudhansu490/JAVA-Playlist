package Exceptions;

public class exceptionsBasics {
    public static void main(String[] args) {

//        int a = 5/0;

//        int arr[] = new int[5];
//        System.out.println(arr[50]);

/*        System.out.println("Before");
        try{
            int a = 5/0;
        }
        catch (ArithmeticException err){
            System.out.println(err);
            System.out.println(err.getMessage());
            System.out.println("We need to handle exception here.");
        }
        System.out.println("After");*/

        System.out.println("Before");
        try{
            int arr[] = new int[5];
            System.out.println(arr[100]);
            int a = 5/0;
        }
/*        catch (ArithmeticException | ArrayIndexOutOfBoundsException err){
            System.out.println(err.getMessage());
            System.out.println("We need to handle the exception here.");
        }*/
        catch (Exception err){
            System.out.println(err.getMessage());
            System.out.println("We need to handle the exception here.");
        }
        finally {
            System.out.println("Mein to execute hoga jarur.");
        }

    }
}
