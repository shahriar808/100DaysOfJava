package Java100;

public class RightShiftLinkedList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode tail = head;
        int size = 1;
        while (tail.next != null) {
            size++;
            tail = tail.next;
        }
        k %= size;
        if (k == 0) {
            return head;
        }
        tail.next = head;
        int stepsToNewTail = size - k;
        ListNode rotatedListTail = tail;
        while (stepsToNewTail > 0) {
            rotatedListTail = rotatedListTail.next;
            stepsToNewTail--;
        }
        ListNode rotatedListHead = rotatedListTail.next;
        rotatedListTail.next = null;
        return rotatedListHead;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RightShiftLinkedList solution = new RightShiftLinkedList();
        ListNode rotatedListHead = solution.rotateRight(head, 2);
        while (rotatedListHead != null) {
            System.out.print(rotatedListHead.val + " -> ");
            rotatedListHead = rotatedListHead.next;
        }
        System.out.print("null");
    }
}
