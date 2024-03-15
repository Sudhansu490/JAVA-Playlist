package Chapter_3_Functions;

public class func {
    public static void main(String[] args) {
        /*for (String arg: args){
            System.out.println(arg);
        }*/
        int result = getSum(5,10);
        System.out.println("Sum is "+result);
//        callMyName(); //If we call a method inside a static method then called method should be  static.
        callMyName("sudhansu");
    }
    public static void callMyName(){
        System.out.println("Sonu");
        System.out.println(10);
        return; //stop the flow of execution
    }
    public static void callMyName(String name){
        System.out.println("My Name is "+name);
    }
    public static int getSum(int a, int b){
        int sum = a+b;
        return sum;
    }

}
