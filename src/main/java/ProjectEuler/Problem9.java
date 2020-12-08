package ProjectEuler;

public class Problem9 {

    /*
    A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

    a^2 + b^2 = c^2

    For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

    There exists exactly one Pythagorean triplet for which a + b + c = 1000.
    Find the product abc.

    */

    public static void main(String[] args) {

        System.out.println(findPythagoreanTriplet(12));
        System.out.println(findPythagoreanTriplet(1000));

    }
    public static long findPythagoreanTriplet(int circuit){
        if(circuit >= 0){
            for (int a = 1; a < circuit; a++) {
                for (int b = a+1; b < circuit; b++) {
                    for (int c = b+1; c < circuit; c++) {
                        if(Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2)) {
                            if (a + b + c == circuit) {
                                System.out.println("A = " + a);
                                System.out.println("B = " + b);
                                System.out.println("C = " + c);
                                return a * b * c;
                            }
                        } else if (Math.pow(a,2) + Math.pow(b,2) < Math.pow(c,2)){
                            break;
                        }
                    }
                }
            }
        }
        return -1;
    }
}
