package Patterns;

public class PatternsPQ {
    public static void main(String[] args) {
        int n = 4;
        for(int i =1; i<=n; i++){
            // System.out.print("*");
            for(int j = n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}