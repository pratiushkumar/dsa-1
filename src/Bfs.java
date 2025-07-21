import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bfs {
static class Edge1{
    int src;
    int dest;
   public Edge1(int source,int destination) {
        this.src = source;
        this.dest =destination;
    }
}
public static void CreateGraph(ArrayList<Edge1> Graphnoding[]) {
    for(int i=0;i<Graphnoding.length;i++) {
        Graphnoding[i] =  new ArrayList<>();
    }
    Graphnoding[0].add( new  Edge1(1,5));
    Graphnoding[1].add(new Edge1(1,3));
    Graphnoding[2].add(new Edge1(1,4));
    Graphnoding[3].add(new Edge1(1,2));
    Graphnoding[4].add(new Edge1(2,6));
    Graphnoding[5].add(new Edge1(3,4));
    Graphnoding[6].add(new Edge1(4,5));
}
public static void bfs(ArrayList<Edge1> graph[],int V) {
    Queue<Integer> q = new LinkedList<>();
    boolean vis[] = new boolean[V];
    q.add(0);
    while(!q.isEmpty()) {
        int curr=q.remove();
        if(vis[curr]==false) {
           System.out.print (curr+" ");
           vis[curr] =true;
           for(int i=0;i<graph[curr].size();i++) {
               Edge1 e = graph[curr].get(i);
               q.add(e.dest);
           }
        }
    }
}
public static void main(String[] args) {

    int vertices =10;
//    1--------3
//               \
//                 5
    ArrayList<Edge1> store[] =  new ArrayList[vertices];
    CreateGraph(store);
    bfs(store,vertices);
    System.out.println();
}
}
