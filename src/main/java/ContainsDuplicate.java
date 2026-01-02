import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }else {
                map.put(num,1);
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];

            if (map.containsKey(x)) {
                int prev = map.get(x);
                if (i - prev <= k) {
                    return true;
                }
            }

            map.put(x, i);
        }

        return false;
    }

    public static void main(String[] args) {

    }
}
