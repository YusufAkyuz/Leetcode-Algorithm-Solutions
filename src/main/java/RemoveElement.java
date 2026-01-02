public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0 || nums == null) {
            return 0;
        }
        int result = 0;
        int poineter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[poineter] = nums[i];
                poineter++;
                result++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {1,1,2,2,3}, 2));
    }
}
