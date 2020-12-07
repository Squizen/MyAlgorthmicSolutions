package ProjectEulerTest;

import ProjectEuler.Problem1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem1Test {

    @Test
    public void findSumOfAllMiltiples1() {
        int result = Problem1.findSumOfAllMiltiples(0);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findSumOfAllMiltiples2() {
        int result = Problem1.findSumOfAllMiltiples(-1);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findSumOfAllMiltiples3() {
        int result = Problem1.findSumOfAllMiltiples(3);
        Assertions.assertEquals(0, result);
    }
    @Test
    public void findSumOfAllMiltiples4() {
        int result = Problem1.findSumOfAllMiltiples(5);
        Assertions.assertEquals(3, result);
    }
    @Test
    public void findSumOfAllMiltiples5() {
        int result = Problem1.findSumOfAllMiltiples(-100);
        Assertions.assertEquals(0, result);
    }
}