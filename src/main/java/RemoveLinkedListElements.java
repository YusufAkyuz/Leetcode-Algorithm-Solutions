public class RemoveLinkedListElements {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);  // ilk eleman eklenmesindeki amaç head[0]'ında silinebilecek olmasıdır.
        temp.next = head;

        ListNode curr = temp;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;   // sil
            } else {
                curr = curr.next;             // ilerle
            }
        }
        return temp.next;
    }

    public static void main(String[] args) {

    }
}
