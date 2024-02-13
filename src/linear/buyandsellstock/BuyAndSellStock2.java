package linear.buyandsellstock;

public class BuyAndSellStock2 {
    
    public int buyAndSellStock(int[] nums) {

        int min = nums[0]; //배열중에서 제일 작은 값
        int max = 0; //차액이 제일 클 경우 값 적용

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num - min);
        }

        return max;
    }
}
