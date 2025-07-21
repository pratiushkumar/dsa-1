import java.util.ArrayList;
import java.util.Scanner;

public class ClassRoom {
    static class Edge  {
        int src;
        int dest;
        int weight;

        public Edge (int sr ,int de,int wt) {
            this.src = sr;
            this.dest = de;
            this.weight = wt;
        }
    }
    public static void createGraph(ArrayList<Edge>graph[]) {
        for(int i=0;i<graph.length;i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(0,4,5));
        graph[2].add(new Edge(1,4,7));
        graph[3].add(new Edge(1,5,8));
        graph[4].add(new Edge(3,1,2));

    }
    public static void main(String[] args ) {
        System.out.println("enter the number of Vertices ");
        Scanner sc =  new Scanner(System.in);
        int vertices  = sc.nextInt();
        ArrayList<Edge> graph1[]= new ArrayList[vertices];
        createGraph(graph1);

        //print 2's neighbour
        for(int i=0; i<graph1[2].size(); i++) {
            Edge e = graph1[2].get(i);
            System.out.println();
        }
    }

}