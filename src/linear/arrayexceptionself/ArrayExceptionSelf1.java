package linear.arrayexceptionself;

/**
 * 배열에서 각 인덱스를 제외한 다른 인덱스들의 곱을 구하는 문제
 * 풀이 공식을 잘 이해하지 못했음
 */
public class ArrayExceptionSelf1 {

    public int[] arrayExceptionSelf(int[] nums) {
        int[] result = new int[nums.length];
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = p;
            p *= nums[i];
        }

        p = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= p;
            p *= nums[i];
        }

        return result;
    }
}
