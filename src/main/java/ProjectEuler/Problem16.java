package ProjectEuler;

import java.math.BigInteger;

public class Problem16 {

    /*
    2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

    What is the sum of the digits of the number 2^1000?
    */

    public static void main(String[] args) {
        System.out.println(sumOfDigitsInNumber(2,15));
        System.out.println(sumOfDigitsInNumber(2,1000));
    }
    public static int sumOfDigitsInNumber(int base, int power){
        BigInteger resultOfPowering = new BigInteger(String.valueOf(base));
        for (int i = 1; i < power; i++) {
            resultOfPowering = resultOfPowering.multiply(new BigInteger("2"));
        }
        char[] resultInArr = resultOfPowering.toString().toCharArray();
        int result = 0;
        for (int i = 0; i < resultOfPowering.toString().length(); i++) {
            result += Character.getNumericValue(resultInArr[i]);
        }
        return result;
    }
}
