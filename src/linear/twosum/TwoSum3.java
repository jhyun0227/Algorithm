package linear.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum3 {
    public int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (numsMap.containsKey(target - array[i])) {
                return new int[]{numsMap.get(target - array[i]), i};
            }

            numsMap.put(array[i], i);
        }

        return null;
    }
}
