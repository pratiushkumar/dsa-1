// class ReverseLL {
//    Node head;
//    class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//
//        }
//        public void adddata(int data) {
//        Node newnode  =  new Node(data);
//        if(head ==null) {
//            head =  newnode;
//            return;
//        }
//        }
//public void reverseIterate() {
//        if(head == null || head.next == null) {
//            return;
//        }
//        Node prevNode = head;
//        Node currNode =head.next;
//        while(currNode != null) {
//            Node nextNode=currNode.next;
//            currNode.next =prevNode;
//
//            //update
//            prevNode =currNode;
//            currNode =nextNode;
//        }
//        head.next = null
//}
//        public static void main(String[] ars ) {
//
//        ReverseLL  obj  = new ReverseLL();
//
//    }
//    }
//
