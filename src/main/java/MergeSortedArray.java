public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p_writter = m+n-1;
        int p2 = n-1;
        while (p1 >=  0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[p_writter] = nums2[p2];
                p2--;
            } else {
                nums1[p_writter] = nums1[p1];
                p1--;
            }
            p_writter--;
        }
        //Eğer nums1de eleman yoksa ama nums2de varsa nums2'yi olduğu gibi soldan sağa doğru nums1'e geçirir.
        while (p2>=0) {
            nums1[p_writter] = nums2[p2];
            p2--;
            p_writter--;
        }

        for (int value : nums1) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,2,2}, 3);
        System.out.println();
        merge(new int[] {0,0,0}, 0, new int[] {1,2,2}, 3);
    }
}
