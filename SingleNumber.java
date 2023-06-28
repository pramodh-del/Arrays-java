

public class SingleNumber {
}
public class SingleNumber {

    public static int singleNumber(int[] nums) {
        // Initialize the result to 0.
        int result = 0;

        // Iterate over the array.
        for (int i = 0; i < nums.length; i++) {
            // XOR the current element with the result.
            result = result ^ nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 1};

        int singleNumber = singleNumber(nums);

        System.out.println("The single number is: " + singleNumber);
    }
}
