package DAY18;

public class squaresofsortedarray {
    public int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        java.util.Arrays.sort(nums);

        return nums;
    }
}