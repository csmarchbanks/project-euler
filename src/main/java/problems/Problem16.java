package problems;

import java.math.BigInteger;

/**
 * Created by cmarchbanks on 9/10/15.
 */
public class Problem16 {
    public static void main(String[] args) {
        BigInteger num = new BigInteger("2");
        num = num.pow(1000);
        long sum = 0;
        char[] chars = num.toString().toCharArray();
        for (char aChar : chars) {
            sum += aChar - '0';
        }
        System.out.println(sum);
    }
}
