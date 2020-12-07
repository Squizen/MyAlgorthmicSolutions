package ProjectEulerTest;

import ProjectEuler.Problem3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem3Test {

    @Test
    public void checkIfPrimeTest1(){
        boolean result = Problem3.checkIfPrime(0);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void checkIfPrimeTest2(){
        boolean result = Problem3.checkIfPrime(1);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void checkIfPrimeTest3(){
        boolean result = Problem3.checkIfPrime(2);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void checkIfPrimeTest4(){
        boolean result = Problem3.checkIfPrime(-3);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void checkIfPrimeTest5(){
        boolean result = Problem3.checkIfPrime(23);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void largestPrimeFactorTest1(){
        long result = Problem3.largestPrimeFactor(0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void largestPrimeFactorTest2(){
        long result = Problem3.largestPrimeFactor(-1);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void largestPrimeFactorTest3(){
        long result = Problem3.largestPrimeFactor(2);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void largestPrimeFactorTest4(){
        long result = Problem3.largestPrimeFactor(5);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void largestPrimeFactorTest5(){
        long result = Problem3.largestPrimeFactor(-9999);
        Assertions.assertEquals(0, result);
    }
}

