package linear.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum2 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        Arrays.sort(nums);
        int left;
        int right;

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            left = i + 1;
            right = nums.length - 1;

            int sum;
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else if (sum == 0) {
                    //배열에 담기
                    resultList.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    //left, right의 변경시 변경 전값과 같으면 중복값이기 때문에 해당 내용 체크
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
            }
        }

        return resultList;
    }
}
