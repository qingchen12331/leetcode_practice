## 二叉树的层序遍历
```java
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        List<List<Integer>>list=new ArrayList<List<Integer>>();
        queue.add(root);
        if(root==null){
            return list;
        }
        while(queue.size()!=0){
            List<Integer> arr=new ArrayList<>();
            int level=queue.size();
            for(int i=0;i<level;i++){

                TreeNode node=queue.remove();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                arr.add(node.val);

            }
            list.add(arr);
        }
return list;
    }
}
```
解答成功:
	执行耗时:1 ms,击败了93.68% 的Java用户
	内存消耗:44.2 MB,击败了5.78% 的Java用户