package linear.arrayexceptionself;

import linear.arraypartition1.ArrayPartition2;

public class ArrayExceptionSelfMain {

    public static void main(String[] args) {
        ArrayExceptionSelf1 arrayExceptionSelf = new ArrayExceptionSelf1();

        long start = System.nanoTime();

        int[] nums = {1, 3, 5, 7};
        int[] result = arrayExceptionSelf.arrayExceptionSelf(nums);
        for (int i = 0; i < result.length; i++) {
            if (i != result.length - 1) {
                System.out.print(result[i] + " ");
            } else {
                System.out.println(result[i] + "");
            }
        }

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }
}
