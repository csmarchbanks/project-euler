package problems;

/**
 * Created by cmarchbanks on 9/10/15.
 */
public class Problem15 {
    /**
     * The idea for this problem is that we start at the end (bottom right is the
     * same as top left if we go up/left instead of down/right), and the number of
     * possible paths is equal to the number of possible paths of either going left
     * or up (again, working backwards).
     *
     * This can also be solved simply by doing n choose k: 40!/(20! * 20!)
     *
     * @param args
     */
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int n = 20;
        // table has n length -> n + 1 vertices
        long[][] table = new long[n + 1][n + 1];
        // starter value, only one possibility if we start at the end
        table[0][0] = 1;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == 0 && j == 0) continue;
                long left = j - 1 >= 0 ? table[i][j - 1] : 0L;
                long up = i - 1 >= 0 ? table[i - 1][j] : 0L;

                table[i][j] = left + up;
            }
        }
        System.out.println(table[n][n]);
        long endTime = System.nanoTime();
        System.out.println("Finished computation in: " + (endTime - startTime)/1000000f + " ms");
    }
}
