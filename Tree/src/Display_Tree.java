public class Display_Tree {
    static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val=val;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left=a;
        root.right=b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left=c;
        a.right=d;
        Node e = new Node(6);
        Node f = new Node(7);
        b.right=e;
        e.right=f;
        printTree(root);
    }

    private static void printTree(Node root) {
        if(root == null) return;
        System.out.print("root"+root.val+" -> ");
        if (root.left!=null) System.out.print("l"+root.left.val+",");
        if (root.right!=null) System.out.println("r"+root.right.val);
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
}
