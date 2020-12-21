package ProjectEuler;

public class Problem14 {

    /*
    The following iterative sequence is defined for the set of positive integers:

    n → n/2 (n is even)
    n → 3n + 1 (n is odd)

    Using the rule above and starting with 13, we generate the following sequence:
    13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

    It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

    Which starting number, under one million, produces the longest chain?

    NOTE: Once the chain starts the terms are allowed to go above one million.
    */

    public static void main(String[] args) {

        System.out.println(giveLongestChain(1000000));

    }

    public static int giveLongestChain(int roof){
        int highestValue = 0;
        int chain = 1;
        int highestChain = 1;
        long numberCurrentlyWorkingOn = 0;
        for (int i = 1; i < roof; i++) {
            chain = 1;
            numberCurrentlyWorkingOn = i;
            while(numberCurrentlyWorkingOn != 1){
                if(numberCurrentlyWorkingOn % 2 == 0){
                    numberCurrentlyWorkingOn = numberCurrentlyWorkingOn/2;
                    chain++;
                } else {
                    numberCurrentlyWorkingOn = 3 * numberCurrentlyWorkingOn + 1;
                    chain++;
                }
            }
            if(chain > highestChain){
                highestChain = chain;
                highestValue = i;
            }
        }
        return highestValue;
    }
}