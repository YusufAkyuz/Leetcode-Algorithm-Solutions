import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
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

    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();

        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            if (!list.get(start).equals(list.get(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean isPalindromeEfficient(ListNode head) {
        // Tek elemanlı veya boş liste her zaman palindromdur.
        if (head == null || head.next == null) {
            return true;
        }

        // 1. ADIM: Listenin ortasını bul (Slow & Fast Pointer)
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // 1 adım gider
            fast = fast.next.next;  // 2 adım gider
        }
        // Döngü bittiğinde 'slow' işaretçisi listenin tam ortasındadır.

        // 2. ADIM: İkinci yarıyı ters çevir
        // slow'dan itibaren sonuna kadar olan kısmı ters çeviriyoruz.
        ListNode secondHalfStart = reverseList(slow);

        // Karşılaştırma için işaretçileri hazırla
        ListNode firstHalfStart = head;
        ListNode secondHalfIter = secondHalfStart;

        // 3. ADIM: İki yarıyı karşılaştır
        boolean result = true;
        while (result && secondHalfIter != null) {
            if (firstHalfStart.val != secondHalfIter.val) {
                result = false; // Değerler eşleşmedi, palindrom değil!
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfIter = secondHalfIter.next;
        }

        // (Opsiyonel İyi Mühendislik) 4. ADIM: Listeyi eski haline getir
        // reverseList(secondHalfStart);

        return result;
    }

    // Klasik Linked List Ters Çevirme Fonksiyonu
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next; // Bağlantıyı koparmadan önce yedeğini al
            curr.next = prev;              // Oku geriye çevir
            prev = curr;                   // prev'i bir ileri taşı
            curr = nextTemp;               // curr'i bir ileri taşı
        }
        return prev; // Yeni baş (eski son)
    }


    public static void main(String[] args) {

    }
}
