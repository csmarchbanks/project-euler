package problems;

import utilities.FileUtilities;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * Created by cmarchbanks on 8/27/15.
 */
public class Problem11 {
    private static Integer getInteger(List<List<Integer>> array, int row, int col){
        if(row < 0 || col < 0 || row >= array.size() || col >= array.get(row).size()) {
            return 0;
        }
        return array.get(row).get(col);
    }

    public static long getVerticalProduct(List<List<Integer>> array, int row, int col, int length){
        long product = getInteger(array, row, col);
        for(int i=1; i<length; i++){
            product *= getInteger(array, row + i, col);
        }
        return product;
    }

    public static long getHorizontalProduct(List<List<Integer>> array, int row, int col, int length){
        long product = getInteger(array, row, col);
        for(int i=1; i<length; i++){
            product *= getInteger(array, row, col + i);
        }
        return product;
    }

    public static long getDiagonalProduct(List<List<Integer>> array, int row, int col, int length){
        long product = getInteger(array, row, col);
        for(int i=1; i<length; i++){
            product *= getInteger(array, row + i, col + i);
        }
        return product;
    }

    public static long getNegativeDiagonalProduct(List<List<Integer>> array, int row, int col, int length){
        long product = getInteger(array, row, col);
        for(int i=1; i<length; i++){
            product *= getInteger(array, row + i, col - i);
        }
        return product;
    }

    public static long findLargestProduct(List<List<Integer>> array, int length){
        long largestProduct = Integer.MIN_VALUE;
        String largestInfo = "";
        for(int i = 0; i < array.size(); i++){
            for(int j = 0; j < array.get(i).size(); j++){
                long vertical = getVerticalProduct(array, i, j, length);
                long horizontal = getHorizontalProduct(array, i, j, length);
                long diagonal = getDiagonalProduct(array, i, j, length);
                long negativeDiagonal = getNegativeDiagonalProduct(array, i, j, length);

                if(vertical > largestProduct){
                    largestProduct = vertical;
                }
                if(horizontal > largestProduct){
                    largestProduct = horizontal;
                }
                if(diagonal > largestProduct){
                    largestProduct = diagonal;
                }
                if(negativeDiagonal > largestProduct){
                    largestProduct = negativeDiagonal;
                }
            }
        }
        System.out.println(largestInfo);
        return largestProduct;
    }

    public static void main(String[] args) {
        try {
            List<List<Integer>> array = FileUtilities.loadNestedList("problem11.txt");
            System.out.println(findLargestProduct(array, 4));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }
}
