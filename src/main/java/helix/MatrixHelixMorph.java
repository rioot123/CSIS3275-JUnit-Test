package helix;

public class MatrixHelixMorph {

    /**
     * @param inMatrix
     * @return a matrix that is morphed into a helix version of inMatrix
     */
    public static int[][] helix( int[][] inMatrix) {
    	int x = 1;
    	int y = inMatrix.length;
    	int z = inMatrix[0].length;
    	int minCol = 0;
    	int maxCol = z-1;
    	int minRow = 0;
    	int maxRow = y-1;
    	while (x <= y*z)
        {
            for (int i = minCol; i <= maxCol; i++)
            {
            	inMatrix[minRow][i] = x;       
                x++;
            }   
            for (int i = minRow+1; i <= maxRow; i++) 
            { 
            	inMatrix[i][maxCol] = x;          
                x++; 
            } 
             
            for (int i = maxCol-1; i >= minCol; i--)
            {
            	inMatrix[maxRow][i] = x;                
                x++;
            }          
            for (int i = maxRow-1; i >= minRow+1; i--) 
            {
            	inMatrix[i][minCol] = x;           
                x++;
            }
            minCol++;
            maxCol--;
            minRow++;
            maxRow--;
            //based off of code from https://rosettacode.org/wiki/Spiral_matrix#Java, modified for rectangles
        }
         return inMatrix;
    }
}