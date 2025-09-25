package Loops;

import java.util.Scanner;

public class Practice_Ques {
    public static void main(String[] args) {
        //!Q3
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int factorial = num;

        // for(int i = 1; i<num; i++){
        //     factorial = factorial * (num-i);
        // }
        // System.out.println("Your result is: " + factorial);      //Sooo smooth i like it
        
        //!Q2
        // System.out.print("How many no u are gonna enter: ");
        // int n = sc.nextInt();
        // int evenSum = 0;
        // int oddSum = 0;
        // int i = 0;
        // do{
        //     System.out.print("Enter a no: ");
        //     int num = sc.nextInt();
        //     if(num%2 == 0){
        //         evenSum += num;
        //     } else{
        //         oddSum += num;
        //     }
        //     i++;
        // }while(i<n);
        // System.out.println("Odd Sum: " + oddSum);
        // System.out.println("Even Sum: " + evenSum);

        //!Q4
        System.out.print("Which mul table u want to print: ");
        int n = sc.nextInt();
        
        for(int i = 1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }


        sc.close();
    }
    
}