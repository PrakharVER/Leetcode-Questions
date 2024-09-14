class Solution{
    public ListNode removeNodes(ListNode head){
        if(head.next==null) 
        {
            return head;
        }
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        head=pre;
        cur=head.next;
        while(cur!=null){
            if(cur.val<pre.val){
                cur=cur.next;
            }else{
                ListNode temp=cur.next;
                cur.next=pre;
                pre=cur;
                cur=temp;
            }
        }
        head.next=null;
        head=pre;
        return head;
    }
}