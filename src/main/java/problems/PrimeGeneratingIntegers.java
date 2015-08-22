package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by cmarchbanks on 7/24/15.
 */
public class PrimeGeneratingIntegers {
    private static Set<Integer> primes = new HashSet<Integer>();
    private static Integer maxPrime = 1;


    private static boolean isPrime(Integer n){
        if(n==1){
            return false;
        }

        if(false && n<= maxPrime && primes.contains(n)){
            return true;
        } else if (n<= maxPrime) {
            return false;
        } else {
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i == 0){
                    return false;
                }
            }
            maxPrime = n;
            primes.add(n);
            return true;
        }
    }

    private static boolean areDivisorsPrime(Integer n){
        for(int i = 1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                if(!isPrime(i + n/i)){
                    return false;
                }
            }
        }
        return true;
    }

    private static void generatePrimes(Integer n){
        for(int i=2;i<=n;i++){
            isPrime(i);
            if(i % 100000 == 0){
                System.out.println(i + " : " + primes.size());
            }
        }
    }


    public static void main(String[] args) {

        long sum = 0;
        for(int i = 5;i<=100000000;i++){
            if(isPrime(i)){
                if(areDivisorsPrime(i-1)){
                    sum += i;
                }
            }

            if(i % 100000 == 0){
                System.out.println(i);
            }
        }
        System.out.println(sum+2);

    }
}
