import java.util.List;

public class IntersectionOfTwoLinkedLists {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }
        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }
        if (lenA > lenB) {
            for (int i = 0; i < lenA-lenB; i++) {
                headA = headA.next;
            }
        } else if (lenB > lenA) {
            for (int i = 0; i < lenB-lenA; i++) {
                headB = headB.next;
            }
        }
        while(headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
