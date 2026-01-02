import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] results = new int [2];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int dif = target-nums[i];
            if (map.containsKey(dif) && map.get(dif) != i) {
                results[0] = i;
                results[1] = map.get(dif);
                break;
            }
        }
        return results;
    }

    public static void main(String[] args) {

    }
}
