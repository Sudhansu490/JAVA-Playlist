package Chapter_4_Strings;

import java.util.Scanner;

public class stringBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String creation using string literal
/*        String firstname = "Sonu";
        System.out.println(firstname);*/

//        String creation using New keyword
   /*     String lastname = new String("Saina");
        System.out.println(lastname);*/

//        Concatenation
//        System.out.println(firstname + " " + lastname);

/*        String str = "Kappa";
        str = "Love";
        System.out.println(str);*/

//        -----------------------------------------------
//        String Input
        System.out.print("Enter Your First Name: ");
        String firstname = sc.nextLine();
        System.out.print("Enter Your Last Name: ");
        String lastname = sc.next();
        System.out.println("Your Name is " + firstname + " " + lastname);

//        ------------------------------------------------
//        Comparing strings in Java
        String name1 = "Love";
        String name2 = "LOVE";
        String name3 = new String("Love");
//        '==' operator
        if (name1 == name3){
            System.out.println("Strings are Equal.");
        }
        else {
            System.out.println("Strings are not Equal.");
        }
//        .equals()
        if (name1.equals(name3)){
            System.out.println("Strings are Equal.");
        }
        else {
            System.out.println("Strings are not Equal.");
        }
//        .equalsIgnoreCase()
        if (name1.equalsIgnoreCase(name2)){
            System.out.println("Strings are Equal.");
        }
        else {
            System.out.println("Strings are not Equal.");
        }

        sc.close();
    }
}
