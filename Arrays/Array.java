package Arrays;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        //? Array creation testing
        int marks[] = new int[50];

        //?Taking input in array
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //maths
        
        System.out.println("Phy: " + marks[0]);
        System.out.println("Chem: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        //? Length of an array
        System.out.println("Length of the array: " + marks.length);

        sc.close();
    }
}