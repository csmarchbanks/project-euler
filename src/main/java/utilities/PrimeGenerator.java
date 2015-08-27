package utilities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmarchbanks on 8/27/15.
 */
public class PrimeGenerator {
    List<Long> primes = new ArrayList<>();

    private boolean isPrime(long n){
        for(int i=0; i<primes.size(); i++){
            long prime = primes.get(i);
            if(n%prime ==0){
                return false;
            }
            if(Math.sqrt(n) <= prime ){
                break;
            }
        }
        return true;
    }

    public List<Long> generatePrimes(long maxPrime){
        primes.add(2L);
        for(long i = 3; i<maxPrime; i+=2){
            if(isPrime(i)){
                primes.add(i);
            }
        }
        return primes;
    }
}
