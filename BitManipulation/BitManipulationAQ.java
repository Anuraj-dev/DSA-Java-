package BitManipulation;

public class BitManipulationAQ {
    //? Swap two numbers without uising a 3rd variable
    public static int[] swapTwoNum(int a, int b){
        a = a^b;

        b = a^b;    // This is a^b^b = (b^b) ^ a = 0^a = a

        a = a^b;    // This is a^b ^ a^b^b = (a^a) ^ (b^b) ^ b = 0 ^ 0 ^ b = b

        return new int[]{a, b};
    }


    public static void main(String[] args) {
        //? Checking
        int nums[] = swapTwoNum(5, 8);
        System.out.println("a = " + nums[0] + " b = " + nums[1]);
    }
}
