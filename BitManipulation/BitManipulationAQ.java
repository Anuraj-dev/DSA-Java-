package BitManipulation;

public class BitManipulationAQ {
    //? Swap two numbers without uising a 3rd variable
    public static int[] swapTwoNum(int a, int b){
        a = a^b;

        b = a^b;    // This is a^b^b = (b^b) ^ a = 0^a = a

        a = a^b;    // This is a^b ^ a^b^b = (a^a) ^ (b^b) ^ b = 0 ^ 0 ^ b = b

        return new int[]{a, b};
    }

    //? Add 1 to an int using bit wise operator
    public static int addOne(int n){
        return -(~n);
    }

    //? Diff way
    public static int addOne2(int n){
        int sum = n ^ 1;
        int carry = (n & 1) <<1;
        while(carry == 0){
            sum = sum^1;
            carry = (sum & 1) <<1;
        }
        return sum;
    }
    public static void main(String[] args) {
        //? Checking
        // int nums[] = swapTwoNum(5, 8);
        // System.out.println("a = " + nums[0] + " b = " + nums[1]);

        //? First second way
        System.out.println(addOne(6));
        //? 2nd way
        System.out.println(addOne2(6));

        //? Convert Upper case to lower case using bits
        // for(char ch ='A'; ch<='Z'; ch++){
        //     System.out.println((char)(ch | ' '));
        // }

        
    }
}
