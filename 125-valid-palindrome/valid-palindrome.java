class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {return true;}

        int l = 0, r = s.length() - 1;

        while (l < r) {
            // Skip non-alphanumeric chars
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            }

            // Compare characters in lowercase
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}
