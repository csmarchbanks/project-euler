package problems;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by cmarchbanks on 8/21/15.
 */
public class Problem7 {
    private static Set<Long> primes = new LinkedHashSet<>();

    private static boolean isPrime(long n){
        if(n == 1) return false;
        if(primes.contains(n)) return true;

        if(n == 2){
            primes.add(2L);
            return true;
        } else {
            boolean isPrime = !primes.stream().anyMatch(i -> n%i == 0);
            if(isPrime){
                primes.add(n);
            }
            return isPrime;
        }
    }

    public static void main(String[] args) {
        long n = 2;
        while(primes.size() < 10_001){
            isPrime(n++);
        }
        System.out.println(primes.stream().max(Long::compareTo).get());
    }
}
