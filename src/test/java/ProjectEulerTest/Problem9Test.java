package ProjectEulerTest;

import ProjectEuler.Problem9;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem9Test {

    @Test
    public void findPythagoreanTripletTest1(){
        long result = Problem9.findPythagoreanTriplet(0);
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void findPythagoreanTripletTest2(){
        long result = Problem9.findPythagoreanTriplet(-1);
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void findPythagoreanTripletTest3(){
        long result = Problem9.findPythagoreanTriplet(12);
        Assertions.assertEquals(60, result);
    }
    @Test
    public void findPythagoreanTripletTest4(){
        long result = Problem9.findPythagoreanTriplet(60);
        Assertions.assertEquals(6240, result);
    }
}
