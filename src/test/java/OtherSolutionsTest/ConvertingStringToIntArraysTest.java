package OtherSolutionsTest;

import OtherSolutions.ConvertingStringToIntArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertingStringToIntArraysTest {

    @Test
    public void countingLengthOfOneDimensionalArrayTest1() {
        String someNumbers = "1 55 13 10 4 0 16";
        int length = ConvertingStringToIntArrays.convertStringToOneDimensionalArray(someNumbers).length;
        Assertions.assertEquals(7, length);
    }
    @Test
    public void countingLengthOfOneDimensionalArrayTest2() {
        String someNumbers = " ";
        int length = ConvertingStringToIntArrays.convertStringToOneDimensionalArray(someNumbers).length;
        Assertions.assertEquals(0, length);
    }
    @Test
    public void countingLengthOfOneDimensionalArrayTest3() {
        String someNumbers = "7";
        int length = ConvertingStringToIntArrays.convertStringToOneDimensionalArray(someNumbers).length;
        Assertions.assertEquals(1, length);
    }
    @Test
    public void countingLengthOfRowOfTwoDimensionalArrayTest1() {
        String someNumbers2D =
                        "1 10 17 44\n" +
                        "3 24 27 22\n" +
                        "7 13 17 17";
        int[][] tab = ConvertingStringToIntArrays.convertStringToTwoDimensionalArray(someNumbers2D);
        Assertions.assertEquals(4, tab[0].length);
    }
    @Test
    public void countingLengthOfRowOfTwoDimensionalArrayTest2() {
        String someNumbers2D = "7";
        int[][] tab = ConvertingStringToIntArrays.convertStringToTwoDimensionalArray(someNumbers2D);
        Assertions.assertEquals(1, tab[0].length);
    }
    @Test
    public void countingLengthOfColumnOfTwoDimensionalArrayTest1() {
        String someNumbers2D =
                        "1 10 17 44\n" +
                        "3 24 27 22\n" +
                        "7 13 17 17";
        int[][] tab = ConvertingStringToIntArrays.convertStringToTwoDimensionalArray(someNumbers2D);
        Assertions.assertEquals(3, tab.length);
    }
    @Test
    public void countingLengthOfColumnOfTwoDimensionalArrayTest2() {
        String someNumbers2D = "7";
        int[][] tab = ConvertingStringToIntArrays.convertStringToTwoDimensionalArray(someNumbers2D);
        Assertions.assertEquals(1, tab.length);
    }
}
