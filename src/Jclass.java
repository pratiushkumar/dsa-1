public class Jclass<T> {
    Node head;
    Node second;
    class Node {
        T data;
        Node next;

        Node() {
            data =  null;
            next = null;
        }
        Node(T data) {
            data = data;
            next =  null;
        }
    }
    public void insertFront(T data) {
        Node newNode =  new Node(data);
        newNode.next =this.head.next;

        //MAKE THE NEW NODE AS THE FIRST NODE
        this.head.next = newNode;
    }
    Jclass () {
        head =  new Node();
        second  = new Node();
    }
    public static void main(String[] args) {

    }
}
