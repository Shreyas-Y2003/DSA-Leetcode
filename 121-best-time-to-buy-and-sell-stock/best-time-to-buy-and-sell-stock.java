class Solution {
    public int maxProfit(int[] prices) {
        int res=0;int minso=prices[0];
        for(int i=0;i<prices.length;i++){
            minso=Math.min(minso,prices[i]);
            res=Math.max(res,prices[i]-minso);
        }
        return res;
    }
    //return 0;
}