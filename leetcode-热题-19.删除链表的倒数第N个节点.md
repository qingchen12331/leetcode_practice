## 删除链表的倒数第N个节点
### 这是我第一遍做的时候只能想到这个笨办法
```java
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null&&n==1){
            return null;
        }
        ListNode cur=head;
        int sum=0;
        while(cur!=null){
            cur=cur.next;
            sum++;
            System.out.println(sum);
        }
        cur=head;
    if(sum==n){
       cur=cur.next;
       return cur;
   }
        while(sum!=n+1){
            cur=cur.next;
            sum--;
        }
       if(cur.next.next!=null){
           cur.next=cur.next.next;
       }else{
           cur.next=null;
       }
       return head;
        
    }
}
```
这样做的结果就是效率很低下
解答成功:
	执行耗时:7 ms,击败了0.35% 的Java用户
	内存消耗:41 MB,击败了5.60% 的Java用户
### leetcode题解
```java
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode pre=new ListNode(0);
    pre.next=head;
    ListNode end=pre;
    ListNode start=pre;
    while(n!=0){
        start=start.next;
        n--;
    }
    while(start.next!=null){
        start=start.next;
        end=end.next;
    }
    end.next=end.next.next;
    return pre.next;
        
    }
}
```
只遍历了一遍
解答成功:
	执行耗时:0 ms,击败了100.00% 的Java用户
	内存消耗:40.6 MB,击败了90.51% 的Java用户