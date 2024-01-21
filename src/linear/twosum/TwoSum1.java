package linear.twosum;

public class TwoSum1 {
    public int[] twoSum(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] + array[j]) == target) {
                    return new int[]{array[i], array[j]};
                }
            }
        }
        return null;
    }
}
