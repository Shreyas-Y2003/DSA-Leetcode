class Solution {
    public int countOperations(int num1, int num2) {
        int count = 0;
        
        while (num1 != 0 && num2 != 0) {
            if (num1 >= num2) {
                count += num1 / num2;  // count how many times num2 fits into num1
                num1 %= num2;          // reduce num1
            } else {
                count += num2 / num1;  // count how many times num1 fits into num2
                num2 %= num1;          // reduce num2
            }
        }
        
        return count;
    }
}