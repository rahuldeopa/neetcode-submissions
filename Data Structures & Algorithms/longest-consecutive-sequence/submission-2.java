class Solution {
    public int longestConsecutive(int[] nums) {
        
        Map<Integer,Boolean> hs=new HashMap<>();
        int maxseq=0;
        for(int num: nums)
        {
            hs.put(num,false);
        }

        for(int num: nums)
        {
            int currentlen=1;
            int nextNum=num+1;
            while(hs.containsKey(nextNum) && hs.get(nextNum)!=true )
            {
                currentlen++;
                hs.put(nextNum,true);
                nextNum++;
            }
            int prev=num-1;
            while(hs.containsKey(prev) && !hs.get(prev))
            {
                currentlen++;
                hs.put(prev,true);
                prev--;
            }
            maxseq=Math.max(maxseq,currentlen);
        }
        return maxseq;
    }
}
