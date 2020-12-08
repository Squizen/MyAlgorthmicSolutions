package OtherSolutionsTest;

import OtherSolutions.NumberConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberConverterTest {

    @Test
    public void convertDecimalIntoBinaryTest1(){
        String result = NumberConverter.convertDecimalIntoBinary(0);
        Assertions.assertEquals("0", result);
    }
    @Test
    public void convertDecimalIntoBinaryTest2(){
        String result = NumberConverter.convertDecimalIntoBinary(1);
        Assertions.assertEquals("1", result);
    }
    @Test
    public void convertDecimalIntoBinaryTest3(){
        String result = NumberConverter.convertDecimalIntoBinary(-1);
        Assertions.assertEquals("Wrong input", result);
    }
    @Test
    public void convertDecimalIntoBinaryTest4(){
        String result = NumberConverter.convertDecimalIntoBinary(4);
        Assertions.assertEquals("100", result);
    }
    @Test
    public void convertDecimalIntoBinaryTest6(){
        String result = NumberConverter.convertDecimalIntoBinary(10);
        Assertions.assertEquals("1010", result);
    }
    @Test
    public void convertDecimalIntoBinaryTest7(){
        String result = NumberConverter.convertDecimalIntoBinary(2);
        Assertions.assertEquals("10", result);
    }
    @Test
    public void convertDecimalIntoBinaryTest8(){
        String result = NumberConverter.convertDecimalIntoBinary(16);
        Assertions.assertEquals("10000", result);
    }
    @Test
    public void convertDecimalIntoBinaryTest9(){
        String result = NumberConverter.convertDecimalIntoBinary(32);
        Assertions.assertEquals("100000", result);
    }
    @Test
    public void convertDecimalIntoBinaryTest10(){
        String result = NumberConverter.convertDecimalIntoBinary(33);
        Assertions.assertEquals("100001", result);
    }
    @Test
    public void convertBinaryIntoDecimalTest1(){
       long result = NumberConverter.convertBinaryIntoDecimal("0");
       Assertions.assertEquals(0, result);
    }
    @Test
    public void convertBinaryIntoDecimalTest2(){
        long result = NumberConverter.convertBinaryIntoDecimal("-10");
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void convertBinaryIntoDecimalTest3(){
        long result = NumberConverter.convertBinaryIntoDecimal("qwerty");
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void convertBinaryIntoDecimalTest4(){
        long result = NumberConverter.convertBinaryIntoDecimal("0001");
        Assertions.assertEquals(1, result);
    }
    @Test
    public void convertBinaryIntoDecimalTest5(){
        long result = NumberConverter.convertBinaryIntoDecimal("001");
        Assertions.assertEquals(1, result);
    }
    @Test
    public void convertBinaryIntoDecimalTest6(){
        long result = NumberConverter.convertBinaryIntoDecimal("01");
        Assertions.assertEquals(1, result);
    }
    @Test
    public void convertBinaryIntoDecimalTest7(){
        long result = NumberConverter.convertBinaryIntoDecimal("1");
        Assertions.assertEquals(1, result);
    }
    @Test
    public void convertBinaryIntoDecimalTest8(){
        long result = NumberConverter.convertBinaryIntoDecimal("1001");
        Assertions.assertEquals(9, result);
    }
    @Test
    public void convertBinaryIntoDecimalTest9(){
        long result = NumberConverter.convertBinaryIntoDecimal("1111");
        Assertions.assertEquals(15, result);
    }
    @Test
    public void convertBinaryIntoDecimalTest10(){
        long result = NumberConverter.convertBinaryIntoDecimal("1");
        Assertions.assertEquals(1, result);
    }
    @Test
    public void convertBinaryIntoOctalTest1(){
        String result = NumberConverter.convertBinaryIntoOctal("0");
        Assertions.assertEquals("0", result);
    }
    @Test
    public void convertBinaryIntoOctalTest2(){
        String result = NumberConverter.convertBinaryIntoOctal("1");
        Assertions.assertEquals("1", result);
    }
    @Test
    public void convertBinaryIntoOctalTest3(){
        String result = NumberConverter.convertBinaryIntoOctal("-1");
        Assertions.assertEquals("Wrong input", result);
    }
    @Test
    public void convertBinaryIntoOctalTest4(){
        String result = NumberConverter.convertBinaryIntoOctal("10");
        Assertions.assertEquals("2", result);
    }
    @Test
    public void convertBinaryIntoOctalTest5(){
        String result = NumberConverter.convertBinaryIntoOctal("11");
        Assertions.assertEquals("3", result);
    }
    @Test
    public void convertBinaryIntoOctalTest6(){
        String result = NumberConverter.convertBinaryIntoOctal("1111");
        Assertions.assertEquals("17", result);
    }
    @Test
    public void convertBinaryIntoOctalTest7(){
        String result = NumberConverter.convertBinaryIntoOctal("1000");
        Assertions.assertEquals("10", result);
    }
    @Test
    public void convertBinaryIntoOctalTest8(){
        String result = NumberConverter.convertBinaryIntoOctal("10001000");
        Assertions.assertEquals("210", result);
    }
    @Test
    public void convertBinaryIntoOctalTest9(){
        String result = NumberConverter.convertBinaryIntoOctal("100010001000");
        Assertions.assertEquals("4210", result);
    }
    @Test
    public void convertBinaryIntoOctalTest10(){
        String result = NumberConverter.convertBinaryIntoOctal("10101010");
        Assertions.assertEquals("252", result);
    }

    @Test
    public void convertOctalToBinaryTest1(){
        String result = NumberConverter.convertOctalToBinary("01");
        Assertions.assertEquals("1", result);
    }
    @Test
    public void convertOctalToBinaryTest2(){
        String result = NumberConverter.convertOctalToBinary("0");
        Assertions.assertEquals("0", result);
    }
    @Test
    public void convertOctalToBinaryTest3(){
        String result = NumberConverter.convertOctalToBinary("1");
        Assertions.assertEquals("1", result);
    }
    @Test
    public void convertOctalToBinaryTest4(){
        String result = NumberConverter.convertOctalToBinary("-1");
        Assertions.assertEquals("Wrong input", result);
    }
    @Test
    public void convertOctalToBinaryTest5(){
        String result = NumberConverter.convertOctalToBinary("9");
        Assertions.assertEquals("Wrong input", result);
    }
    @Test
    public void convertOctalToBinaryTest6(){
        String result = NumberConverter.convertOctalToBinary("000");
        Assertions.assertEquals("0", result);
    }
    @Test
    public void convertOctalToBinaryTest7(){
        String result = NumberConverter.convertOctalToBinary("3");
        Assertions.assertEquals("11", result);
    }
    @Test
    public void convertOctalToBinaryTest8(){
        String result = NumberConverter.convertOctalToBinary("142");
        Assertions.assertEquals("1100010", result);
    }
    @Test
    public void convertOctalToBinaryTest9(){
        String result = NumberConverter.convertOctalToBinary("74");
        Assertions.assertEquals("111100", result);
    }
    @Test
    public void convertOctalToBinaryTest10(){
        String result = NumberConverter.convertOctalToBinary("7");
        Assertions.assertEquals("111", result);
    }
    @Test
    public void convertOctalToDecimalTest1(){
        long result = NumberConverter.convertOctalToDecimal("0");
        Assertions.assertEquals(0, result);
    }
    @Test
    public void convertOctalToDecimalTest2(){
        long result = NumberConverter.convertOctalToDecimal("-1");
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void convertOctalToDecimalTest3(){
        long result = NumberConverter.convertOctalToDecimal("-10");
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void convertOctalToDecimalTest4(){
        long result = NumberConverter.convertOctalToDecimal("qwerty");
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void convertOctalToDecimalTest5(){
        long result = NumberConverter.convertOctalToDecimal("9");
        Assertions.assertEquals(-1, result);
    }
    @Test
    public void convertOctalToDecimalTest6(){
        long result = NumberConverter.convertOctalToDecimal("52");
        Assertions.assertEquals(42, result);
    }
    @Test
    public void convertOctalToDecimalTest7(){
        long result = NumberConverter.convertOctalToDecimal("20");
        Assertions.assertEquals(16, result);
    }
    @Test
    public void convertOctalToDecimalTest8(){
        long result = NumberConverter.convertOctalToDecimal("753");
        Assertions.assertEquals(491, result);
    }
    @Test
    public void convertOctalToDecimalTest9(){
        long result = NumberConverter.convertOctalToDecimal("4521");
        Assertions.assertEquals(2385, result);
    }
    @Test
    public void convertOctalToDecimalTest10(){
        long result = NumberConverter.convertOctalToDecimal("55226633");
        Assertions.assertEquals(11873691, result);
    }
    @Test
    public void convertDecimalToOctalTest1(){
        String result = NumberConverter.convertDecimalToOctal(0);
        Assertions.assertEquals("0", result);
    }
    @Test
    public void convertDecimalToOctalTest2(){
        String result = NumberConverter.convertDecimalToOctal(-0);
        Assertions.assertEquals("0", result);
    }
    @Test
    public void convertDecimalToOctalTest3(){
        String result = NumberConverter.convertDecimalToOctal(-1);
        Assertions.assertEquals("Wrong input", result);
    }
    @Test
    public void convertDecimalToOctalTest4(){
        String result = NumberConverter.convertDecimalToOctal(5555);
        Assertions.assertEquals("12663", result);
    }
    @Test
    public void convertDecimalToOctalTest5(){
        String result = NumberConverter.convertDecimalToOctal(478596);
        Assertions.assertEquals("1646604", result);
    }
}
