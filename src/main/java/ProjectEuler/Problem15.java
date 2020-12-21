package ProjectEuler;

import java.math.BigInteger;

public class Problem15 {

    /*
    Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.

    How many such routes are there through a 20×20 grid?
    */

    public static void main(String[] args) {
        System.out.println(countPermutationsForGrid(2));
        System.out.println(countPermutationsForGrid(20));
    }
    public static long countPermutationsForGrid(int gridSide){
        BigInteger resultOfNTotalSymbols = new BigInteger("1");
        for (int i = gridSide*2; i > 0; i--) {
            resultOfNTotalSymbols = resultOfNTotalSymbols.multiply(BigInteger.valueOf(i));
        }
        BigInteger numberOfBottomMoves = new BigInteger("1");
        for (int i = gridSide; i > 0; i--) {
            numberOfBottomMoves = numberOfBottomMoves.multiply(BigInteger.valueOf(i));
        }
        BigInteger numberOfRightMoves = new BigInteger("1");
        for (int i = gridSide; i > 0; i--) {
            numberOfRightMoves = numberOfRightMoves.multiply(BigInteger.valueOf(i));
        }
        BigInteger totalNumberOfMoves = numberOfBottomMoves.multiply(numberOfRightMoves);
        BigInteger result = resultOfNTotalSymbols.divide(totalNumberOfMoves);
        return result.longValue();
    }
}
