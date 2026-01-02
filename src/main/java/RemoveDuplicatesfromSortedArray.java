public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null) {
            return 0;
        }
        int result = 1;
        int pointer1 = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[pointer1] != nums[i]) {
                pointer1++;
                nums[pointer1] = nums[i];
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int [] {1,1,2}));
    }
}
