package ProjectEulerTest;

import ProjectEuler.Problem2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem2Test {

    @Test
    public void findSumOfTermsBelowParameterTest1(){
        long result = Problem2.findSumOfTermsBelowParameter(0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findSumOfTermsBelowParameterTest2(){
        long result = Problem2.findSumOfTermsBelowParameter(-1);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findSumOfTermsBelowParameterTest3(){
        long result = Problem2.findSumOfTermsBelowParameter(2);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void findSumOfTermsBelowParameterTest4(){
        long result = Problem2.findSumOfTermsBelowParameter(10);
        Assertions.assertEquals(10, result);
    }
    @Test
    public void findSumOfTermsBelowParameterTest5(){
        long result = Problem2.findSumOfTermsBelowParameter(100);
        Assertions.assertEquals(44, result);
    }
}