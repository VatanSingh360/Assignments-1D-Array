package Queue_And_Stack;

import java.util.Stack;

public class Queue_Using_Stack {
  static   Stack <Integer> st1= new Stack<>();
   static Stack<Integer> st2 = new Stack<>();
    public static void main(String[] args) {
        Queue_Using_Stack q = new Queue_Using_Stack();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        System.out.println( q.deQueue());
        System.out.println( q.deQueue());

    }

    private static int deQueue() {
        if (st1.empty()&& st2.empty()){
            System.out.println("Queue is empty :");
            System.exit(-1);
        }
        while (!st1.empty()){
            st2.push(st1.pop());
        }
        int ele = st2.pop();
        return ele;
    }

    private static void enQueue(int n) {
        st1.push(n);
    }
}
