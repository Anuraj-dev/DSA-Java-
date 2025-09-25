package Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = sc.nextInt();
        // int i = 1;
        // while (i<=n) {
        //     System.out.print(i+" ");
        //     i++;
        // }

        //?For Loop
        // for(int i = 1; i<=n; i++){
        //     System.out.print(i+" ");
        // }

        //?do-While loop
        // int i = 1;
        // do{
        //     System.out.println("Hello World");
        //     i++;
        // }while(i<=n);

        //?Continue statements
        for(int i=1; i<=n; i++){
            if(i==3){
                continue;                  //*Skips an iteration */
            }
            System.out.println(i);
        }
        sc.close();
    }
}