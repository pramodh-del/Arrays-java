public class SearchInsertPosition {

    public static int searchInsertPosition(int[] nums, int target) {
        // Initialize the left and right pointers.
        int left = 0;
        int right = nums.length - 1;

        // While the left pointer is less than or equal to the right pointer.
        while (left <= right) {
            // Calculate the middle pointer.
            int middle = (left + right) / 2;

            // If the target is equal to the element at the middle pointer.
            if (target == nums[middle]) {
                return middle;
            } else if (target < nums[middle]) {
                // The target must be in the left subarray.
                right = middle - 1;
            } else {
                // The target must be in the right subarray.
                left = middle + 1;
            }
        }

        // If the left pointer is greater than the right pointer, then the target
        // is not in the array.
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int index = searchInsertPosition(nums, target);

        System.out.println("The index where the target should be inserted is: " + index);
    }
}
