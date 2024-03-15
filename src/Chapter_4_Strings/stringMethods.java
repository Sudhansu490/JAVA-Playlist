package Chapter_4_Strings;

public class stringMethods {
    public static void main(String[] args) {

//        length()
        String str1 = "Kappa Bro";
        System.out.println(str1.length());

//        charAt() method
        System.out.println(str1.charAt(3));

//        substring(beginIndex) / substring(beginIndex,endIndex)
        System.out.println(str1.substring(4));
        System.out.println(str1.substring(2,7));

//        contains() method
        System.out.println(str1.contains("bro"));
        System.out.println(str1.contains("sonu"));

//        toUpperCase & toLowerCase Method
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

//        Remove the start & end spaces
        String str2 = " I am Kappa bro ";
        System.out.println(str2.trim());

//        Splits the string around matches of the given regular expression.
        String words[] = str2.split(" ");
        for (String word : words){
            System.out.println(word);
        }

//        startsWith & endsWith Method
        System.out.println(str2.startsWith(" I"));
        System.out.println(str2.endsWith("bro"));

//        Integer to String
        int num = 343;
        String str3 = String.valueOf(num);
        System.out.println(num + 1);
        System.out.println(str3 + 1);

//        replace Method(oldChar,newChar)
        String str4 = "Kappa";
        str4 = str4.replace('p','a');
        System.out.println(str4);

//        toCharArray() - Strings to Character Array
        char[] ch = str4.toCharArray();
        for (char c: ch){
            System.out.println(c);
        }

//        isEmpty() - checks the String is Empty(length is 0)
        String str5 = "";
        System.out.println(str5.length());
        if (str5.isEmpty()){
            System.out.println("String is Empty.");
        }
        else {
            System.out.println("String is not Empty.");
        }

//        isBlank() - checks the String is Blank(empty or contains only white space characters)
        String str6 = "    ";
        if (str6.isBlank()){
            System.out.println("String is Blank.");
        }
        else {
            System.out.println("Strings is not Blank.");
        }

    }
}
