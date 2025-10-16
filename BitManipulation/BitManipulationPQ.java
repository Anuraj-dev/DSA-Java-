package BitManipulation;

public class BitManipulationPQ {
    //? Finding odd or even using bit manipulation
    public static void oddOrEven(int n){
        int bitMask = 1;

        if((n & bitMask) == 0){
            System.out.println("Even no");
        } else{
            // in case of 1
            System.out.println("Odd no");
        }
    }

    //? Get ith bit
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;

        if((n & bitMask) == 0){
            return 0;
        } else{
            return 1;
        }
    }

    //? Set ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;

          return n | bitMask;

    }

    //? Clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);

        return n & bitMask;
    }

    //? Update ith bit
    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //    return clearIBits(n, i);
        // } else{
        //     return setIthBit(n, i);
        // }

        n = clearIBits(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }


    //? ClearNbits
    public static int clearIBits(int n, int i){
        int bitMask = ~(0) << i;

        return n & bitMask;
    }

    //? Clear range of bits
    public static int clearRangeOfBits(int n, int i, int j){
        int a = (~(0) << j+1);
        int b = ((1 << i) - 1);    //*It basically means that 2^i - 1 times of 1 generaion from right see the notion notes to obs the pattern*/

        return ((a|b) & n);
    }

    //? Check if the no is power of 2 or not
    public static boolean isPowerOftwo(int n){
        return (n & (n-1)) == 0;
    }

    //? Count set bits in a no
    public static int countSetBits(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){         // Checking if LSB is 1
                count++;
            }
            n = n>>1;               // Shift the binary by 1 places
        }

        return count;
    }
    
    //? Fast exponential calculation. Reduces TC from O(n) to O(logn)
    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n>0){
            if((n&1) != 0){   //Check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }

        return ans;    // Coooooolllll
    }

    public static void main(String[] args) {
        // oddOrEven(11);

        System.out.println(fastExpo(5,3));
    }
}
