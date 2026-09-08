/*
class Node
{
    int data;
    Node left, right;

    Node(int x)
    {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public int leafSum(Node root) {
      if(root==null) return 0;
      if(root.left==null && root.right==null) {
          return root.data;
      }
        
        return leafSum(root.left)+leafSum(root.right);
        
    }
}