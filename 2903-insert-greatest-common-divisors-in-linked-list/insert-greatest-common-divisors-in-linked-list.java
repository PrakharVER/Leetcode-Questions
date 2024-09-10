class Solution {
  private int gseed(int a, int b) {
    if (b == 0) return a;
    return gseed(b, a % b);
  }
  public ListNode insertGreatestCommonDivisors(ListNode head) {
    var p = head;

    while (p.next != null) {
      var newwNode = new ListNode(gseed(p.val, p.next.val), p.next);
      p.next = newwNode;
      p = newwNode.next;
    }
    return head;
  }
}