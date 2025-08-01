import java.util.ArrayList;
import java.util.PriorityQueue;

public class Djikstra {
    static class Edging {
        int src;
        int dest;
        int weight;

        public Edging(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void graphmethod(ArrayList<Edging> graphing[]) {
        for (int i = 0; i < graphing.length; i++) {
            graphing[i] = new ArrayList<Edging>();
        }
        graphing[0].add(new Edging(0, 1, 5));
        graphing[1].add(new Edging(0, 2, 4));
        graphing[2].add(new Edging(1, 2, 4));
        graphing[3].add(new Edging(1, 3, 5));
        graphing[4].add(new Edging(2, 5, 8));
        graphing[5].add(new Edging(3, 5, 4));
        graphing[6].add(new Edging(5, 4, 7));
        graphing[7].add(new Edging(4, 5, 2));

    }

    public static class Pair implements Comparable<Pair> {
        int node;
        int distance;

        public Pair(int n, int d) {
            this.node = n;
            this.distance = d;
        }

        @Override
        public int compareTo(Pair po) {
            return this.distance - po.distance; //ascending
        }
    }

    public static int[] Djikstramethod(ArrayList<Edging>[] graphing, int src, int V) {
        PriorityQueue<Pair> queva = new PriorityQueue();
        int dist[] = new int[V];
        boolean vis[] = new boolean[graphing.length];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }


        queva.add(new Pair(0, 0));
        while (!queva.isEmpty()) {
            Pair curr = queva.remove();
            if (!vis[curr.node]) {
                vis[curr.node] = true;

                for (int i = 0; i < graphing[curr.node].size(); i++) {
                    Edging e = graphing[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;
                    if (!vis[v] && dist[u] + e.weight < dist[v]) {
                        dist[v] = dist[u] + e.weight;
                        queva.add(new Pair(V,dist[V]));
                }
            }
        }
    }
    return dist;
}
    public static void main(String[] args) {
        int  Vertexing = 8;
        ArrayList<Djikstra.Edging> graphing[] =  new ArrayList[Vertexing];
        Djikstra.graphmethod(graphing);
    }
}
