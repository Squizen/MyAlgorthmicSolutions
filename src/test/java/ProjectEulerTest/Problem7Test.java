package ProjectEulerTest;

import ProjectEuler.Problem7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem7Test {

    @Test
    public void checkIfPrimeTest1(){
        boolean result = Problem7.checkIfPrime(0);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void checkIfPrimeTest2(){
        boolean result = Problem7.checkIfPrime(1);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void checkIfPrimeTest3(){
        boolean result = Problem7.checkIfPrime(2);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void checkIfPrimeTest4(){
        boolean result = Problem7.checkIfPrime(-3);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void checkIfPrimeTest5(){
        boolean result = Problem7.checkIfPrime(23);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void checkIfPrimeTest6(){
        boolean result = Problem7.checkIfPrime(3);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void checkIfPrimeTest7(){
        boolean result = Problem7.checkIfPrime(9);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void findNthPrimeTest1(){
        long result = Problem7.findNthPrime(0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findNthPrimeTest2(){
        long result = Problem7.findNthPrime(-1);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findNthPrimeTest3(){
        long result = Problem7.findNthPrime(1);
        Assertions.assertEquals(2, result);
    }
    @Test
    public void findNthPrimeTest4(){
        long result = Problem7.findNthPrime(2);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void findNthPrimeTest5(){
        long result = Problem7.findNthPrime(6);
        Assertions.assertEquals(13, result);
    }
    @Test
    public void findNthPrimeTest6(){
        long result = Problem7.findNthPrime(3);
        Assertions.assertEquals(5, result);
    }
}
