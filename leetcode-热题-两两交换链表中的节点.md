## 两两交换链表中的节点
#### 递归解法
```java
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode next=head.next;
            head.next=swapPairs(next.next);
            next.next=head;
        return next;
    }
}
```
#### 非递归解法
```java
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
       ListNode pre=new ListNode(0);
       pre.next=head;
       ListNode tmp=pre;
       while(tmp.next!=null&&tmp.next.next!=null){
        ListNode start=tmp.next;
        ListNode end=tmp.next.next;
        tmp.next=end;
        start.next=end.next;
        end.next=start;
        tmp=start;
       }
       return pre.next;
    }
}
```
解答成功:
	执行耗时:0 ms,击败了100.00% 的Java用户
	内存消耗:40.2 MB,击败了63.21% 的Java用户