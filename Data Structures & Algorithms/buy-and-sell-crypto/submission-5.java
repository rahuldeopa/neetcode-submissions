class Solution {
    public int maxProfit(int[] prices) {
        
        int l=prices.length;
        int maxProfit=0;
        int minValue=Integer.MAX_VALUE;
        
        for( int i=0;i<l;i++)
        {
           if(prices[i]<minValue)
           {
            minValue=prices[i];
           }
           else if(prices[i]-minValue>maxProfit)
           {
            maxProfit=prices[i]-minValue;
           }
        }
        return maxProfit;
    }
}
