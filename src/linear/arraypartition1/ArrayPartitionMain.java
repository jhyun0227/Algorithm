package linear.arraypartition1;

import linear.threesum.ThreeSum2;

import java.util.List;

public class ArrayPartitionMain {

    public static void main(String[] args) {
//        ArrayPartition1 arrayPartition = new ArrayPartition1();
        ArrayPartition2 arrayPartition = new ArrayPartition2();

        long start = System.nanoTime();

        int[] nums = {1, 3, 2, 4};
        int result = arrayPartition.arrayPartition(nums);
        System.out.println("result = " + result);

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }
}
