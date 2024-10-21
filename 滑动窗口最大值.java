import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // 若遇到这种情况直接返回空数组
     if(k==0||nums.length==0){
         return new int[]{};

     }
        // 创建一个双端队列
        Deque<Integer>deque=new LinkedList<>();
     //结果数组的索引
     int resindex=0;
     //结果数组
     int []res=new int[nums.length-k+1];
     //遍历数组
     for(int i=0;i<nums.length;i++){
         //判断队列是否为空，并且判断队列最大元素是否过期
         if(!deque.isEmpty()&&deque.peek()==i-k){
             deque.poll();
         }
         //将所有小于最大值的元素出队列
         while(!deque.isEmpty()&&nums[deque.peekLast()]<nums[i]){
             deque.pollLast();

         }
         //添加元素
         deque.offer(i);
         //满足k时候，添加结果
         if(i>=k-1){
             res[resindex++]=nums[deque.peek()];
         }

     }
     //返回结果数组
     return res;


        
    }
}