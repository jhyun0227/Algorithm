package linear.buyandsellstock;

import linear.arraypartition1.ArrayPartition2;

public class BuyAndSellStockMain {

    public static void main(String[] args) {

//        BuyAndSellStock1 buyAndSellStock = new BuyAndSellStock1();
        BuyAndSellStock2 buyAndSellStock = new BuyAndSellStock2();

        long start = System.nanoTime();

        int[] nums = {8, 1, 5, 3, 6, 4};
        int difference = buyAndSellStock.buyAndSellStock(nums);
        System.out.println("difference = " + difference);

        long end = System.nanoTime();

        System.out.println("time = " + (end - start));
    }
}
