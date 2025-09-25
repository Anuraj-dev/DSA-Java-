package Function;

import java.util.Scanner;

public class PA {
    public static int multiply(int a, int b){
      int product = a*b;
      return product;
    }

    public static int factorial(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int findCombination(int n, int r){
        //Formula - nCr = !n/!r!(n-r)
        int binoCoff = factorial(n)/(factorial(r)*factorial(n-r));

        return binoCoff;
    }

    public static Boolean isPrime(int n){
        if(n<2){
            return false;
        } else if (n==2){
            return true;
        }
        for(int i =2; i<=Math.sqrt(n) ; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    // public static void printPrime(int n){
    //     for(int i =2; i<=n; i++){
    //         int factor = 0;
    //         for(int j =1; j<=i; j++){
    //             if(i%j == 0){
    //                 factor++;
    //             }
    //         }
    //         if(factor ==2){
    //             System.out.println(i);
    //         }
    //     }
    // }

    //*or */

    public static void printPrime(int n){
        for(int i =2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void binToDec(int binNum){
        int binary = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + lastDigit * (int)Math.pow(2, pow);

            pow++;
            binNum /= 10;
        }

        System.out.println("Decimal of " + binary + " = " + decNum);
    }

    public static void decToBin(int decNum){
        int decimal = decNum;
        int binary = 0;
        int pow = 0;

        while(decNum > 0){
            int rem = decNum % 2;
            binary = binary + rem * (int)Math.pow(10, pow);

            pow++;
            decNum /= 2;
        }
        System.out.println("Binary of " + decimal + " = " + binary);
    }

    public static void main(String[] args) {
        //!Product by function */
        Scanner sc = new Scanner(System.in);
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int product = multiply(n1, n2);
        // System.out.println(product);

        //!Factorial of n
        System.out.println(factorial(5-1));
        System.out.println("Combinaiton is: " + findCombination(5, 1));

        //!Prime or not
        System.out.println(isPrime(2));

        //!Print prime in a range
        printPrime(100);

        //!Convert binary to decimal
        binToDec(111);

        //!Convert decimal to binary
        decToBin(7);


        sc.close();
    }
}