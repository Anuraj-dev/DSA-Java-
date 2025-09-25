package Function;

import java.util.Scanner;

public class Functions {
    public static int calculateSum(int num1, int num2){ //!These are called parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =  calculateSum(a,b); //!The value we pass in function are called arguments or actual parameters
        System.out.println(sum);
        sc.close();
    }
    
}