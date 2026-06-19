class Solution {
    public boolean isAnagram(String s, String t) {
        int s1=s.length();
        int t1=t.length();
        if(s1!=t1)
        {
            return false;
        }

        HashMap<Character,Integer> hs =new HashMap<>();

        for(int i=0;i<s1;i++)
        {
            char ch=s.charAt(i);
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }

        for(int j=0;j<t1;j++)
        {
            char ch2=t.charAt(j);
            hs.put(ch2,hs.getOrDefault(ch2,0)-1);
        }

        for(int k=0;k<s1;k++)
        {
            char ch3=s.charAt(k);
            if(hs.get(ch3)!=0)
            {
                return false;
            }
        }
        return true;

    }
}
