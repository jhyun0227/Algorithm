package linear.arraypartition1;

import java.util.Arrays;

/**
 * n개의 페어를 이용한 min(a, b)의 합으로 만들 수 있는 가장 큰 수를 출력
 * 짝수번째 값 풀이, 오름차순 or 내림차순 풀이와 마찬가지로 순서대로 페어를 지정하는 것이 큰 최대 값을 구하는 방법
 * 굳이 페어를 짝지으지 않고 짝수번째의 인덱스를 더하면 된다.
 */
public class ArrayPartition2 {

    public int arrayPartition(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i <  nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }

        return sum;
    }
}
