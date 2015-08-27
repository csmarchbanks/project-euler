package problems;

import utilities.PrimeGenerator;

/**
 * Created by cmarchbanks on 8/27/15.
 */
public class Problem10 {
    public static void main(String[] args) {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        long sum = 0;
        for(Long prime : primeGenerator.generatePrimes(2000000)){
            sum += prime;
        }
        System.out.println(sum);
    }
}
