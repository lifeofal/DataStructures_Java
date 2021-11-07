/*
Given two integer arrays preorder and inorder where preorder is the
preorder traversal of a binary tree and inorder is the inorder traversal of the same tree,
construct and return the binary tree.
 */


public class PreOrder_Inorder_BT {

}

  //Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

 //Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
 //Output: [3,9,20,null,null,15,7]

