import java.util.LinkedList;
import java.util.Queue;

class Node5{
    int data;
    Node5 right;
    Node5 left;

    Node5() {}
    Node5(int data) {
        this.data = data;
        this.left =left;
        this.right =right;
    }
}
public class NonLeaf {
    public int NodeNonLeaf(Node5 root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        Queue<Node5> store = new LinkedList<>();
        store.offer(root);

        while (!store.isEmpty()) {
            Node5 tempo = store.poll();

            // Check if the current node is a non-leaf (has at least one child)
            if (tempo.left != null || tempo.right != null) {
                count++;
            }

            // Add non-null children to the queue
            if (tempo.left != null) {
                store.offer(tempo.left);
            }
            if (tempo.right != null) {
                store.offer(tempo.right);
            }
        }

        System.out.println(count);
        return count;
    }
    public static  void main(String[]  args) {
        Node5 top = new Node5(10);
        top.left = new Node5(10);
        top.right = new Node5(20);
        top.left.left =new Node5(30);
        top.left.left.left = new Node5(60) ;
        top.right.right = new Node5(50);
        NonLeaf nl = new NonLeaf();
        nl.NodeNonLeaf(top);
    }
}

