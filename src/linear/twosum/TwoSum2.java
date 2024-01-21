package linear.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        //키와 값으로 바꾸어 맵으로 저장
        for (int i = 0; i < array.length; i++) {
            numsMap.put(array[i], i);
        }

        //target에서 첫 번째 수를 뺀 결과를 키로 조회, 현재 인덱스가 아닌 경우 정답으로 리턴
        for (int i = 0; i < array.length; i++) {
            if (numsMap.containsKey(target - array[i]) && i != numsMap.get(target - array[i])) {
                return new int[]{i, numsMap.get(target - array[i])};
            }
        }

        return null;
    }
}
