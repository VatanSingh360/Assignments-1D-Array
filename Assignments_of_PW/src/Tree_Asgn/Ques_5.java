package Tree_Asgn;

public class Ques_5 {
    static  class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a= new Node(2);
        Node b= new Node(3);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(6);
        Node f= new Node(7);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;
        b.right=f;
      boolean t=  isMirror(root);
      if (t) System.out.println("Tree is symmetric");
      else System.out.println("Tree is not symmetric");

    }

    private static boolean isMirror(Node root) {
        return (root==null)||check(root.left,root.right);
    }
    static boolean check(Node left,Node right){
        if (left==null||right==null) return left==right;
        if (right.val!= left.val) return false;
        return check(left.right,right.left)&&check(left.left,right.right);
    }
}
