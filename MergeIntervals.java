import java.util.*;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();

        for (int[] interval : intervals) {

            if (ans.isEmpty() || interval[0] > ans.get(ans.size() - 1)[1]) {

                ans.add(new int[]{interval[0], interval[1]});

            } else {

                int[] last = ans.get(ans.size() - 1);

                last[1] = Math.max(last[1], interval[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {

        MergeIntervals obj = new MergeIntervals();

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        int[][] result = obj.merge(intervals);

        System.out.println("Merged Intervals:");

        for (int[] interval : result) {
            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}
