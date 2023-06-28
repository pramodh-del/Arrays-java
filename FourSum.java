import java.util.*;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        // Sort the array in ascending order.
        Arrays.sort(nums);

        // Initialize the list of quadruplets.
        List<List<Integer>> quadruplets = new ArrayList<>();

        // Iterate over the array from the first element to the third last element.
        for (int i = 0; i < nums.length - 3; i++) {
            // Check if the current element is greater than the target. If it is, then there are no quadruplets with the current element.
            if (nums[i] > target) {
                break;
            }

            // Iterate over the array from the element after the current element to the second last element.
            for (int j = i + 1; j < nums.length - 2; j++) {
                // Check if the current element and the next element are greater than the target. If they are, then there are no quadruplets with the current and the next element.
                if (nums[i] + nums[j] > target) {
                    break;
                }

                // Initialize the two pointers.
                int left = j + 1;
                int right = nums.length - 1;

                // Iterate over the array from the element after the next element to the last element.
                while (left < right) {
                    // Calculate the sum of the four elements.
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    // If the sum is equal to the target, add the quadruplet to the list of quadruplets.
                    if (sum == target) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return quadruplets;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        List<List<Integer>> quadruplets = fourSum(nums, target);

        for (List<Integer> quadruplet : quadruplets) {
            for (int i = 0; i < quadruplet.size(); i++) {
                System.out.print(quadruplet.get(i) + " ");
            }
            System.out.println();
        }
    }
}
