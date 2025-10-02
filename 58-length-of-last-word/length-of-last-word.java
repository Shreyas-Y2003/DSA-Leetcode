class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int length = 0;

        // Traverse from the end
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++; // count characters of the last word
            } else if (length > 0) {
                // break once we found the last word
                return length;
            }
        }

        return length; // handles case where string has only one word
    }
}
