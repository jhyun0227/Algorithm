package linear.threesum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum1 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new LinkedList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i+1; j < nums.length - 1; j++) {

                if (j > i+1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                for (int k = j + 1; k < nums.length; k++) {

                    if (k > j+1 && nums[k] == nums[k - 1]) {
                        continue;
                    }

                    if (nums[i] + nums[j] + nums[k] == 0) {
                        resultList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        return resultList;
    }
}
