package Loops;

import java.util.Scanner;

public class PA {
    public static void main(String[] args) {
        //Q1 = Sum of n natural numbers
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a range: ");
        // int n = sc.nextInt();
        // int i = 1;
        // int sum = 0;
        // while (i<=n) {
        //     sum += i;
        //     i++;
        // }
        // System.out.println("Your Sum of n natural no is: "+ sum);

        //!Q2 - Print Square
        
        // int n = sc.nextInt();
        // for(int i=0; i<n; i++){
        //     System.out.print("\n");
        //     for(int j =0; j<n; j++){
        //         System.out.print("* ");
        //     }
            
        // }

        //!Q3- Print Reverse of a num
        // System.out.print("Enter a num to reverse: ");
        // int n = sc.nextInt();
        // int reversed = 0;
        // while(n != 0){
        //     int lastDigit = n%10;
        //     reversed = reversed*10 + lastDigit;
        //     n = n/10;
        // }
        // System.out.println("Reversed no is: " + reversed);
        
        //!Keep entering num till user enter miltiple of 10
        // do{
        //     System.out.print("Enter a multiple of 10: ");
        //     int num = sc.nextInt();
        //     if(num%10==0){
        //         System.out.println("Entered a multiple of 10");
        //         break;
        //     }
        // }while(true);
        
        //! Display All num except multiples of 10
        // System.out.print("Enter a range: ");
        // int n = sc.nextInt();
        // for(int i =1; i<=n; i++){
        //     if(i%10==0){
        //         continue;
        //     }
        //     System.out.print(i+" ");
        // }

        //!Check if a num is prime or not
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        for(int i=2; i<=n; i++){
           int count = 0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                 count++;
                }
            }
            if(count ==2){
                System.out.println(i);
            }
        }
        sc.close();
        
    }
}
