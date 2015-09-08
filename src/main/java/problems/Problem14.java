package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Class finding the number under 1,000,000 with the longest Collatz sequence
 *
 * Created by cmarchbanks on 9/7/15.
 */
public class Problem14 {

    private static Map<Long, Integer> termCache = new HashMap<>();

    public static int collatzTerms(long n){
        int count = 1;
        long originalN = n;
        while(n != 1 && !termCache.containsKey(n)){
            if(n%2 == 0){
                n/=2;
            } else {
                n = 3*n + 1;
            }
            count++;
        }
        termCache.put(originalN, count);
        if(n != 1){
            count += termCache.get(n);
        }
        return count;
    }

    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int value = 0;
        for(int n = 1; n < 1_000_000; n++){
            int terms = collatzTerms(n);
            if(terms > max){
                max = terms;
                value = n;
            }
        }
        System.out.println(value);
    }
}
