package ProjectEuler;

public class Problem6 {

    /*
    The sum of the squares of the first ten natural numbers is,

        1^2 + 2^2 + ... + 10^2 = 385

    The square of the sum of the first ten natural numbers is,

        ( 1 + 2 + ... + 10 )^2 = 55^2 = 3025

    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is

        3025 - 385 = 2640

    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    */

    public static void main(String[] args) {

        System.out.println(squareOfSum(10) - sumOfSquares(10));
        System.out.println(squareOfSum(100) - sumOfSquares(100));

    }
    public static int sumOfSquares(int numberOfCases){
        if(numberOfCases < 0){
            return -1;
        } else {
            int result = 0;
            for (int i = 1; i <= numberOfCases; i++) {
                result += Math.pow(i, 2);
            }
            return result;
        }
    }
    public static int squareOfSum(int numberOfCases){
        if(numberOfCases < 0){
            return -1;
        } else {
            int sum = 0;
            for (int i = 1; i <= numberOfCases; i++) {
                sum += i;
            }
            return (int) Math.pow(sum, 2);
        }
    }
}
