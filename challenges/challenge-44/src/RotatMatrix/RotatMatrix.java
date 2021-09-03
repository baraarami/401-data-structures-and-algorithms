package RotatMatrix;

public class RotatMatrix {

    private int[][] rotateMatrix(int [][] matrix){
        int totalRows = matrix[0].length;
        int totalColumn = matrix.length;

        int [][] ratatedMatrix = new int[totalRows][totalColumn];

        for (int i=0 ; i< matrix.length ; i++){
            for (int j=0 ; j < matrix[0].length ; j++){
                ratatedMatrix[(totalRows -1) - j][i] = matrix[i][j];
            }
        }
        return ratatedMatrix;
    }

    private static void printMatrix(int [][] matrix){
        for (int i=0 ; i< matrix.length ; i++){
            for (int j=0 ; j < matrix[0].length ; j++){
                System.out.println(matrix[i][j]+ "     ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        new RotatMatrix();
    }

    public RotatMatrix(){
        int [][] matrix = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };
        System.out.println("Original matrix : ");
        printMatrix(matrix);

        int [][] rotatedMatrix = rotateMatrix(matrix);
        System.out.println("Rotated Matrix : ");
        printMatrix(rotatedMatrix);
    }

}
