class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len=numbers.length;
        int ans[] =new int[2];
        int num =numbers[0];//1
        int i,j;
        i=0;
        j=len-1;

        while(i<=j)
        {
            if(numbers[i]+numbers[j]>target)      //target 3, j=2,1+3=4,j=1,1+2=3
            {
                if(numbers[i]<numbers[j])
                {
                    j--;
                }else{
                    i++;
                }
            }
            if(numbers[i]+numbers[j]<target)
            {
                i++;
            }

            if(numbers[i]+numbers[j]==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }

        }
        return ans;
    }
}
