package ProjectEulerTest;

import ProjectEuler.Problem12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem12Test {

    @Test
    public void checkHowManyDivisorsTest1(){
        int result = Problem12.checkHowManyDivisors(17);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void checkHowManyDivisorsTest2(){
        int result = Problem12.checkHowManyDivisors(1);
        Assertions.assertEquals(1, result);
    }
    @Test
    public void checkHowManyDivisorsTest3(){
        int result = Problem12.checkHowManyDivisors(4);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void checkHowManyDivisorsTest4(){
        int result = Problem12.checkHowManyDivisors(0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void checkHowManyDivisorsTest5(){
        int result = Problem12.checkHowManyDivisors(-1);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findTriangleNumberToHasOverFiveHundredDivisorsTest1(){
        long result = Problem12.findTriangleNumberToHasOverFiveHundredDivisors(5);
        Assertions.assertEquals(28, result);
    }
    @Test
    public void findTriangleNumberToHasOverFiveHundredDivisorsTest2(){
        long result = Problem12.findTriangleNumberToHasOverFiveHundredDivisors(3);
        Assertions.assertEquals(6, result);
    }
    @Test
    public void findTriangleNumberToHasOverFiveHundredDivisorsTest3(){
        long result = Problem12.findTriangleNumberToHasOverFiveHundredDivisors(4);
        Assertions.assertEquals(28, result);
    }
}
