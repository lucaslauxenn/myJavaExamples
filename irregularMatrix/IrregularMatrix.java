/* The following program is based on "Java The Complete Reference Thirteenth edition" Multidimensional
   Arrays part which exemplifies the creation of an irregular matrix.   */

public class IrregularMatrix {
    public static void main(String[] args) {

        int[][] matrix = new int[4][]; // Allocating memory for only the first
                                       // dimension from the 2D array.
        int k = 0, i, j;
        for (i = 0; i < 4; i++) {
            matrix[i] = new int[i + 1];    // Allocating memory for the second dimension unequally.
            for (j = 0; j < i + 1; j++) {
                matrix[i][j] = k;         // Assigning each element of the matrix
                k++;                      // with (k).
            }
        }


        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(matrix[i][j] + " ");  // Printing all elements from each row.
            }
            System.out.println(); //  Printing /n (new line) for each row.
        }


       /* Output: 0
                  1 2
                  3 4 5
                  6 7 8 9
       */
    }
}
