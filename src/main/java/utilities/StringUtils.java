package utilities;

/**
 * Created by cmarchbanks on 8/22/15.
 */
public class StringUtils {

    public static boolean isPalindrome(String string) {
        char[] array = string.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
