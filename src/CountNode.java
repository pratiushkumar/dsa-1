//class Node1 {
//    int data;
//    Node1 left;
//    Node1 right;
//
//    Node1() {}
//    Node1(int value) {
//        this.data =value;
//        this.left=null;
//        this.right=null;
//    }
//}
//public class CountNode {
//    public void total(Node1 root,int count) {
//
//        count++;
//        System.out.println("this is the count : "+count);
//
//        if(root.left != null) {
//            total(root, count);
//        }
//        if(root.right !=  null) {
//            total(root,count);
//        }
//    }
//    public static void main (String[] args) {
//        int count;
//        Node1 top =  new Node1(20);
//        top.left = new Node1(10);
//        top.right = new Node1(20);
//        top.left.left =new Node1(30);
//        top.left.left.left = new Node1(60) ;
//        top.right.right = new Node1(50);
//        CountNode nc  =new CountNode();
//
//        CountNode cn = new CountNode();
//        cn.total(top,count);
//
//    }
//}
