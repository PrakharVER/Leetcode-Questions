class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode cur = head;
        while (cur != null) {
            n++;  
            cur = cur.next;
        }
        int base = n / k; 
        int extra = n % k;          
        ListNode[] result = new ListNode[k];
        cur = head;
        for (int i = 0; i < k; i++) {
            ListNode part_head = cur;  
            int part_size = base + (extra > 0 ? 1 : 0);  
            extra--;  
            for (int j = 0; j < part_size - 1 && cur != null; j++) {
                cur = cur.next;
            }
            if (cur != null) {
                ListNode next_part = cur.next; 
                cur.next = null;  
                cur = next_part;  
            }
            result[i] = part_head;  
        }
        return result;
    }
}