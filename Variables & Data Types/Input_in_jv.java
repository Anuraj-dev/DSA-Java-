import java.util.*;   //? Its like import all from java.utils

public class Input_in_jv {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);  //* This is a Scanner class that is is used to take imput from user
        // String input = sc.next();          //* This says that store the first word without space from user input in input variable
        // System.out.println(input);

        // String name = sc.nextLine();      //* This stores paragraphs, sentence
        // System.out.println(name);

        // int num = sc.nextInt();              //* This stores a number
        // System.out.println(num);

        // float price = sc.nextFloat();         //* This stores a float
        // System.out.println(price);

        // int var = sc.nextShort();                //* Stores value upto 32666
        // System.out.println(var);

        // int var2 = sc.nextByte();                //? Why it can stores upto 127
        // System.out.println(var2);

        boolean var3 = sc.nextBoolean();           //* It can store boolean value
        System.out.println(var3);

        sc.close();
    }
}
