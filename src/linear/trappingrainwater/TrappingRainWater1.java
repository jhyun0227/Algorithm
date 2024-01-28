package linear.trappingrainwater;

public class TrappingRainWater1 {

    public void trappingRainWater(int[] height) {
        int volume = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = height[left];
        int rigthMax = height[right];

        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rigthMax = Math.max(rigthMax, height[right]);

            if (leftMax <= rigthMax) {
                volume += leftMax - height[left];
                left++;
            } else {
                volume += rigthMax - height[right];
                right--;
            }
        }

        System.out.println("volume = " + volume);
    }
}
