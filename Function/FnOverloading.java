package Function;

public class FnOverloading {

    //!Funtion overloading depends on no of parameters and types of parameters not the return type (Remember it)

    //?Funtion overloading using parameters
    // public static int sum(int a, int b){
    //     return a + b;
    // }

    // public static int sum(int a, int b, int c){
    //     return a + b+ c;
    // }

    //?Funciton overloading using data types
    public static int sum(int a, int b){
        return a + b;
    }

    public static float sum (float a, float b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(4, 5));
        System.out.println(sum(4.6f, 5.7f));
    }
}