## 二叉树的直径
#### 本题使用了深度优先算法
```java
class Solution {
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans=1;
        dfs(root);
        return ans-1;
    }
    public int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
       int left= dfs(root.left);
        int right=dfs(root.right);
        ans=Math.max(ans,left+right+1);
        return Math.max(left,right)+1;
    }
}
```
解答成功:
	执行耗时:1 ms,击败了99.37% 的Java用户
	内存消耗:43.8 MB,击败了50.47% 的Java用户