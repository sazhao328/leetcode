package ac;

//AC
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null ? l1.val : 0);
            int y = (l2 != null ? l2.val : 0);
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            curr = curr.next;
        }
        if (carry > 0)
            curr.next = new ListNode(carry);
        return res.next;

    }

    public void test() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = null;
        System.out.println(addTwoNumbers(l1, l2).val);
    }
}