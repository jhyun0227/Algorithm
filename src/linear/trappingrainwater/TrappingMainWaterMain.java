package linear.trappingrainwater;

import linear.twosum.TwoSum4;

public class TrappingMainWaterMain {
    public static void main(String[] args) {
//        TrappingRainWater1 trappingRainWater = new TrappingRainWater1();
        TrappingRainWater2 trappingRainWater = new TrappingRainWater2();

        long start = System.nanoTime();

        int[] height = {1, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        trappingRainWater.trappingRainWater(height);

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }
}
