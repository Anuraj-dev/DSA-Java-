public class MatricesPQ {
    public static void printSpiralMatrix(int matrix[][]){
        int startRow = 0, startCol = 0, endRow = matrix.length-1, endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }

            //Right
            for(int i = startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }

            //bottom
            for(int j = endCol-1; j>=startCol; j--){
                if(startRow == endRow){                                 //! It is said that it is written for avoid dublicates but it already avoids that
                    break;                                              //! Dry run and find out how
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            //right                                                 
            for(int i = endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){
                    break;                                              //! Same for this | dry run
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }

    public static void calDiagonalSum(int matrix[][]){
        int primaryDiagSum = 0, secondaryDiagSum= 0;
        //*Calculate primary diag
        int i = 0, j=0;
        while(i<=matrix.length-1){
            primaryDiagSum += matrix[i][j];
            i++;
            j++;
        }

        //* Calculate secondary diag
        i = 0;
        j = matrix[0].length-1;

        while(i<=matrix.length-1){
            if(i!=j){
                secondaryDiagSum += matrix[i][j];
            }
            i++;
            j--;
        }

        int totalDiagSum = primaryDiagSum + secondaryDiagSum;
        
        System.out.println("The Total Diagonal Sum of the Matrix is: " + totalDiagSum);
    }

    public static void optimisedDiagSum(int matrix[][]){
        int sum = 0;
        int n = matrix.length-1;
        for(int i = 0; i<=n; i++){
            //Primary diag
            sum+= matrix[i][i];

            //secondary diag
            if(i != n-i){
                sum+= matrix[i][n-i];
            }
        }
        System.out.println("The Total optimised Diagonal Sum is: " + sum);
    }

    public static boolean staircaseSearch(int sortedMatrix[][], int key){
        int i = 0, j = sortedMatrix[0].length-1;
        
        while(i<sortedMatrix.length && j>=0){
            if(key == sortedMatrix[i][j]){
                System.out.println("Key is found at idx: " + i + "," + j);
                return true;
            }
            if(key<sortedMatrix[i][j]){
                //left
                j--;
            } 
            else{
                //Bottom
                i++;
            }
        }
        System.out.println("Key not Found");
        return false;
    }

    //? Same but start from left bottom
    public static boolean staircaseSearchV2(int sortedMatrix[][], int key){
        int i = sortedMatrix.length-1, j = 0;
        
        while(j<sortedMatrix[0].length && i>=0){
            if(key == sortedMatrix[i][j]){
                System.out.println("Key is found at idx: " + i + "," + j);
                return true;
            }
            if(key<sortedMatrix[i][j]){
                //up
                i--;
            } 
            else{
                //right
                j++;
            }
        }
        System.out.println("Key not Found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        int matrix1[][] = {
            {0,1,2},
            {3,4,5},
            {6,7,8}
        };

        

        //? Lets test this spiral matrix
        // printSpiralMatrix(matrix);

        //? Calculating diag
        // calDiagonalSum(matrix1);
        // optimisedDiagSum(matrix1);

        //? Staircase search
        // staircaseSearch(matrix, 33);
        staircaseSearchV2(matrix, 33);
    }
}
