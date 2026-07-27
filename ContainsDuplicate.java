import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {

        ContainsDuplicate s = new ContainsDuplicate();

        int[] nums = {1, 2, 3, 4, 5, 1};

        System.out.println(s.containsDuplicate(nums));
    }
}
