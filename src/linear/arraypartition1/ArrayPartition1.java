package linear.arraypartition1;

import java.util.*;

/**
 * n개의 페어를 이용한 min(a, b)의 합으로 만들 수 있는 가장 큰 수를 출력
 * 오름차순 풀이로 페어의 min이 커야하기 때문에, 오름차순 or 내림차순으로 순서대로 페어를 지으면 된다.
 */
public class ArrayPartition1 {
    public int arrayPartition(int[] nums) {

        Arrays.sort(nums);
        List<Integer> pairList = new ArrayList<>();

        Integer sum = 0;

        for (int num : nums) {
            pairList.add(num);

            if (pairList.size() == 2) {
                sum += Collections.min(pairList);
                pairList.clear();
            }
        }

        return sum;
    }
}
