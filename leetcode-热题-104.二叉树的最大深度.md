## 二叉树的最大深度
#### 这是第一次写1的代码,效率不高
```java
class Solution {

    public int maxDepth(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        dfs(root,0,res);
        Collections.sort(res);

        return res.get(res.size()-1);
    }
    public void dfs(TreeNode root,int num,List<Integer>res){
        if(root==null){
            res.add(num);
            return;
        }
        dfs(root.left,num+1,res);
        dfs(root.right,num+1,res);


    }

}

```
解答成功:
	执行耗时:3 ms,击败了0.84% 的Java用户
	内存消耗:41.8 MB,击败了10.50% 的Java用户
#### 改进后的版本
```java
class Solution {
    public int maxDepth(TreeNode root) {
        return dfs(root, 0);
    }

    public int dfs(TreeNode root, int depth) {
        if (root == null) {
            return depth;
        }
        int leftDepth = dfs(root.left, depth + 1);
        int rightDepth = dfs(root.right, depth + 1);
        return Math.max(leftDepth, rightDepth);
    }
}
```
解答成功:
	执行耗时:0 ms,击败了100.00% 的Java用户
	内存消耗:41.6 MB,击败了57.17% 的Java用户

> 2024/11/18 15:46:10	
