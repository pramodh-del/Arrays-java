import java.util.Arrays;

public class ClosestSumToTarget {

    public static int closestSumToTarget(int[] nums, int target) {
        // Sort the array in ascending order.
        Arrays.sort(nums);

        // Initialize the closest sum as the sum of the first three elements in the array.
        int closestSum = nums[0] + nums[1] + nums[2];

        // Iterate over the array from the third element onwards.
        for (int i = 3; i < nums.length; i++) {
            // Calculate the current sum.
            int currentSum = closestSum - nums[i - 3] + nums[i];

            // If the current sum is closer to the target than the closest sum, update the closest sum.
            if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                closestSum = currentSum;
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        int closestSum = closestSumToTarget(nums, target);

        System.out.println("The closest sum to the target is: " + closestSum);
    }
}
