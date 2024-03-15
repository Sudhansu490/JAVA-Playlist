package Chapter_1_javaBasics;

public class dataType {
    public static void main(String[] args) {
//        Boolean
       /* boolean found = true;
        System.out.println(found);*/
//      boolean isAvailable = 0; //error

//        Character
/*      char ch = 'l';
        System.out.println("My Character is " + (char)(ch-1));*/

//        Integers->byte,short,int,long
/*      byte marks = 110;
        System.out.println(marks);
        short weight = 20000;
        System.out.println("My weight is "+ weight);
        int height = 100000;
        System.out.println("My height is "+ height);
        long length = 100000L;
        System.out.println("Length is "+ length);*/

//        Decimal Points(Run upto 7 decimal points)
/*      float pi = 3.14f;
        System.out.println("Value of PI is "+ pi);
        double percentage = 99.98725634;
        System.out.println("My Percentage is "+ percentage);*/

//-------------------------------------------------------------

//        Implicit Conversion
        byte num1 = 12;
        short num2 = num1;
        System.out.println(num2);
        int num3 = num2;
        System.out.println(num3);
        long num4 = num3;
        System.out.println(num4);

//        Explicit Conversion
        int num = 108;
        char mych = (char) num;
        System.out.println(mych);
        int mynum = 2;
        byte mynum1 = (byte)mynum;
        System.out.println((mynum1));
    }
}
