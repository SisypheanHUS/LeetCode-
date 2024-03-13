public class question707 {

    Node head;
    int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public int get(int index) {
        if (index >= length) return -1;
        int count = 0;
        Node temp = head;
        while (count < index) {
            count++;
            temp = temp.next;
        }
        return temp.value;
    }

    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        length++;
    }

    public void addAtTail(int val) {
        if (head == null) {
            addAtHead(val);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node newTail = new Node(val);
            temp.next = newTail;
            length++;
        }
    }

    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;
        }
        if (index == 0) addAtHead(val);
        else {
            int count = 0;
            Node temp = head;
            while (count < index - 1) {
                temp = temp.next;
                count++;
            }
            Node newNode = new Node(val);
            Node next = temp.next;
            temp.next = newNode;
            newNode.next = next;
            length++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= length) return;
        if (index == 0) {
            head = head.next;
            length--;
        } else {
            int count = 0;
            Node temp = head;
            while (count < index - 1) {
                count++;
                temp = temp.next;
            }
            temp.next = temp.next.next;
            length--;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
