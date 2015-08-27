package utilities;

import java.util.*;

/**
 * Created by cmarchbanks on 8/27/15.
 */
public class Divisors {
    private static PrimeGenerator primeGenerator = new PrimeGenerator();

    private static Map<Long, Set<Long>> divisorMap = new HashMap<>();

    public static Set<Long> getDivisors(long num){
        if(divisorMap.containsKey(num)){
            return divisorMap.get(num);
        }

        List<Long> primes = primeGenerator.generatePrimes(Double.valueOf(Math.sqrt(num)).longValue() + 1);
        Set<Long> divisors = new HashSet<>();
        divisors.add(1L);
        divisors.add(num);
        for(Long prime: primes){
            if(num%prime == 0){
                divisors.addAll(getDivisors(num / prime));
            }

            if(prime >= Math.sqrt(num)){
                break;
            }
        }
        divisorMap.put(num, divisors);
        return divisors;
    }
}
