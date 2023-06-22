package Tree_Asgn;

import java.util.*;

public class Ques_3 {
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
        b.left=d;
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);
        b.right=e;
        d.left=f;
        d.right=g;
       // preOrder(root);
        //System.out.println(printLevelOrder(root));
        System.out.println(LevelOrder(root));
        
    }

    private static List<Integer> LevelOrder(Node root) {
        List <Integer> ans = new ArrayList<>();
        Stack <Integer> st = new Stack<>();
        if (root==null) return ans;
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            Node n= q.remove();
           // ans.add(n.val);
            st.push(n.val);
            if (n.left!=null) q.add(n.left);
            if (n.right!=null) q.add(n.right);
        }

        while (!st.isEmpty())
            ans.add(st.pop());
        return ans;
    }

    }



