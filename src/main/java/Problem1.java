/**
 * Created by cmarchbanks on 8/21/15.
 */
public class Problem1 {

    public static long sumMultiples5and3(long max){
        long count = 0;
        for (long i = 3; i < max ; i++) {
            if(i%5 == 0 || i%3 == 0){
                count += i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(sumMultiples5and3(1000));
    }
}
