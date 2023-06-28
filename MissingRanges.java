import java.util.*;

public class MissingRanges {

    public static List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        // Initialize the list of ranges.
        List<List<Integer>> ranges = new ArrayList<>();

        // Iterate over the range.
        for (int i = lower; i <= upper; i++) {
            // If the current number is not in the array, add a range to the list.
            if (!contains(nums, i)) {
                // Check if the previous number is equal to i - 1.
                boolean isContinuous = false;
                if (i > lower) {
                    isContinuous = nums[i - 1] == i - 1;
                }

                // Add the range.
                if (!isContinuous) {
                    ranges.add(Arrays.asList(i, i));
                }
            }
        }

        // Sort the list of ranges.
        ranges.sort((a, b) -> a.get(0) - b.get(0));

        return ranges;
    }

    private static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;

        List<List<Integer>> ranges = findMissingRanges(nums, lower, upper);

        for (List<Integer> range : ranges) {
            for (int i = range.get(0); i <= range.get(1); i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
