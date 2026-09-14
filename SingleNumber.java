import java.util.Arrays;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        int ans = 0;

        for (int val : nums) {
            ans = ans ^ val;
        }

        return ans;
    }

    public static void main(String[] args) {

        SingleNumber obj = new SingleNumber();

        int[] nums = {4, 1, 2, 1, 2};

        int result = obj.singleNumber(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Single Number: " + result);
    }
}
