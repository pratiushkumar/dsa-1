
//class ListDuplicate {
//    Node head;
//
//    class Node {
//        String data;
//        Node next;
//
//        public Node(String data) {
//            this.data = data;
//            this.next =  null;
//        }
//    }
//
//    public void addfirst(String data) {
//        Node newNode = new Node(data);
//        if(head ==null) {
//            head = newNode;
//            return;
//        }
//        newNode.next = head;
//        head=  newNode;
//
//    }
//
//    public void addLast(String data) {
//        Node newNode = new Node(data);
//        if(head ==null) {
//            head = newNode;
//            return;
//        }
//        Node currNode =  head;
//        while(currNode.next!=null) {
//            currNode=currNode.next;
//
//        }
//        currNode.next = newNode;
//    }
//
//    public void Printll(){
//        if(head == null) {
//            System.out.println("List is empty... ");
//            return;
//        }
//        Node currNode =head;
//        while(currNode !=null) {
//        System.out.print(currNode.data + " -> ");
//        currNode= currNode.next;
//        }
//         if(currNode == null) {
//             System.out.println("NULL");
//             return;
//         }
//        System.out.println("NULL");
//    }
//    public void deletefirst() {
//        if(head == null) {
//            System.out.println("List is empty nothing can be deleted ");
//        }
//        head = head.next;
//    }
//
//
//    public void deletelast() {
//        if(head == null)
//        {
//            System.out.println("List is empty nothing can be deleted ");
//        }
//        Node secondlast = head;
//        Node lastNode = head.next;
//        while(lastNode.next != null) {
//            lastNode = lastNode.next;
//            secondlast =secondlast.next;
//
//        }
//        secondlast.next = null;
//
//    }
//
//
//    public static void main(String[] args) {
//ListDuplicate ll = new ListDuplicate();
//ll.addfirst("a");
//ll.addfirst("is");
//ll.addfirst("this");
//ll.addLast("list");
//        ll.Printll();
//        ll.deletelast();
//        ll.Printll();
//
//    }
//}