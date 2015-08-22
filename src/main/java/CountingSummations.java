import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmarchbanks on 7/23/15.
 * <p>
 * Solution for problem 75, Counting summations
 * <p>
 * It is possible to write five as a sum in exactly six different ways:
 * <p>

 * <p>
 *     n=2
 *   *  1+1
 *
 *     n=3
 *   *  2 + 1
 *     1 + 1 + 1
 *
 *     n=4
 *  *   3+1
 *  *   2+2
 *     2+1+1
 *     1+1+1+1
 *
 *      n=5
 *   *   4 + 1                  1 = n(1) + 1
 *   *   3 + 2                  2 = n(2) + 1
 *      3 + 1 + 1
 *      2 + 2 + 1               3 = n(3) + 1
 *      2 + 1 + 1 + 1
 *      1 + 1 + 1 + 1 + 1
 *
 *     n=6
 *   *  5+1
 *   *  4+2
 *     4+1+1
 *   *  3+3
 *     3+2+1
 *     3+1+1
 *   *  2+2+2
 *     2+2+1+1
 *     2+1+1+1+1
 *     1+1+1+1+1+1
 *
 *     n=7
 *  *   6+1
 *  *   5+2
 *     5+1+1
 *  *   4+3
 *     4+2+1
 *     4+1+1+1
 *  *   3+3+1
 *  *   3+2+2
 *     3+2+1+1
 *     3+1+1+1+1
 *     2+2+2+1
 *     2+2+1+1+1
 *     2+1+1+1+1+1
 *     1+1+1+1+1+1+1
 *
 *     n=8
 *   *  7+1
 *   *  6+2
 *     6+1+1
 *   *  5+3
 *     5+2+1
 *     5+1+1+1
 *   *  4+4
 *     4+3+1
 *     4+2+1+1
 *     4+1+1+1+1
 *   *  3+3+2
 *     3+3+1+1
 *     3+2+2+1
 *     3+2+1+1+1
 *     3+1+1+1+1+1
 *     2+2+2+2
 *
 * How many different ways can one hundred be written as a sum of at least two positive integers?
 */
public class CountingSummations {

    private static int nSums(int n){
        int[] array = new int[n];

        // i goes across the numbers that can be summed, 1 to n-1
        for(int i=1;i<=n-1;i++){
            // j goes across buckets
            for(int j=i;j<=n;j++){
                if(0 == array[j-1]){
                    array[j-1]++;
                } else if (j - i > 0){
                    array[j-1] += array[j - i - 1];
                } else {
                    array[j-1]++;
                }
            }
        }
        return array[n-1];
    }

    private static void testNSums(int n, int expectedResult){
        System.out.println("n" + n + ": " + nSums(n) + " expected: " + expectedResult);
        //assert nSums(n)==expectedResult;
    }

    public static void main(String[] args) {
        testNSums(5,6);
        testNSums(6,10);
        testNSums(7, 14);

        System.out.println(nSums(100));
    }

}
