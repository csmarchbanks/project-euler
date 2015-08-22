import java.util.function.LongPredicate;
import java.util.stream.LongStream;

/**
 * Created by cmarchbanks on 8/21/15.
 */
public class Problem3 {
    public static boolean isPrime(long n){
        return n > 1 && LongStream.range(2, Double.valueOf(Math.sqrt(n)).intValue() + 1)
                .noneMatch(isDivisorOf(n));
    }

    public static LongPredicate isDivisorOf(long n){
        return i ->  n % i == 0;
    }

    public static void main(String[] args) {
        long n = 600851475143L;
        long value = LongStream.range(2, Double.valueOf(Math.sqrt(n)).intValue() + 1)
                .filter(isDivisorOf(n))
                .filter(Problem3::isPrime)
                .max()
                .getAsLong();
        System.out.println(value);
    }
}
