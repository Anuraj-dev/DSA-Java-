package Strings;

public class Strings {
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c'};
        // String str = "abcd";

        //! Strings are IMMUTABLE in JAVA

        // //? Length function
        // String fullName = "Anuraj Jit Saikia";
        // System.out.println(fullName.length()/2);

        // //? Concatenation
        // String fname = "Raja";
        // String lname = "Saikia";
        // System.out.println("Your full name is: " + fname + " " + lname);

        // //? CharAt funciton
        // System.out.println(fullName.charAt(0));                         //CharAt funciton

        // //? Compare 2 strings
        // String s1 = "Raja";
        // String s2 = "Raja";
        // String s3 = new String("Raja");

        // if(s1 == s2){                                       //! Don't do like this this will compare only at object level
        //     System.out.println("They are equal");
        // } else{
        //     System.out.println("Not Equal");
        // }

        // if(s1 == s3){
        //     System.out.println("They are equal");
        // } else{
        //     System.out.println("Not Equal");
        // }

        // if(s1.equals(s3)){                                    //! Always use equals(args) fn to comare 2 str                                      
        //     System.out.println("They are equal");
        // } else{
        //     System.out.println("They are not");
        // }
        
        StringBuilder sb = new StringBuilder("");

        for(char ch = 'a'; ch<='z'; ch++){
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
