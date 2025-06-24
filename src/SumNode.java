import java.util.LinkedList;
import java.util.Queue;

public class SumNode {
    public int SumCalc(Node3 root) {
        if (root == null) return 0;

        int sum = 0;
        Queue<Node3> Store = new LinkedList<>();
        Store.offer(root);

        while (!Store.isEmpty()) {
            Node3 curr = Store.poll();
            sum += curr.data;

            if (curr.left != null) {
                Store.offer(curr.left);
            }
            if (curr.right != null) {
                Store.offer(curr.right);
            }
        }

        System.out.println("the total sum of all nodes " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Node3 data = new Node3( 20);
        data.left = new Node3( 10);
        data.left.left = new Node3( 30);
        data.right = new Node3( 40);

        SumNode sum = new SumNode();
        sum.SumCalc(data);
    }
}

class Node3 {
    int data;
    Node3 left, right;

    public Node3(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}