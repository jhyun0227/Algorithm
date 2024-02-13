package linear.buyandsellstock;

public class BuyAndSellStock1 {
    
    //브루트 포스로 계산
    public int buyAndSellStock(int[] nums) {
        
        int max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int difference = nums[j] - nums[i];

                if (difference > max) {
                    max = Math.max(max, nums[j] - nums[i]);
                }
            }
        }

        return max;
    }
}
