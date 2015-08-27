package utilities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by cmarchbanks on 8/27/15.
 */
public class PrimeGenerator {
    List<Long> primes = new ArrayList<>();
    Set<Long> primesSet = new HashSet<>();

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

    public boolean isPrime(Long n){
        if(n > getLargestCachedPrime()){
            generatePrimes(n + 1);
        }
        return primesSet.contains(n);
    }

    private void addPrime(Long prime){
        if(!primesSet.contains(prime)) {
            primes.add(prime);
            primesSet.add(prime);
        }
    }

    public long getLargestCachedPrime(){
        return primes.get(primes.size() - 1);
    }

    public List<Long> generatePrimes(long maxPrime){
        long i;
        if(primes.isEmpty()){
            addPrime(2L);
            i = 3;
        } else {
            i = getLargestCachedPrime();
            if(getLargestCachedPrime() % 2 == 0){
                i++;
            } else {
                i+=2;
            }
        }

        for(; i<maxPrime; i+=2){
            if(isPrime(i)){
                primes.add(i);
                primesSet.add(i);
            }
        }
        return primes;
    }
}
