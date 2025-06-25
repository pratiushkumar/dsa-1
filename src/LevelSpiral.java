import java.util.ArrayList;
import java.util.Stack;

class Node7  {
    int data;
    Node7 left;
    Node7 right;
    Node7() {}
    Node7 (int dalega) {
        this.data = dalega;
        this.left =null;
        this.right =null;

    }
}


public class LevelSpiral {
    public void Levelorder(Node7 root) {
        Stack<Node7> rightwale = new Stack<>();
        Stack<Node7> leftwale = new Stack<>();
        ArrayList<Integer>answe =  new ArrayList<Integer>();
        rightwale.push(root);

        while(!rightwale.isEmpty() || leftwale.isEmpty() ) {
            if(!rightwale.isEmpty()) {
                while(rightwale.isEmpty()) {

                }
            }
        }

    }

}
