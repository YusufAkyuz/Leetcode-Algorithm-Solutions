import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        // Arrayi sortlayıp for ile dönme.
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i+1] != nums[i] +1) {
                return nums[i] + 1;
            }
        }
        return nums[nums.length-1] + 1;
    }
    public int missingNumberEfficient(int[] nums) {
        // Matematiksel yaklaşım n*(n+1)/2 ile yapma.
        int n = nums.length;
        int sum = 0;

        int targetSum = n * (n+1) / 2;

        for (int num : nums) {
            sum += num;
        }

        return targetSum - sum;
    }

    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4};
        System.out.println(arr.length);
    }
}
