package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by cmarchbanks on 8/27/15.
 */
public class FileUtilities {
    public static List<List<Integer>> loadNestedList(String filename) throws FileNotFoundException, URISyntaxException {
        Scanner testArrayScanner = new Scanner(new File(ClassLoader.getSystemResource(filename).toURI()));
        List<List<Integer>> outerList = new ArrayList<>();
        while(testArrayScanner.hasNextLine()){
            String line = testArrayScanner.nextLine();
            Scanner innerScanner = new Scanner(line);
            List<Integer> innerList = new ArrayList<>();
            outerList.add(innerList);
            while(innerScanner.hasNextInt()){
                innerList.add(innerScanner.nextInt());
            }
        }
        return outerList;
    }
}
