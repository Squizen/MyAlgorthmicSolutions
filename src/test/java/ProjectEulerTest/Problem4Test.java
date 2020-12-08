package ProjectEulerTest;

import ProjectEuler.Problem4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Problem4Test {

    @Test
    public void checkIfNumberIsPalindromeTest1(){
        boolean result = Problem4.checkIfNumberIsPalindrome(0);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void checkIfNumberIsPalindromeTest2(){
        boolean result = Problem4.checkIfNumberIsPalindrome(1);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void checkIfNumberIsPalindromeTest3(){
        boolean result = Problem4.checkIfNumberIsPalindrome(10);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void checkIfNumberIsPalindromeTest4(){
        boolean result = Problem4.checkIfNumberIsPalindrome(1111);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void checkIfNumberIsPalindromeTest5(){
        boolean result = Problem4.checkIfNumberIsPalindrome(11111);
        Assertions.assertEquals(true, result);
    }
    @Test
    public void checkIfNumberIsPalindromeTest6(){
        boolean result = Problem4.checkIfNumberIsPalindrome(-1);
        Assertions.assertEquals(false, result);
    }
    @Test
    public void largestPalindromTest1(){
        int result = Problem4.largestPalindrom(1);
        Assertions.assertEquals(9,result);
    }
    @Test
    public void largestPalindromTest2(){
        int result = Problem4.largestPalindrom(2);
        Assertions.assertEquals(9009,result);
    }
}
