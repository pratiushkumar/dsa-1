class Node1 {
    int data;
    Node1 left;
    Node1 right;

    Node1() {}
    Node1(int value) {
        this.data =value;
        this.left=null;
        this.right=null;
    }
}
public class CountNode {
    public void total(Node1 root,int count) {
        count++;

        if(root.left != null) {
            total(root, count);
        }
        if(root.right !=  null) {
            total(root,count);
        }
    }
    public static void main (String[] args) {
        Node1 top =  new Node1(20);

        CountNode nc  =new CountNode();

    }
}
