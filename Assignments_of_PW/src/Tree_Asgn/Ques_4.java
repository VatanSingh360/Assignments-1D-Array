package Tree_Asgn;
import java.util.*;

import java.util.HashMap;

public class Ques_4 {
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
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.left = new Node(7);
        root.right.left.right = new Node(8);
        view(root);
    }

    private static void view(Node root) {
        Map <Integer,Integer> hm = new HashMap<>();
        leftView(root,1,hm);
        for (int i = 1; i <=hm.size() ; i++) {
            System.out.print(hm.get(i)+" ");
        }
    }

    private static void leftView(Node root, int lvl, Map<Integer, Integer> hm) {
        if (root==null) return;
        hm.putIfAbsent(lvl,root.val);
        leftView(root.left, lvl+1, hm);
        leftView(root.right, lvl+1, hm);
    }
}
