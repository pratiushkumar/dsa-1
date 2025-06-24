import java.util.LinkedList;
import java.util.Queue;

class Node4 {
    int data;
    Node4 left;
    Node4 right;

    Node4() {
    }

    Node4(int asli) {
        this.data = asli;
        this.left = null;
        this.right=null;
    }
}
public class CountLeaf {
    public int leaf(Node4 root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        Queue<Node4> store = new LinkedList<>();
        //add the fucking root
        store.offer(root);

        while (!store.isEmpty()) {
            Node4 current = store.poll();
            if (current.left == null && current.right == null) {
                count++;
            } else {
                if (current.left != null) {
                    store.offer(current.left);
                }
                if (current.right != null) {
                    store.offer(current.right);
                }
            }

        }
        System.out.println(count);
        return count;


    }
    public static void main(String[] args) {
        Node4 top = new Node4(10);
        top.left = new Node4(10);
        top.right = new Node4(20);
        top.left.left =new Node4(30);
        top.left.left.left = new Node4(60) ;
        top.right.right = new Node4(50);
        CountLeaf cl = new CountLeaf();
        cl.leaf(top);

    }
}