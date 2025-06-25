import java.util.LinkedList;
import java.util.Queue;

class Node6 {
    int data;
    Node6 left;
    Node6 right;
     Node6() {}
    Node6(int real) {
        this.data=real;
        this.left=null;
        this.right=null;
    }
}


public class MirrorTree {
    public boolean Mirror(Node6 root) {
        if(root == null) {return true;
        }

        Queue<Node6> store =new LinkedList<>();
        store.offer(root);
        while(!store.isEmpty()) {
            //changing the nodes fom left to right to match the mirror
            Node6 temp = store.poll();
            Node6 temp2 = temp;
            temp.right = temp2.left;
            temp.left = temp2.right;

            //if not null kids
            if(temp.left!= null) {
                store.offer(temp.left);
            }
                if(temp.right!=null) {
                    store.offer(temp.right);
                }
        }

        return true;
    }
    public static void main(String[] args) {
        Node6 top = new Node6(10);
        top.left = new Node6(10);
        top.right = new Node6(20);
        top.left.left =new Node6(30);
        top.left.left.left = new Node6(60) ;
        top.right.right = new Node6(50);
        MirrorTree mt =new MirrorTree();
        mt.Mirror(top);
    }
}
