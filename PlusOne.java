public class PlusOne {

    public static int[] plusOne(int[] digits) {
        // Initialize the carry to 1.
        int carry = 1;

        // Iterate over the array from the rightmost element to the leftmost element.
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current element is less than 9, add the carry to it and set the carry to 0.
            if (digits[i] < 9) {
                digits[i] += carry;
                carry = 0;
            } else {
                // If the current element is equal to 9, set it to 0 and carry over 1.
                digits[i] = 0;
            }
        }

        // If the carry is still 1, append a 1 to the array.
        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};

        int[] result = plusOne(digits);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
