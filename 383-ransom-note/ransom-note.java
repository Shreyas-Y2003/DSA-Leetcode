class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // for lowercase letters a–z

        // Count frequency of each character in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // For each letter in ransomNote, reduce from magazine count
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;
            if (count[c - 'a'] < 0) {
                return false; // not enough of this char in magazine
            }
        }

        return true;
    }
}

