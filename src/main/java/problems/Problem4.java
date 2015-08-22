package problems;

import utilities.LongUtils;

import java.util.stream.IntStream;

/**
 * Created by cmarchbanks on 8/21/15.
 */
public class Problem4 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Integer value = IntStream.range(1, 1000)
                .parallel()
                .map(i -> IntStream.range(1, 1000)
                                .map(j -> j * i)
                                .filter(LongUtils::isPalindrome)
                                .max()
                                .orElse(0) // if no value return 0 since we are looking for a maximum
                ).max().getAsInt();
        long endTime = System.currentTimeMillis();
        System.out.println(value);
        System.out.println("Calculation completed in: " + (endTime - startTime) + " ms");
    }
}
