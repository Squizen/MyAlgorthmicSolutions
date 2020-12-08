package ProjectEulerTest;

import ProjectEuler.Problem10;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem10Test {

    @Test
    public void checkIfPrimeTest1(){
        boolean result = Problem10.checkIfPrime(0);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void checkIfPrimeTest2(){
        boolean result = Problem10.checkIfPrime(1);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void checkIfPrimeTest3(){
        boolean result = Problem10.checkIfPrime(2);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void checkIfPrimeTest4(){
        boolean result = Problem10.checkIfPrime(-3);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void checkIfPrimeTest5(){
        boolean result = Problem10.checkIfPrime(23);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void sumOfPrimesBelowParamTest1(){
        long result = Problem10.sumOfPrimesBelowParam(1);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void sumOfPrimesBelowParamTest2(){
        long result = Problem10.sumOfPrimesBelowParam(-1);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void sumOfPrimesBelowParamTest3(){
        long result = Problem10.sumOfPrimesBelowParam(0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void sumOfPrimesBelowParamTest4(){
        long result = Problem10.sumOfPrimesBelowParam(10);
        Assertions.assertEquals(17, result);
    }
    @Test
    public void sumOfPrimesBelowParamTest5(){
        long result = Problem10.sumOfPrimesBelowParam(3);
        Assertions.assertEquals(2, result);
    }
}

