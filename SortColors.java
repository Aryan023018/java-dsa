import java.util.Arrays;

public class SortColors {

    public void sortColors(int[] nums) {

        int n = nums.length;

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count 0, 1 and 2
        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                count0++;
            } 
            else if (nums[i] == 1) {
                count1++;
            } 
            else {
                count2++;
            }
        }

        // Put 0s
        int idx = 0;

        for (int i = 0; i < count0; i++) {
            nums[idx++] = 0;
        }

        // Put 1s
        for (int i = 0; i < count1; i++) {
            nums[idx++] = 1;
        }

        // Put 2s
        for (int i = 0; i < count2; i++) {
            nums[idx++] = 2;
        }
    }

    public static void main(String[] args) {

        SortColors obj = new SortColors();

        int[] nums = {2, 0, 2, 1, 1, 0};

        obj.sortColors(nums);

        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
}
