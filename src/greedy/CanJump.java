package greedy;

public class CanJump {
    public boolean canJump(int[] nums) {
        boolean res = false;
        int step = 0;

        for (int length = nums.length - 1; length >= 0; length--) {
            if (nums[length] >= step) {
                step = 1;
                if (length == 0) return true;
            } else {
                step++;
            }
        }

        return false;
    }
}
