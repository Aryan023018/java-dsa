import java.util.Arrays;

public class SearchA2DMatrix {

    public boolean searchInRow(int[][] mat, int target, int row) {

        int n = mat[0].length;

        int st = 0;
        int end = n - 1;

        while (st <= end) {

            int mid = st + (end - st) / 2;

            if (target == mat[row][mid]) {
                return true;
            }
            else if (target > mat[row][mid]) {
                st = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return false;
    }

    public boolean searchMatrix(int[][] mat, int target) {

        int m = mat.length;
        int n = mat[0].length;

        int startRow = 0;
        int endRow = m - 1;

        while (startRow <= endRow) {

            int midRow = startRow + (endRow - startRow) / 2;

            if (target >= mat[midRow][0]
                    && target <= mat[midRow][n - 1]) {

                return searchInRow(mat, target, midRow);
            }
            else if (target > mat[midRow][n - 1]) {

                startRow = midRow + 1;
            }
            else {

                endRow = midRow - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        SearchA2DMatrix obj = new SearchA2DMatrix();

        int[][] mat = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target = 3;

        boolean result = obj.searchMatrix(mat, target);

        System.out.println("Matrix:");

        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println("Target: " + target);
        System.out.println("Found: " + result);
    }
}
