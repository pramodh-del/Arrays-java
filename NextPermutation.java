import java.util.*;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        // Find the first decreasing element from the right.
        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] >= nums[i]) {
            i--;
        }

        // If no decreasing element was found, the permutation is the last one.
        if (i == 0) {
            Arrays.sort(nums);
            return;
        }

        // Find the rightmost element that is greater than nums[i - 1].
        int j = nums.length - 1;
        while (nums[j] <= nums[i - 1]) {
            j--;
        }

        // Swap nums[i - 1] and nums[j].
        int temp = nums[i - 1];
        nums[i - 1] = nums[j];
        nums[j] = temp;

        // Reverse the suffix starting from nums[i].
        j = i;
        while (j < nums.length) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
