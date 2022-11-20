package greedy;

/**
 * 给你一个非负整数数组 nums ，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * 假设你总是可以到达数组的最后一个位置。
 */

public class CanJump2 {
    public int jump(int[] nums) {
        // 记录到达末尾需要达最小步数
        int[] steps = new int[nums.length];

        for (int i = nums.length - 2; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= nums[i] && j + i < nums.length; j++) {
                if (steps[j + i] == Integer.MAX_VALUE) continue;
                min = Math.min(min, steps[j + i] + 1);
            }
            steps[i] = min;
        }
        return steps[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int jump = new CanJump2().jump(nums);
        System.out.println(jump);
    }
}
