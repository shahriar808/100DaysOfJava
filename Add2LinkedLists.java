package Java100;

public class Add2LinkedLists {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        ListNode dummyHead = new ListNode(0);
        ListNode newListBuildPtr = dummyHead;
        int carry = 0;
        while (ptr1 != null || ptr2 != null) {
            int first = (ptr1 != null) ? ptr1.val : 0;
            int second = (ptr2 != null) ? ptr2.val : 0;
            int sum = carry + first + second;
            carry = sum / 10;
            newListBuildPtr.next = new ListNode(sum % 10);
            if (ptr1 != null) {
                ptr1 = ptr1.next;
            }
            if (ptr2 != null) {
                ptr2 = ptr2.next;
            }
            newListBuildPtr = newListBuildPtr.next;
        }
        if (carry > 0) {
            newListBuildPtr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(5);
        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(2);
        Add2LinkedLists a1 =new Add2LinkedLists();
        ListNode sum = a1.addTwoNumbers(head1,head2);
        while (sum != null) {
            System.out.print(sum.val + " -> ");
            sum = sum.next;
        }
        System.out.print("null");
    }
}
