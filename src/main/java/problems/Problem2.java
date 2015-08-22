package problems;

/**
 * Created by cmarchbanks on 8/21/15.
 */
public class Problem2 {
    public static void main(String[] args) {
        long max = 4000000;
        long n1 = 1;
        long n2 = 1;
        long currentFib;
        long sum = 0;

        while((currentFib = n1 + n2) <= max){
            if(currentFib % 2 == 0){
                sum += currentFib;
            }
            n1 = n2;
            n2 = currentFib;
        }

        System.out.println(sum);
    }

}
