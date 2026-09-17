import java.util.Arrays;

public class ThreeSum {

    public int[][] threeSum(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        // Maximum possible number of triplets is n^2,
        // so we use a dynamic list instead.
        java.util.ArrayList<int[]> result = new java.util.ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // If the smallest number is positive,
            // sum cannot become 0.
            if (nums[i] > 0) {
                break;
            }

            int lp = i + 1;
            int rp = n - 1;

            while (lp < rp) {

                int sum = nums[i] + nums[lp] + nums[rp];

                if (sum == 0) {

                    result.add(new int[]{
                        nums[i],
                        nums[lp],
                        nums[rp]
                    });

                    lp++;
                    rp--;

                    // Skip duplicate left values
                    while (lp < rp && nums[lp] == nums[lp - 1]) {
                        lp++;
                    }

                    // Skip duplicate right values
                    while (lp < rp && nums[rp] == nums[rp + 1]) {
                        rp--;
                    }

                }
                else if (sum < 0) {
                    lp++;
                }
                else {
                    rp--;
                }
            }
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        ThreeSum obj = new ThreeSum();

        int[] nums = {-1, 0, 1, 2, -1, -4};

        int[][] result = obj.threeSum(nums);

        System.out.println("Input: " + Arrays.toString(nums));

        System.out.println("Output:");

        for (int[] triplet : result) {
            System.out.println(Arrays.toString(triplet));
        }
    }
}
