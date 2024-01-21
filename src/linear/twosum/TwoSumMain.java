package linear.twosum;

import linear.twosum.TwoSum1;

public class TwoSumMain {

    public static void main(String[] args) {
//        TwoSum1 twoSum = new TwoSum1();
        TwoSum2 twoSum = new TwoSum2();

        long start = System.nanoTime();

        int[] array = {2, 6, 11, 15};
        int target = 8;
        int[] ints = twoSum.twoSum(array, target);

        for (int a : ints) {
            System.out.println("a = " + a);
        }

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }
}
