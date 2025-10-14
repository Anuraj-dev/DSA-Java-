package BitManipulation;

public class BitManipulationPQ {
    //? Finding odd or even using bit manipulation
    public static void oddOrEven(int n){
        int bitmask = 1;

        if((n & bitmask) == 0){
            System.out.println("Even no");
        } else{
            // in case of 1
            System.out.println("Odd no");
        }
    }
    public static void main(String[] args) {
        oddOrEven(11);
        oddOrEven(14);
        oddOrEven(20);
    }
}
