class Solution 
{
    public char kthCharacter(int k) 
    {
        String as = "a";
        while(as.length() < k){
            StringBuilder builder = new StringBuilder();
            for(char ch : as.toCharArray())
            {
                if(ch == 'z')
                    builder.append("a");
                else 
                    builder.append((char) (ch + 1));
            }
            as += builder.toString();
        }
        return as.charAt(k - 1);
    }
}