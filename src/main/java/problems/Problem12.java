package problems;


import static utilities.Divisors.getDivisors;

/**
 * Created by cmarchbanks on 8/27/15.
 */
public class Problem12 {
    public static void main(String[] args) {
        long naturalSum = 1;
        for(long i = 1;;i++, naturalSum+=i){
            if(getDivisors(naturalSum).size() > 500){
                System.out.println(naturalSum);
                break;
            }
        }
    }
}
