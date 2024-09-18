class Solution 
{
    public int getDecimalValue(ListNode h) 
    {
        StringBuilder builder = new StringBuilder("");
        while (h!=null) 
        {
            builder.append(h.val);
            h=h.next;
        }
        return Integer.parseInt(builder.toString(),2);
    }
}