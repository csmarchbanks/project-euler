package utilities;

import java.util.List;
import java.util.function.LongPredicate;
import java.util.stream.LongStream;

/**
 * Created by cmarchbanks on 8/22/15.
 */
public class LongUtils {
    public static double pythag(long a, long b){
        return Math.sqrt(a*a + b*b);
    }

    public static long charToLong(char c){
        if('0' <= c && c <= '9') {
            return c - '0';
        } else {
            throw new IllegalArgumentException("Character: " + c + " cannot be converted to a number");
        }
    }

    public static LongPredicate isDivisorOf(long n){
        return i ->  n % i == 0;
    }

    public static boolean isPrime(long n){
        return n > 1 && LongStream.range(2, Double.valueOf(Math.sqrt(n)).intValue() + 1)
                .noneMatch(isDivisorOf(n));
    }

    public static Long square(long n){
        return n*n;
    }

    public static boolean isPalindrome(Integer n) {
        return StringUtils.isPalindrome(n.toString());
    }
}
