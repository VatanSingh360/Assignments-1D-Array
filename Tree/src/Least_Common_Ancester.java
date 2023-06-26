public class Least_Common_Ancester {
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
        findAncester(root,c,d);
    }

    private static Node findAncester(Node root, Node c, Node q) {
        if (root==null) return null;
        if (root==c||root==q)return root;
        Node left = findAncester(root.left,c,q);
        Node right = findAncester(root.right,c,q);
        if (left!=null&&right!=null) return root;
        if (left!=null) return left;
        else return right;
    }
}
