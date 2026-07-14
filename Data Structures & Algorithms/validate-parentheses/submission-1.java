class Solution {
    public boolean isValid(String s) {
        int l=s.length();
        Deque<Character> valid=new ArrayDeque<>();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                valid.push(ch);
            }else
            {
                if(valid.isEmpty())
                {
                    return false;
                }
            
            char top=valid.pop();
            if((ch==')' && top!='(') || (ch=='}' && top!='{') ||  (ch==']' && top!='['))
            {
                return false;
            }
            }
        
        }
        return valid.isEmpty();
    }
}
