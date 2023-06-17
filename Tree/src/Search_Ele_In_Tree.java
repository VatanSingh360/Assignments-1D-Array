public class Search_Ele_In_Tree {
    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val=val;
        }
    }

    public static void main(String[] args) {
        int target=0;
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
      boolean t=  SearchEle(root,target);
        if (t) System.out.println("Data is in tree");
        else System.out.println("Data is not in tree ");
    }

    private static boolean SearchEle(Node root,int target) {
        if (root == null) return false;
        if (root.val == target) return true;
        return SearchEle(root.left, target) || SearchEle(root.right, target);
    }
}
