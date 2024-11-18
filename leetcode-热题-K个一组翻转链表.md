## 25. K 个一组翻转链表
```java
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode pre=dummy;
        ListNode end=dummy;
        while(end.next!=null){
            for(int i=0;i<k&&end!=null;i++){
                end=end.next;

                }
            if(end==null){
                return dummy.next;
            }
            ListNode start=pre.next;
            ListNode next=end.next;
            end.next=null;
            pre.next=reverse(start);
            start.next=next;
            pre=start;

            end=pre;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;cur=next;
        }
        return pre;
    }
}
```
[leetcode-热题-K个一组翻转链表](https://leetcode.cn/problems/reverse-nodes-in-k-group/description/?envType=study-plan-v2&envId=top-100-liked)