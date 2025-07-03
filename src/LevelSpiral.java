//import java.util.ArrayList;
//import java.util.Stack;
//
//class Node7  {
//    int data;
//    Node7 left;
//    Node7 right;
//    Node7() {}
//    Node7 (int dalega) {
//        this.data = dalega;
//        this.left =null;
//        this.right =null;
//
//    }
//}
//
//
//public class LevelSpiral {
//    public void Levelorder(Node7 root) {
//        Stack<Node7> rightwale = new Stack<>();
//        Stack<Node7> leftwale = new Stack<>();
//        ArrayList<Integer>ans =  new ArrayList<Integer>();
//        rightwale.push(root);
//
//        while(!rightwale.isEmpty() || leftwale.isEmpty() ) {
//            if(!rightwale.isEmpty()) {
//                while(rightwale.isEmpty()) {
//                    Node7 temp = rightwale.peek();
//                    rightwale.pop();
//                    ans.add(temp.data);
//                    if(temp.right!=null) {
//                        leftwale.push(temp.right);
//                    }
//                    if(temp.left!=null);{
//                        rightwa
////                    }
//                }
//            }
//        }
//
//    }
//
//}
