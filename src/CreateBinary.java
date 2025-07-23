import javax.swing.tree.TreeNode;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node left;
//    Node right;
//
//    public Node(int data) {
//        this.data = data;
//        this.left = null;
//        this.right=null;
//    }
//
//
//}
//
//
//public class CreateBinary {
//   public static Node insertion (List<Integer> take) {
//       if(take.isEmpty()) {
//           return null;
//       }
//       Node root = new Node(take.get(0));
//       Queue<Node> checker = new LinkedList<>();
//       checker.offer(root);
//        int i =1;
//        while (i<take.size()) {
//            Node current  = checker.poll();
//            //left node
//            if(i<take.size()) {
//                current.left = new Node(take.get(i));
//                checker.offer(current.left);
//
//            i++;
//            }
//
//            //right node
//            if(i<take.size())
//            {
//            current.right = new Node(take.get(i));
//            checker.offer(current.right);
//            i++;
//            }
//        }
//        return root;
//   }
////level order print
//    public static void print(Node root) {
//       if(root == null ) {
//           return ;
//       }
//        Queue<Node> queue = new LinkedList<>();
//        queue.offer(root);
//        System.out.println("Level-order traversal:");
//        while (!queue.isEmpty()) {
//            Node current = queue.poll();
//            System.out.print(current.data + " ");
//
//            if (current.left != null) queue.offer(current.left);
//            if (current.right != null) queue.offer(current.right);
//        }
//    }
//     }
//
