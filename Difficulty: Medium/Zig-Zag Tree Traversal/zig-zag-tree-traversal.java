class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if(root == null) return ans;

        Deque<Node> q = new LinkedList<>();
        q.add(root);

        int flag = 0;

        while(!q.isEmpty()) {
            int size = q.size();

            while(size-- > 0) {
                Node front;

                if(flag == 0) {
                    front = q.removeFirst();
                    ans.add(front.data);

                    if(front.left != null)
                        q.addLast(front.left);

                    if(front.right != null)
                        q.addLast(front.right);
                }
                else {
                    front = q.removeLast();
                    ans.add(front.data);

                    if(front.right != null)
                        q.addFirst(front.right);

                    if(front.left != null)
                        q.addFirst(front.left);
                }
            }

            flag = 1 - flag;
        }

        return ans;
    }
}