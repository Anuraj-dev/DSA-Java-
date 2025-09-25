package Patterns;

public class Patterns {
    public static void main(String[] args) {

    //*Print star patterns */
    //     int n = 10;
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j<=i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    //*Print inverted star patterns */
    // int n = 8;
    // for(int i = n; i>0; i-- ){
    //     for(int j = 1; j<=i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //?Optimised Formula format
    int n = 4;
    for(int line = 1; line<=n ; line++){
        for(int star = 1; star<=n-line+1; star++){
            System.out.print("*");
        }
        System.out.println();
    }



    }
}