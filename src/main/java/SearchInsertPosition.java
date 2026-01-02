public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int lowIndex = 0;
        int highIndex = nums.length - 1;
        while (lowIndex <= highIndex) {
            int mid = (highIndex + lowIndex) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                lowIndex = mid + 1;
            } else {
                highIndex = mid - 1;
            }
        }
        return lowIndex;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1,3,5,6}, 6));
    }
}
