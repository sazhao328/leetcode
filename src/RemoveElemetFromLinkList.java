/**
 * Created by Administrator on 2017/9/21.
 */
public class RemoveElemetFromLinkList {
    public ListNode removeElements(ListNode head, int val) {
        ListNode top = new ListNode(0);
        top.next = head;
        ListNode pointer = top;
        while (pointer.next != null) {
            if (pointer.next.val == val) {
                pointer.next = pointer.next.next;
            } else
                pointer = pointer.next;
        }
        return top.next;
    }
}