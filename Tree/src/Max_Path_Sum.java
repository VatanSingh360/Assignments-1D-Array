public class Max_Path_Sum {
    static int max =Integer.MIN_VALUE;
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.right = e;
        e.right = f;

        System.out.println(MaxPath(root));
    }

    private static int MaxPath(Node root) {

        findSum(root);
        return max;

    }

    private static int findSum(Node root) {
        if (root==null) return 0;
        int left = Math.max(0,findSum(root.left));
        int right = Math.max(0,findSum(root.right));
        max = Math.max(max, root.val+left+right);
        return root.val+Math.max(left,right);
    }
}
