package Strings;

public class Strings {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c'};
        String str = "abcd";

        //! Strings are IMMUTABLE in JAVA

        //? Length function
        String fullName = "Anuraj Jit Saikia";
        System.out.println(fullName.length());

        //? Concatenation
        String fname = "Raja";
        String lname = "Saikia";
        System.out.println("Your full name is: " + fname + " " + lname);

        //? CharAt funciton
        System.out.println(fullName.charAt(0));                         //CharAt funciton

    }
}
