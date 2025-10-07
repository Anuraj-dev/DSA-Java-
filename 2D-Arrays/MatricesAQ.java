public class MatricesAQ {
    //?PQ-1
    public static void findOccurance(int matrix[][], int num){
        int count = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j]== num){
                    count++;
                }
            }
        }
        System.out.println("The total occurances of " + num + " is: " + count);
    }

    //?PQ-2
    public static void print2ndRowSum(int matrix[][]){
        int sum = 0;
        for(int j=0; j<matrix[0].length;j++){
            sum+= matrix[1][j];
        }

        System.out.println("2nd Row sum of the matrix is: " + sum);
    }

    //? PQ-3 | Find Transpose
    public static int[][] findTranspose(int matrix[][]){
        int tMat[][] = new int[matrix[0].length][matrix.length];
        
        for(int i = 0; i<tMat.length; i++){
            for(int j = 0; j<tMat[0].length; j++){
                tMat[i][j] = matrix[j][i];
            }
        }

        return tMat;
    }

    //?Print 2D matrix
    public static void printMatrix(int matrix[][]){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
     int matrix[][] = {
        {1,4,9},
        {11,4,3}
     };

     //? Testing PQ-1
     findOccurance(matrix, 4);

     //? 2nd PQ Testing
     print2ndRowSum(matrix);

     //? Transpose of matrix
     printMatrix(findTranspose(matrix));
    }
}
