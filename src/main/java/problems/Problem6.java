package problems;

import java.util.stream.LongStream;

/**
 * Created by cmarchbanks on 8/21/15.
 */
public class Problem6 {
    public static Long square(long n){
        return n*n;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long sum = LongStream.rangeClosed(1,100)
                .sum();

        long sumOfSquares = LongStream.rangeClosed(1, 100)
                .map(Problem6::square)
                .sum();
        long endTime = System.currentTimeMillis();
        System.out.println(sum*sum - sumOfSquares);
        System.out.println("Calculation completed in: " + (endTime - startTime) + " ms");
    }
}
