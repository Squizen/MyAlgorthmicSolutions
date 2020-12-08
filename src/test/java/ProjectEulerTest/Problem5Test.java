package ProjectEulerTest;

import ProjectEuler.Problem5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem5Test {

    @Test
    public void findSmallestNumberTest1(){
        long result = Problem5.findSmallestNumber(1,2);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void findSmallestNumberTest2(){
        long result = Problem5.findSmallestNumber(2,3);
        Assertions.assertEquals(6, result);
    }
    @Test
    public void findSmallestNumberTest3(){
        long result = Problem5.findSmallestNumber(3,4);
        Assertions.assertEquals(12, result);
    }
    @Test
    public void findSmallestNumberTest4(){
        long result = Problem5.findSmallestNumber(1,10);
        Assertions.assertEquals(2520, result);
    }
    @Test
    public void findSmallestNumberTest5(){
        long result = Problem5.findSmallestNumber(0,10);
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void findSmallestNumberTest6(){
        long result = Problem5.findSmallestNumber(10,1);
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void findSmallestNumberTest7(){
        long result = Problem5.findSmallestNumber(-1,2);
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void findSmallestNumberTest8(){
        long result = Problem5.findSmallestNumber(2,2);
        Assertions.assertEquals(2, result);
    }
}
