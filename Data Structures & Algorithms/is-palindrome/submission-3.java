class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder st=new StringBuilder();

        int l=s.length();

        for(int i=0;i<l;i++)
        {
            if ((s.charAt(i) < 'A' || s.charAt(i) > 'Z') && (s.charAt(i) < 'a' || s.charAt(i) > 'z') && (s.charAt(i)<'0' || s.charAt(i)>'9'))
            {
                continue;
            }
            st.append(s.charAt(i));
        }
        String str=st.toString().toLowerCase();
        int j=0;
        int k=st.length()-1;
        while(j<k)
        {
            if(str.charAt(j)!=str.charAt(k))
            {
                return false;
            }
            j++;
            k--;
        }
        return true;
    }
}
