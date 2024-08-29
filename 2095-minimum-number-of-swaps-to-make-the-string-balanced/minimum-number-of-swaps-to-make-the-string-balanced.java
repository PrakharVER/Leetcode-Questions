class Solution 
{
    public int minSwaps(String s)
    {
        Stack<Character> st = new Stack<Character>();
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            char d = s.charAt(i);
            if(d == '[')
            {
                st.push(d);
            }
            else if(!st.isEmpty() && st.peek() == '[' && d == ']')
            {
                st.pop();
            }
            else
            {
                count++;
            }
        }
        return (count+1)/2;
    }
}