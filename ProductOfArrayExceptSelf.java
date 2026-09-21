import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        Arrays.fill(ans, 1);

        // Prefix
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int suffix = 1;

        // Suffix
        for (int i = n - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            ans[i] *= suffix;
        }

        return ans;
    }

    public static void main(String[] args) {

        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();

        int[] nums = {1, 2, 3, 4};

        int[] result = obj.productExceptSelf(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(result));
    }
}
