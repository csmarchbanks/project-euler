package problems;

import java.util.stream.LongStream;

/**
 * Created by cmarchbanks on 8/21/15.
 */
public class Problem5 {
    private static long value = 40;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        while(true){
            if(LongStream.rangeClosed(1, 20)
                    .allMatch(i -> value % i == 0)){
                break;
            }
            value += 20;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(value);
        System.out.println("Calculation completed in: " + (endTime - startTime) + " ms");
    }
}
