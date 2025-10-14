class Solution {
    public int[] twoSum(int[] arr, int tar) {
        int l=0,r=arr.length-1;
        
        while(l<r)
        {
            int sum=arr[l]+arr[r];
            if(sum==tar){
                return new int[] {l+1,r+1};
            }
            if(sum<tar){
                l++;
            }else{
                r--;
            }
        }
        return new int[]{};
    }
}