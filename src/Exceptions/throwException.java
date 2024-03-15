package Exceptions;

public class throwException {
    public static void printName(String name) throws ArithmeticException{
        int a = 10/0;
        System.out.println(name);
    }

    public static void printNAME(String name) throws NullPointerException{
        if (name.equalsIgnoreCase("Kappa")){
            throw new NullPointerException("Bahat Bhayankar Exception"); //In Double code acts as message
        }
        System.out.println(name);
    }

    public static void main(String[] args) {
        try {
//            printName("Kappa");
            printNAME("Kappa");
        }
        catch (Exception err){
            System.out.println(err.getMessage());
        }
        finally {
            System.out.println("I am always executable.");
        }
    }

}