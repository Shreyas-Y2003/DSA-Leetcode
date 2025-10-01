class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;   // Just increment and return
                return digits;
            }
            digits[i] = 0; // If digit is 9, set to 0 and carry on
        }

        // If we reach here, all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1; // Example: [9,9,9] -> [1,0,0,0]
        return result;
    }
}
