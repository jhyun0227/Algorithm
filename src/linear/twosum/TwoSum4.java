package linear.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum4 {
    public int[] twoSum(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left != right) {
            if (target > array[left] + array[right]) {
                left++;
            } else if (target < array[left] + array[right]) {
                right--;
            } else {
                return new int[]{left, right};
            }
        }

        return null;
    }
}
