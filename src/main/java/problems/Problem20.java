package problems;

import static utilities.BigIntegerUtils.factorial;
import static utilities.BigIntegerUtils.sumOfDigits;

/**
 * Created by cmarchbanks on 9/11/15.
 */
public class Problem20 {
    public static void main(String[] args) {
        Integer n = 100;
        System.out.println(sumOfDigits(factorial(n)));
    }
}
