package ProjectEulerTest;

import ProjectEuler.Problem6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem6Test {

    @Test
    public void sumOfSquaresTest1(){
        int result = Problem6.sumOfSquares(2);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void sumOfSquaresTest2(){
        int result = Problem6.sumOfSquares(0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void sumOfSquaresTest3(){
        int result = Problem6.sumOfSquares(1);
        Assertions.assertEquals(1, result);
    }
    @Test
    public void sumOfSquaresTest4(){
        int result = Problem6.sumOfSquares(-10);
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void sumOfSquaresTest5(){
        int result = Problem6.sumOfSquares(10);
        Assertions.assertEquals(385, result);
    }
    @Test
    public void squareOfSumTest1(){
        int result = Problem6.squareOfSum(0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void squareOfSumTest2(){
        int result = Problem6.squareOfSum(1);
        Assertions.assertEquals(1, result);
    }
    @Test
    public void squareOfSumTest3(){
        int result = Problem6.squareOfSum(2);
        Assertions.assertEquals(9, result);
    }
    @Test
    public void squareOfSumTest4(){
        int result = Problem6.squareOfSum(-2);
        Assertions.assertEquals(-1, result);
    }
}

