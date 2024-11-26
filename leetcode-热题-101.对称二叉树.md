## 对称二叉树
```java
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);

    }
    public boolean check(TreeNode left, TreeNode right) {
        if(left==null&&right==null){
            return true;
        }
        if(left==null||right==null){
            return false;
        }
        return left.val==right.val&&check(left.left,right.right)&&check(left.right,right.left);
    }
}
```
#### 题目链接
[leetcode-热题-二叉树的遍历](https://leetcode.cn/problems/binary-tree-inorder-traversal/?envType=study-plan-v2&envId=top-100-liked)
