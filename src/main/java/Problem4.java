import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by cmarchbanks on 8/21/15.
 */
public class Problem4 {
    public static boolean isPalindrome(String string) {
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(Integer n) {
//        System.out.println(n);
        return isPalindrome(n.toString());
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Integer value = IntStream.range(1, 1000)
                .parallel()
                .map(i -> IntStream.range(1, 1000)
                                .map(j -> j * i)
                                .filter(Problem4::isPalindrome)
                                .max()
                                .orElse(0) // if no value return 0 since we are looking for a maximum
                ).max().getAsInt();
        long endTime = System.currentTimeMillis();
        System.out.println(value);
        System.out.println("Calculation completed in: " + (endTime - startTime) + " ms");
    }
}
