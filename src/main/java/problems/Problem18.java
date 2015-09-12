package problems;

import utilities.FileUtilities;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by cmarchbanks on 9/11/15.
 */
public class Problem18 {
    private static Integer get(List<List<Integer>> triangle, int row, int col){
        if(row < 0 || col < 0 || row >= triangle.size() || col >= triangle.get(row).size()){
            return 0;
        }
        return triangle.get(row).get(col);
    }

    private static int getMaxAbove(List<List<Integer>> triangle, int row, int col){
        Integer value1 = get(triangle, row - 1, col);
        Integer value2 = get(triangle, row - 1, col - 1);
        return value1 > value2 ? value1 : value2;
    }

    /**
     * Go through the triangle, finding the maximum of the two possible above points entries
     * and adding to the current value
     * @param triangle
     * @return
     */
    public static int getMaxPath(List<List<Integer>> triangle){
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> row = triangle.get(i);
            for(int j = 0; j< row.size(); j++){
                Integer value = row.get(j);
                row.set(j, value + getMaxAbove(triangle, i, j));
            }
        }
        return triangle.get(triangle.size() - 1).stream()
                .max(Integer::compareTo)
                .get();
    }

    public static void main(String[] args) throws FileNotFoundException, URISyntaxException {
        List<List<Integer>> triangle = FileUtilities.loadNestedList("problem18.txt");
        System.out.println(getMaxPath(triangle));
    }
}
