package Patterns;

public class PatternsAdv {
    public static void hollow_rectangle(int totRows, int totCols){
        //outer loop
        for(int i=1; i<=totRows; i++){
            //inner loop
            for(int j =1; j<=totCols; j++){
                //!cell - (i,j)
                if(i == 1 || i == totRows || j == 1 || j==totCols){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid(int n){
        //outer loop
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid_with_numbers(int n){
        //outer loop
        for(int i = 1; i<=n; i++){
            //Numbers
            for(int j = 1; j<=(n+1-i); j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void FLOYDs_Triangle(int n){
        //outer loop
        int num = 1;
        for(int i = 1; i<=n; i++){
            //Print the numbers
            for(int j = 1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){
        boolean isOne = true;
        //outer loop
        for(int i = 1; i<=n; i++){
            if(i%2 != 0){
                isOne= true;
            } else{
                isOne=false;
            }
            //inner loop
            for(int j = 1; j<=i; j++){
                if(isOne){
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }
                isOne=!isOne;
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        //outer 1st half vertically
        for(int i = 1; i<=n; i++){
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int s = 1; s<=(n-i)*2; s++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //outer 2nd half vertically
        for(int i = n; i>=1; i--){
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            for(int s = 1; s<=(n-i)*2; s++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus(int n){
        //outer loop
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n) {
        //outer loop
        for(int i =1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        //First half
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i = n; i>=1; i--){
            //spaces
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //?Hollow rectangle pattern of 4x5
        // hollow_rectangle(6, 9);  //?Nice

        //? Inverted and rotated Half-Pyramid
        // inverted_rotated_half_pyramid(4);

        //? Inverted Half pyramid with numbers
        // inverted_half_pyramid_with_numbers(5); //?Amazing ... solved on the first try

        //?FLOYD's Triangle
        // FLOYDs_Triangle(5);  //? This was easy bro
        
        //? Zero-One Triangle
        // zero_one_triangle(5);

        //? Butterfly Pattern
        // butterfly(4);

        //? Solid Rhombus
        // solid_rhombus(4);

        //? Hollow Rhombus
        // hollow_rhombus(5);

        //?Diamond pattern
        diamond(4);
    }
}