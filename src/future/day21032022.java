package future;

public class day21032022 {
    public static void main(String[] args) {
        // Step 2: Create a ListNode object for each value in the linked list
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        ListNode node5 = new ListNode(5);

        // Step 3: Link the ListNode objects together to form a linked list
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // Step 4: Call the reverseList method with the head of the linked list as the argument
        ListNode reversedHead = reverseList(node1);

        // Print the reversed linked list
        ListNode current = reversedHead;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        while( current != null && current.next != null ){
            ListNode next = current.next;
            current.next = next.next;
            next.next = head; //check thiss
            head = next;
        }
        return head;
    }
}