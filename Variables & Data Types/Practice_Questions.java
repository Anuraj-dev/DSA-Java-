import java.util.Scanner;

public class Practice_Questions {
    public static void main(String[] args) {

        //TODO:1 Make a program that take 3 inputs - A,B and C. You have to output the avg of these 3 numbers

        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("Average is: " + (a+b+c)/3);

        //TODO:2 Make a Program, input the side of a sqare. You have to output the area of the square

        // int side = sc.nextInt();
        // int area = side*side;
        // System.out.println("Area of the square is: " + area);

        //TODO:3 Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. 
        //TODO: You have to output the total cost of the items back to the user as their bill (advance - add 18% gst to their bill)

        // float pencil = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();

        // float total = pencil+pen+eraser;

        // float gst = 0.18f * total;
        // float billAmt = total + gst;

        // System.out.println("Your bill is: " + billAmt);        

        //TODO:5 Will the following statement give any error in Java - int $ = 24 (Lets test)

        int $ = 24;
        System.out.println($);

        //! The $ sign is a valid identifier(variable) in java .. the rule says -  
        //* Identifiers can start with any alphabet or underscore("_") or dollar("$") in java  */

        sc.close();
    }
}
