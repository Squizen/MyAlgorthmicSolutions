package ProjectEuler;

public class Problem5 {

    /*

    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    */

    public static void main(String[] args) {

        System.out.println(findSmallestNumber(1, 10));
        System.out.println(findSmallestNumber(1, 20));

    }

    public static long findSmallestNumber(int bottomOfRange, int topOfRange){

        if(bottomOfRange <= 0 || topOfRange <= 0){
            return -1;
        } else if (bottomOfRange > topOfRange){
            return -1;
        } else {
            boolean isDividableByAllInRange = true;
            int smallestNumber = topOfRange;
            do{
                for (int divider = bottomOfRange; divider <= topOfRange ; divider++) {
                    if(smallestNumber % divider == 0){
                        isDividableByAllInRange = true;
                    } else {
                        isDividableByAllInRange = false;
                        smallestNumber++;
                        break;
                    }
                }
            }while(!isDividableByAllInRange);
            return smallestNumber;
        }
    }
}
