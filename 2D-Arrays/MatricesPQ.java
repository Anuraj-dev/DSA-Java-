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
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4,50},
            {5,6,7,8,51},
            {9,10,11,12,52},
            {13,14,15,16,53},
            {17,18,19,20,54}
        };
        int matrix2[][] = {
            {1, 2, 3}
        };

        //? Lets test this spiral matrix
        printSpiralMatrix(matrix2);
    }
}
