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
    public static void main(String[] args) {
        // oddOrEven(11);

        System.out.println(clearIBits(15, 2));
    }
}
