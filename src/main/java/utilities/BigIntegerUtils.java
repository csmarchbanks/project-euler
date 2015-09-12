package utilities;

import java.math.BigInteger;

/**
 * Created by cmarchbanks on 9/11/15.
 */
public class BigIntegerUtils {
    public static BigInteger factorial(Integer n){
        BigInteger value = new BigInteger(n.toString());
        for(; n > 0; n--){
            value = value.multiply(new BigInteger(n.toString()));
        }
        return value;
    }

    public static long sumOfDigits(BigInteger value){
        char[] array = value.toString().toCharArray();
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] - '0';
        }
        return sum;
    }
}
