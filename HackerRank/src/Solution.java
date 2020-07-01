package src;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.IntStream;



class Result {

    /*
     * Complete the 'getSubsets' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER n
     *  3. INTEGER_ARRAY arr
     */

    public static int getSubsets(int k, int n, List<Integer> arr) {
    	int sum = 0;
    	for (int i = 0; i < arr.size(); i++) {
			for (int j = 2; j < arr.get(i); j++) {
				int temp = arr.get(i);
				while(temp%j == 0){
					sum += j;
					temp = temp/2;
				}
			}
		}
    	return sum+1;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.getSubsets(k, n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
