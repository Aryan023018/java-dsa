public class PalindromeLinkedList {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        // Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse the second half
        ListNode secondHalf = reverseList(slow);

        // Compare first half and reversed second half
        ListNode firstHalf = head;
        ListNode current = secondHalf;

        while (current != null) {

            if (firstHalf.val != current.val) {
                return false;
            }

            firstHalf = firstHalf.next;
            current = current.next;
        }

        return true;
    }

    private ListNode reverseList(ListNode head) {

        ListNode previous = null;
        ListNode current = head;

        while (current != null) {

            ListNode nextNode = current.next;

            current.next = previous;

            previous = current;
            current = nextNode;
        }

        return previous;
    }

    public static void main(String[] args) {

        PalindromeLinkedList obj = new PalindromeLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean result = obj.isPalindrome(head);

        System.out.println("Is Linked List a Palindrome: " + result);
    }
}
