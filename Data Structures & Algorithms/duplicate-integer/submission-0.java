class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hs =new HashMap<>();
         int l=nums.length;

         for(int i=0;i<l;i++)
         {
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
         }
         for(int j=0;j<l;j++)
         {
            if(hs.get(nums[j])>1)
            {
                return true;
            }
         }
         return false;
    }
}