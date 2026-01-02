public class MergeTwoSortedLists {

    // Basit ListNode tanımı
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    // Test için main metodu
    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();

        // 1 -> 2 -> 4
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        // 1 -> 3 -> 4
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode merged = m.mergeTwoLists(l1, l2);

        // Sonucu yazdır
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
        // Çıktı: 1 1 2 3 4 4
    }
}
