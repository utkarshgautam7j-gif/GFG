/* Structure of binary tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        mirror(root.left);
        return same(root.left,root.right);
        
    }
    private boolean same(Node r1,Node r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        
        if(r1.data!=r2.data){
            return false;
        }
        return same(r1.left,r2.left) && same(r1.right,r2.right);
    }
    
    private void mirror(Node root){
        
        if(root==null) return;
        Node temp = root.left;
        root.left= root.right;
        root.right= temp;
        
        mirror(root.left);
        mirror(root.right);
    }
    
}