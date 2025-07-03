import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left ;
    Node right;

    Node(int value) {
        this.data =value;
        this.left =null;
        this.right=null;

    }
}

public class LevelOrder {
  public void insertion(Node root) {

      if (root == null) {
          return;
      }
      Queue<Node> Storage = new LinkedList<>();
      Storage.add(root);


      while(!Storage.isEmpty()) {
          Node current = Storage.poll();
          System.out.print(current.data + " ");

          //enquue left child
          if (current.left != null) {
              Storage.add(current.left);
          }
          if(current.right!=null) {
              Storage.add(current.right);
          }
      }

  }
  public static void main(String[]  args ) {
Node top = new Node(10);
top.left = new Node(10);
top.right = new Node(20);
top.left.left =new Node(30);
top.left.left.left = new Node(60) ;
top.right.right = new Node(50);

LevelOrder lc = new LevelOrder();
System.out.println("level order traversal ");
      lc.insertion(top);
  }
}
