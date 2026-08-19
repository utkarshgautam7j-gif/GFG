class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (root == null) return ans;

        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

        Queue<Node> q = new LinkedList<>();
        Queue<Integer> col = new LinkedList<>();

        q.add(root);
        col.add(0);

        while (!q.isEmpty()) {

            Node curr = q.poll();
            int c = col.poll();

            if (!map.containsKey(c)) {
                map.put(c, new ArrayList<>());
            }

            map.get(c).add(curr.data);

            if (curr.left != null) {
                q.add(curr.left);
                col.add(c - 1);
            }

            if (curr.right != null) {
                q.add(curr.right);
                col.add(c + 1);
            }
        }

        for (ArrayList<Integer> values : map.values()) {
            ans.add(values);
        }

        return ans;
    }
}