package ProjectEuler;

public class Problem7 {

    /*
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

    What is the 10 001st prime number?

    */
    public static void main(String[] args) {

        System.out.println(findNthPrime(6));
        System.out.println(findNthPrime(10001));

    }
    public static long findNthPrime(int nthPlace){
        if(nthPlace <= 0){
            return 0;
        } else {
            int number = 1;
            for (int i = 1; i <= nthPlace; i++) {
                do{
                    number++;
                }while(!checkIfPrime(number));
            }
            return number;
        }
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