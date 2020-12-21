package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class KPrimes {

    /*
    A natural number is called k-prime if it has exactly k prime factors, counted with multiplicity. For example:

    k = 2  -->  4, 6, 9, 10, 14, 15, 21, 22, ...
    k = 3  -->  8, 12, 18, 20, 27, 28, 30, ...
    k = 5  -->  32, 48, 72, 80, 108, 112, ...

    A natural number is thus prime if and only if it is 1-prime.

    Task:

    Complete the function count_Kprimes (or countKprimes, count-K-primes, kPrimes) which is given parameters k, start, end (or nd)
    and returns an array (or a list or a string depending on the language - see "Solution" and "Sample Tests") of the k-primes
    between start (inclusive) and end (inclusive).
    */

    public static void main(String[] args) {
        long[] tab = count_Kprimes(5, 500, 600);
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
    public static long[] count_Kprimes(int primeFactors, int bottomOfrange, int topOfRange){

        int factorsFound = 0;
        int numberCurrentlyWorkingOn = 0;
        List<Integer> listOfResult = new ArrayList<Integer>();

        for (int i = bottomOfrange; i <= topOfRange ; i++) {
            factorsFound = 0;
            numberCurrentlyWorkingOn = i;
            for (int factor = 2; factor <= numberCurrentlyWorkingOn; factor++) {
                if(numberCurrentlyWorkingOn % factor == 0 && checkIfPrime(factor)){
                    factorsFound++;
                    numberCurrentlyWorkingOn = numberCurrentlyWorkingOn/factor;
                    factor = 1;
                    if(numberCurrentlyWorkingOn == 1){
                        if(factorsFound == primeFactors){
                            listOfResult.add(i);
                        }
                    }
                }
            }
        }
        long[] resultTab = new long[listOfResult.size()];
        for (int i = 0; i < listOfResult.size(); i++) {
            resultTab[i] = listOfResult.get(i);
        }
        return resultTab;
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
