package ProjectEuler;

public class Problem3 {

    /*
    Problem 3

    The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?
     */

    public static void main(String[] args) {

        System.out.println(largestPrimeFactor(13195));
        System.out.println(largestPrimeFactor(600851475143L));

    }
    public static long largestPrimeFactor(long number){
        if(checkIfPrime(number)){
            return number;
        }
        int largestDivider = 0;
        for (int divider = 2; divider <= Math.sqrt(number); divider++) {
            if(number % divider == 0){
                if(checkIfPrime(divider)){
                    largestDivider = divider;
                }
            }
        }
        return largestDivider;
    }

    public static boolean checkIfPrime(long number){
        boolean isPrime = false;
        if(number == 2 || number == 3){
            return true;
        } else {
            for (int divider = 2; divider <= Math.sqrt(number); divider++) {
                if(number % divider == 0){
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            return isPrime;
        }
    }
}
