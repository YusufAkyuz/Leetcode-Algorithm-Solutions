public class LinkedListCycle {
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

    public boolean hasCycle(ListNode head) {
        //Floyd's Tortoise and Hare Algorithm
        /*
        Ana Fikir: Dairesel bir koşu pistinde koşan iki koşucu hayal et:

        Yavaş Koşucu (slow): Her seferinde bir adım atar.
        Hızlı Koşucu (fast): Her seferinde iki adım atar.

        İki senaryo vardır:

        Senaryo 1: Pist düzse (döngü yoksa) Hızlı koşucu (fast) eninde sonunda pistin sonuna (null) ulaşır ve yarış biter.
        Döngü yoktur.
        Senaryo 2: Pist daireselse (döngü varsa) Hızlı koşucu, yavaş koşucudan daha hızlı olduğu için, eninde sonunda
        yavaş koşucuya arkadan tur bindirir ve onu yakalar (yani aynı konuma gelirler).
         */

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
