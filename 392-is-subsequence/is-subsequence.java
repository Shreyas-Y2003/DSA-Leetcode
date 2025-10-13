class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;  // move pointer on s when characters match
            }
            j++;      // always move pointer on t
        }

        // if we've gone through all characters in s, it's a subsequence
        return i == s.length();
    }
}
