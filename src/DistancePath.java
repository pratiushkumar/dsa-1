import java.util.ArrayList;
import java.util.Scanner;

public class DistancePath {

    static Scanner sc = new Scanner(System.in);
    static {
        System.out.println("enter the number of verices present ");
    }
    static int vrti  = sc.nextInt();

    static  ArrayList<Edge2> yahandoosranam[]= new ArrayList[vrti];
    public static class Edge2 {
        int src;
        int dest;
        public Edge2 (int src,int dest ) {
            this.src=src;
            this.dest=dest;
        }
    }
    public static void Graph3(ArrayList<Edge2> store[])
    {
        for(int i=0;i< store.length;i++) {
            store[i] = new ArrayList<>();
        }
        store[0].add(new Edge2(0,1));
        store[1].add(new Edge2(0,2));
        store[2].add(new Edge2(1,2));
        store[3].add(new Edge2(1,3));
        store[4].add(new Edge2(1,3));
        store[5].add(new Edge2(2,4));
        store[6].add(new Edge2(3,4));

    }

    public static void Graphdfs(ArrayList<Edge2> yahanstorewo[],int curr,boolean visited[]) {
System.out.println("cureent value right now " +curr);
visited[curr] = true;
for(int i=0;i<yahanstorewo[curr].size();i++) {
    Edge2 e2 = yahanstorewo[curr].get(i);
    if(visited[e2.dest]==false) {
        Graphdfs(yahanstorewo,curr,visited);
    }
}
    }
     public static void main(String[] args ) {
//        DistancePath dp = new DistancePath();
         boolean visited[] = new boolean[vrti];
        Graph3(yahandoosranam);
        Graphdfs(yahandoosranam,0,visited);


     }
}
