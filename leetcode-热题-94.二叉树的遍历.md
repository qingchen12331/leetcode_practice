## 二叉树的遍历
```java
class Solution {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        dfs(list,root);
        return list;

    }
    public void dfs(List<Integer>list,TreeNode root){
        if(root==null){
            return;
        }
        dfs(list,root.left);
        list.add(root.val);
        dfs(list,root.right);

    }


}
```
[leetcode-热题-二叉树的遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/?envType=study-plan-v2&envId=top-100-liked)