package problems;

import static utilities.LongUtils.pythag;

/**
 * Created by cmarchbanks on 8/27/15.
 */
public class Problem9 {

    public static void main(String[] args) {
        for(long a = 1; a<1000; a++){
            long numerator = 500000 - 1000 * a;
            long denominator = 1000 - a;
            if(numerator % denominator == 0) {
                long b = (500000 - 1000 * a) / (1000 - a);
                if(b > a && b < 1000){
                    long c = Double.valueOf(pythag(a, b)).longValue();
                    System.out.println(a * b * c);
                    break;
                }
            }
        }
    }
}
