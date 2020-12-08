package ProjectEuler;

public class Problem4 {

    /*
    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    Find the largest palindrome made from the product of two 3-digit numbers.
    */

    public static void main(String[] args) {

        System.out.println(largestPalindrom(2));
        System.out.println(largestPalindrom(3));

    }
    public static int largestPalindrom(int numberOfDigits){
        int cases = (int) Math.pow(10, numberOfDigits);
        int largestPalindromResult = 0;
        for (int i = 1; i < cases; i++) {
            for (int j = 0; j < cases; j++) {
                if(i > j){
                    // This condition is made to eliminate duplicate checks of the same operations like 5x10 and 10x5
                    continue;
                } else {
                    int result = i * j;
                    if(checkIfNumberIsPalindrome(result)){
                        largestPalindromResult = result;
                    }
                }
            }
        }
        return largestPalindromResult;
    }
    public static boolean checkIfNumberIsPalindrome(int number){
        if(number >= 0){
            char[] numberInArr = String.valueOf(number).toCharArray();
            int oppositeIndex = numberInArr.length - 1;
            for (int i = 0; i < numberInArr.length; i++) {
                if(numberInArr[i] != numberInArr[oppositeIndex]){
                    return false;
                }
                oppositeIndex--;
            }
            return true;
        } else {
            return false;
        }
    }
}