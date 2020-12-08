package ProjectEulerTest;

import ProjectEuler.Problem11;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem11Test {

    private static int[][] testingTab = {{1,1,3},
                                         {4,1,0},
                                         {1,0,9}};

    private static int[][] testingTab2 = {{1,1,3},
                                          {4,2,0},
                                          {7,0,9}};

    private static int[][] emptyTab = {{}};

    @Test
    public void findGreatestProductInRowTest1(){
        long result = Problem11.findGreatestProductInRow(testingTab, 2);
        Assertions.assertEquals(4, result);
    }
    @Test
    public void findGreatestProductInRowTest2(){
        long result = Problem11.findGreatestProductInRow(testingTab, 1);
        Assertions.assertEquals(9, result);
    }
    @Test
    public void findGreatestProductInRowTest3(){
        long result = Problem11.findGreatestProductInRow(testingTab, 3);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void findGreatestProductInRowTest4(){
        long result = Problem11.findGreatestProductInRow(emptyTab, 2);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findGreatestProductInRowTest5(){
        int[][] tab = {{5}};
        long result = Problem11.findGreatestProductInRow(tab, 1);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void findGreatestProductInRowTest6(){
        int[][] tab = {{5}};
        long result = Problem11.findGreatestProductInRow(tab, 2);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findGreatestProductInColumnTest1(){
        long result = Problem11.findGreatestProductInColumn(testingTab, 2);
        Assertions.assertEquals(4, result);
    }
    @Test
    public void findGreatestProductInColumnTest2(){
        long result = Problem11.findGreatestProductInColumn(testingTab, 1);
        Assertions.assertEquals(9, result);
    }
    @Test
    public void findGreatestProductInColumnTest3(){
        long result = Problem11.findGreatestProductInColumn(testingTab, 0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findGreatestProductInColumnTest4(){
        long result = Problem11.findGreatestProductInColumn(testingTab, 3);
        Assertions.assertEquals(4, result);
    }
    @Test
    public void findGreatestProductInColumnTest5(){
        long result = Problem11.findGreatestProductInColumn(emptyTab, 2);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findGreatestProductInColumnTest6(){
        int[][] tab = {{5}};
        long result = Problem11.findGreatestProductInColumn(tab, 1);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void findGreatestProductInColumnTest7(){
        int[][] tab = {{5}};
        long result = Problem11.findGreatestProductInColumn(tab, 2);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findGreatestProductInTopLeftToBottomRightDiagonalTest1(){
        long result = Problem11.findGreatestProductInTopLeftToBottomRightDiagonal(testingTab2, 2);
        Assertions.assertEquals(18, result);
    }
    @Test
    public void findGreatestProductInTopLeftToBottomRightDiagonalTest2(){
        long result = Problem11.findGreatestProductInTopLeftToBottomRightDiagonal(testingTab2, 1);
        Assertions.assertEquals(9, result);
    }
    @Test
    public void findGreatestProductInTopLeftToBottomRightDiagonalTest3(){
        long result = Problem11.findGreatestProductInTopLeftToBottomRightDiagonal(testingTab2, 0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findGreatestProductInTopLeftToBottomRightDiagonalTest4(){
        long result = Problem11.findGreatestProductInTopLeftToBottomRightDiagonal(emptyTab, 2);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void findGreatestProductInTopRightToBottomLeftDiagonalTest1(){
        long result = Problem11.findGreatestProductInTopRightToBottomLeftDiagonal(testingTab2, 2);
        Assertions.assertEquals(14, result);
    }
    @Test
    public void findGreatestProductInTopRightToBottomLeftDiagonalTest2(){
        long result = Problem11.findGreatestProductInTopRightToBottomLeftDiagonal(testingTab2, 1);
        Assertions.assertEquals(9, result);
    }
    @Test
    public void findGreatestProductInTopRightToBottomLeftDiagonalTest3(){
        long result = Problem11.findGreatestProductInTopRightToBottomLeftDiagonal(testingTab2, 3);
        Assertions.assertEquals(42, result);
    }
    @Test
    public void findGreatestProductInTopRightToBottomLeftDiagonalTest4(){
        long result = Problem11.findGreatestProductInTopRightToBottomLeftDiagonal(emptyTab, 2);
        Assertions.assertEquals(0, result);
    }
}
