
/**
Find the thirteen adjacent digits in the 
1000-digit number that have the greatest product. 
What is the value of this product?
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem8 {

    Integer[] series = new Integer[1000];

    public Problem8() {

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("longInt.txt"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        int i;
        int index = 0;
        try {
            while ((i=br.read()) != -1) {

                i = Character.getNumericValue(i);
                if (i == -1) continue;
                series[index] = i;
                index++;

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public long seriesProduct(int productNum) {

        long largestSoFar = 0;
        int index = 0;
        while (index < 1000 - productNum) {
            long product = 1;
            for (int i=index;i<index+productNum;i++)  {
                product *= series[i];
                System.out.print(series[i]);
            }
            largestSoFar = (product > largestSoFar) ? product : largestSoFar;
            index++;
            System.out.println("\t"+product);
        }
    return largestSoFar;
    }
}
