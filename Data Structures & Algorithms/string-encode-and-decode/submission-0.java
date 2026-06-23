class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded= new StringBuilder();

        for( String str : strs)
        {
            encoded.append(str.length()).append("#").append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> result= new ArrayList<>();
        int i=0;

        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#')// 3#RAM2#RA
            {
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));
            i=j+1;
            result.add(str.substring(i,j+length+1));
            i+=length;

        }
        return result;
    }
}
