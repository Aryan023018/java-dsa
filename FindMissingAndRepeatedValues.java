import java.util.HashSet;
import java.util.Arrays;

public class FindMissingAndRepeatedValues {

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;

        HashSet<Integer> set = new HashSet<>();

        int repeated = 0;
        long actualSum = 0;

        // Find repeated value and calculate actual sum
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                int value = grid[i][j];

                actualSum += value;

                if (set.contains(value)) {
                    repeated = value;
                } else {
                    set.add(value);
                }
            }
        }

        // Numbers should be from 1 to n*n
        long totalNumbers = (long) n * n;

        // Expected sum = n(n+1)/2
        long expectedSum =
                totalNumbers * (totalNumbers + 1) / 2;

        // Missing = expectedSum + repeated - actualSum
        int missing =
                (int) (expectedSum + repeated - actualSum);

        return new int[]{repeated, missing};
    }

    public static void main(String[] args) {

        FindMissingAndRepeatedValues obj =
                new FindMissingAndRepeatedValues();

        int[][] grid = {
            {1, 2},
            {2, 4}
        };

        int[] result =
                obj.findMissingAndRepeatedValues(grid);

        System.out.println(Arrays.toString(result));
    }
}
