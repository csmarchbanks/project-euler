package problems;

import utilities.FileUtilities;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.List;

import static problems.Problem18.getMaxPath;

/**
 * Created by cmarchbanks on 9/11/15.
 */
public class Problem67 {
    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        List<List<Integer>> triangle = FileUtilities.loadNestedList("problem67.txt");
        System.out.println(getMaxPath(triangle));
    }
}
