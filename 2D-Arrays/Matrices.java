import java.util.Scanner;

public class Matrices {
    public static boolean search(int matrix[][], int key){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key Found at index: " + i + "," + j);
                    return true;
                }
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    //? Find min and max in 2D array
    public static int[] findMinMax(int  matrix[][]){
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                min = Math.min(min, matrix[i][j]);
                max = Math.max(max, matrix[i][j]);
            }
        }
        return new int[]{min,max};
    }


    public static void main(String[] args) {
        int matrix[][] = new int[3][3];                     //? Creation of 2D arrays
        //Calculate length of rows and cols
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print("Input num for " + i + ", " +j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //? Search
        search(matrix, 6);

        //? Min Max of this array
        int arr[] = findMinMax(matrix);
        System.out.println("Min is: " + arr[0]);
        System.out.println("Max is: " + arr[1]);

        sc.close();
    }
}
