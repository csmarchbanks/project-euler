package problems;

import utilities.FileUtilities;

import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Driver function for adding 100 big integers
 * Created by Chris on 9/6/2015.
 */
public class Problem13 {

    public static void main(String[] args) {
        try {
            List<BigInteger> list = FileUtilities.loadBigIntegers("problem13.txt");
            BigInteger sum = new BigInteger("0");
            for (BigInteger value : list) {
                sum = sum.add(value);
            }
            System.out.println(sum.toString().substring(0, 10));
        } catch (FileNotFoundException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
