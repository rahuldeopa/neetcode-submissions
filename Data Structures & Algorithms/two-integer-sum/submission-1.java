class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> hs= new HashMap<>();
        int[] arr= new int[2];
        int len=nums.length;

        for(int i=0;i<len;i++)
        {
            hs.put(nums[i],i);
        }
        for(int j=0;j<len;j++)
        {
            int num=target-nums[j];

            if(hs.get(num)!=null && hs.get(num)!=j)
            {
                arr[0]=j;
                arr[1]=hs.get(num);
                break;
            }
        }
        return arr;
    }
}
