package Function;

public class Practice_questions {
    //?Compute the avg of 3 numbers
    public static double avgOfThree(double a, double b, double c){
        return (a + b + c)/3;
    }

    //? Write a program to test a no is even
    public static boolean isEven(int n){
        if (n % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    //? Check if a no is palindrome
    public static void palindromeCheck(int n){
        int num = n;
        int reverse = 0;

        while(n>0){
            int lastDigit = n%10;
            reverse = reverse * 10 + lastDigit;

            n /= 10;
        }

        if(num == reverse){
            System.out.println(num + " is a palindrome");
        } else{
            System.out.println(num + " is not a palindrome");
        }
    }

    //? Write a funciton to compute the sum of the digits in an integer 
    public static void digitSum(int n){
        int num = n;
        int sum = 0;

        while(n>0){
            int lastDigit = n%10;
            sum += lastDigit;

            n /= 10;
        }
        System.out.println("Sum of the digits of " + num + " = " + sum);
    }


    public static void main(String[] args) {
        // System.out.println(avgOfThree(10, 20, 10));

        //Program Tested
        // for(int i = 0; i<=10; i++){
        //     System.out.println(isEven(i));
        // }

        // palindromeCheck(13231);

        // System.out.println(Math.min(5, 3.35));      //*On a side note these outputs a double value by default except the abs fn */
        // System.out.println(Math.max(5, 3.35));
        // System.out.println(Math.sqrt(16));
        // System.out.println(Math.pow(10, 3));
        // System.out.println(Math.abs(-58));

        digitSum(1234);

    }
}