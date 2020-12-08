package ProjectEuler;

public class Problem10 {

    /*

    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    Find the sum of all the primes below two million.

    */

    public static void main(String[] args) {

        System.out.println(sumOfPrimesBelowParam(10));
        System.out.println(sumOfPrimesBelowParam(2000000));

    }

    public static long sumOfPrimesBelowParam(int param){
        int sum = 0;
        for (int i = 0; i < param; i++) {
            if(checkIfPrime(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static boolean checkIfPrime(int number){
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

