public class FindTheDuplicateNumber {

    public int findDuplicate(int[] arr) {

        int slow = arr[0];
        int fast = arr[0];

        // Phase 1: Find intersection
        do {
            slow = arr[slow];          // +1
            fast = arr[arr[fast]];     // +2
        } while (slow != fast);

        // Phase 2: Find entrance of cycle
        slow = arr[0];

        while (slow != fast) {
            slow = arr[slow];          // +1
            fast = arr[fast];          // +1
        }

        return slow;
    }

    public static void main(String[] args) {

        FindTheDuplicateNumber obj = new FindTheDuplicateNumber();

        int[] arr = {1, 3, 4, 2, 2};

        int result = obj.findDuplicate(arr);

        System.out.println("Duplicate Number: " + result);
    }
}
