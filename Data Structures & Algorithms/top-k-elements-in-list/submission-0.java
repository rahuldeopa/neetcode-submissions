class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int l=nums.length;
        int[] ans=new int[k];
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer>[] bucket=new List[nums.length+1];

        for(int i=0;i<l;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

      for(int key: hm.keySet())
      {
        int freq=hm.get(key);
        if(bucket[freq]==null)
        {
            bucket[freq]= new ArrayList<>();
        }
        bucket[freq].add(key);
      }
      int counter=0;

      for(int j=bucket.length-1; j>=0 && counter<k;j--)
      {
        if(bucket[j] !=null)
        {
            for(Integer integer: bucket[j])
            {
                ans[counter++]=integer;
            }
        }
      }
      return ans;
    }
}
