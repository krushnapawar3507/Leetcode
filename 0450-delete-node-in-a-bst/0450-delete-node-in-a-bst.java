/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
        if(root.val > key){
            root.left = deleteNode(root.left, key);
            return root;
        }
        else if(root.val < key){
            root.right = deleteNode(root.right, key);
            return root;
        }
        else {
            // case 1 : no child
            if(root.left == null && root.right == null){
                return null;
            }
             
             // case 2 : 1 child
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            //case 3 : 2 child
            //go to right subtree
            TreeNode temp = root.right;
            //find smallest value
            while(temp.left != null){
                temp = temp.left;
            }
            //replace the value with root
            root.val = temp.val;
            //delete duplicate node
            root.right = deleteNode(root.right, temp.val);

            return root;
        }
    }
}
