package linear.threesum;

import linear.trappingrainwater.TrappingRainWater2;

import java.util.List;

public class ThreeSumMain {

    public static void main(String[] args) {
//        ThreeSum1 threeSum = new ThreeSum1();
        ThreeSum2 threeSum = new ThreeSum2();

        long start = System.nanoTime();

        int[] nums = {-1, 0, 1, 2, -1, -5};
        List<List<Integer>> lists = threeSum.threeSum(nums);

        for (List<Integer> list : lists) {
            System.out.print("[ ");

            for (int i = 0; i < list.size(); i++) {

                if (i != list.size() - 1) {
                    System.out.print(list.get(i) + ", ");
                } else {
                    System.out.print(list.get(i) + " ");
                }
            }

            System.out.print(" ]");
            System.out.println();
        }


        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }
}
