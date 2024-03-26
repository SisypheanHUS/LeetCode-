package future;

public class questionxx {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = findLength(head);
        int i = 0, rmv = length - n - 1;
        if (rmv == -1) return head.next;
        ListNode curr = head;
        while (i < rmv) {
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }

    public int findLength(ListNode head) {
        int count = 0;
        if (head == null) return count;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }
}
