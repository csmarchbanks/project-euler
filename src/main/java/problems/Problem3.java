package problems;

import utilities.LongUtils;

import java.util.stream.LongStream;

/**
 * Created by cmarchbanks on 8/21/15.
 */
public class Problem3 {

    public static void main(String[] args) {
        long n = 600851475143L;
        long value = LongStream.range(2, Double.valueOf(Math.sqrt(n)).intValue() + 1)
                .filter(LongUtils.isDivisorOf(n))
                .filter(LongUtils::isPrime)
                .max()
                .getAsLong();
        System.out.println(value);
    }
}
