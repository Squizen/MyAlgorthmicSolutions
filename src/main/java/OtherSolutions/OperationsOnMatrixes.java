package OtherSolutions;

public class OperationsOnMatrixes {

    /*
    This class has solutions to work on Matrixes
    Author : Jakub Rucki
    */
    public static void main(String[] args) {

        double[][] matrixOne = {{1,1,1},{2,2,2},{3,3,3}};
        double[][] matrixTwo = {{4,4,4},{2,2,2},{6,6,6}};
        double[][] matrixTEST = {{3}};

        double[][] matrixDET = {{2,3},{-1,7}};
        System.out.println(detMatrix(matrixDET));

//        System.out.println(detMatrix(matrixTEST));

//        double[][] resultMatrix2 = substractingMatrixes(matrixOne, matrixTwo);
//        for (int i = 0; i < resultMatrix2.length; i++) {
//            for (int j = 0; j < resultMatrix2[i].length; j++) {
//                System.out.print(resultMatrix2[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    private static boolean checkIfMatrixDimensionAreNotEqualToZero(double[][] matrix){
        if(matrix[0].length == 0){
            return false;
        } else {
            return true;
        }
    }
    private static boolean checkIfMatrixIsRectangle(double[][] matrix){
        int rowLength = matrix[0].length;
        for (int i = 1; i < matrix.length; i++) {
            if(rowLength != matrix[i].length){
                return false;
            }
        }
        return true;
    }
    private static boolean checkIfMatrixesHasSameDimensions(double[][] matrixOne, double[][] matrixTwo){
        if(matrixOne.length == matrixTwo.length){
            for (int i = 0; i < matrixOne.length; i++) {
                if(matrixOne[i].length != matrixTwo[i].length){
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
    private static double[][] addingMatrixes(double[][] matrixOne, double[][] matrixTwo){
        double[][] resultMatrix;
        if(checkIfMatrixDimensionAreNotEqualToZero(matrixOne) && checkIfMatrixDimensionAreNotEqualToZero(matrixTwo)){
            if(checkIfMatrixIsRectangle(matrixOne) && checkIfMatrixIsRectangle(matrixTwo)){
                if(checkIfMatrixesHasSameDimensions(matrixOne, matrixTwo)){
                    resultMatrix = new double[matrixOne.length][matrixOne[0].length];
                    for (int rowIndex = 0; rowIndex < matrixOne.length; rowIndex++) {
                        for (int columnIndex = 0; columnIndex < matrixOne[rowIndex].length; columnIndex++) {
                            resultMatrix[rowIndex][columnIndex] = matrixOne[rowIndex][columnIndex] + matrixTwo[rowIndex][columnIndex];
                        }
                    }
                    return resultMatrix;
                } else {
                    throw new RuntimeException("Matrixes doesnt have same dimensions");
                }
            } else {
                throw new RuntimeException("Matrixes are not rectangles");
            }
        } else {
            throw new RuntimeException("One or more matrixes has one or more dimension equal to zero");
        }
    }

    private static double[][] substractingMatrixes(double[][] matrixOne, double[][] matrixTwo){
        double[][] resultMatrix;
        if(checkIfMatrixDimensionAreNotEqualToZero(matrixOne) && checkIfMatrixDimensionAreNotEqualToZero(matrixTwo)){
            if(checkIfMatrixIsRectangle(matrixOne) && checkIfMatrixIsRectangle(matrixTwo)){
                if(checkIfMatrixesHasSameDimensions(matrixOne, matrixTwo)){
                    resultMatrix = new double[matrixOne.length][matrixOne[0].length];
                    for (int rowIndex = 0; rowIndex < matrixOne.length; rowIndex++) {
                        for (int columnIndex = 0; columnIndex < matrixOne[rowIndex].length; columnIndex++) {
                            resultMatrix[rowIndex][columnIndex] = matrixOne[rowIndex][columnIndex] - matrixTwo[rowIndex][columnIndex];
                        }
                    }
                    return resultMatrix;
                } else {
                    throw new RuntimeException("Matrixes doesnt have same dimensions");
                }
            } else {
                throw new RuntimeException("Matrixes are not rectangles");
            }
        } else {
            throw new RuntimeException("One or more matrixes has one or more dimension equal to zero");
        }
    }

    public static double detMatrix(double[][] matrix){
        if(checkIfMatrixDimensionAreNotEqualToZero(matrix)){
            if(checkIfMatrixIsRectangle(matrix)){
                if(matrix.length == 1){
                    return matrix[0][0];
                } else if(matrix.length == 2){
                    double sumOfTopLeftBottomRightDiagonal = 1;
                    for (int i = 0; i < matrix.length; i++) {
                        sumOfTopLeftBottomRightDiagonal *= matrix[i][i];
                    }
                    double sumOfBottomleftTopRightDiagonal = 1;
                    int bottomIndex = matrix[0].length;
                    for (int i = 0; i < matrix.length; i++) {
                        sumOfBottomleftTopRightDiagonal *= matrix[bottomIndex-1][i];
                        bottomIndex--;
                    }
                    return sumOfTopLeftBottomRightDiagonal - sumOfBottomleftTopRightDiagonal;
                } else {
                    throw new RuntimeException("sialala");
                }
            } else {
                throw new RuntimeException("Cannot compute determinant of non-square matrix");
            }
        } else {
            throw new RuntimeException("Matrix is 0x0 so it doesnt have any determinant");
        }
    }
}
