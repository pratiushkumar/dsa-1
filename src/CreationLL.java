import java.util.LinkedList;

public class CreationLL {
    public static void main(String[] args ) {
        LinkedList<String> lobber  = new LinkedList<String>();

        lobber.addFirst("we");
        lobber.addFirst("here");
//        System.out.println(lobber);
        lobber.addLast("Go");
        lobber.addLast("again");
        System.out.println(lobber);
        System.out.println(lobber.size());
        for(int i =0;i<lobber.size();i++){
            System.out.println(lobber.get(i));
        }
        System.out.println(lobber.removeFirst());
        System.out.println(lobber);



    }
}
