import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Scanner;

public class findpath {
    static class Edge3 {
       int src;
       int dest;
       public Edge3(int source,int destination) {
           this.src = source;
           this.dest = destination;
       }
    }
    public static  void creatuGraph(ArrayList<Edge3>storearr[]) {
        for (int i = 0; i < storearr.length; i++) {
            storearr[i] = new ArrayList<>();
        }
        storearr[0].add(new Edge3(0, 1));
        storearr[0].add(new Edge3(0, 2));
        storearr[1].add(new Edge3(1, 3));
        storearr[1].add(new Edge3(1, 5));
        storearr[2].add(new Edge3(2, 3));
        storearr[2].add(new Edge3(2, 4));
        storearr[3].add(new Edge3(3, 5));
        storearr[4].add(new Edge3(4, 5));

    }

    public static void printallpaths(ArrayList<Edge3> stoe[], int sourcea ,int target,String path,boolean visitor[])  {
        //BASE CASE
        if(sourcea == target) {
            System.out.println(path);
        }
        for(int i=0;i<stoe[sourcea].size();i++) {
            Edge3 e = stoe[sourcea].get(i);
            if(!visitor[e.dest]) {
                visitor[e.dest] =true;
                printallpaths(stoe,e.dest,target,path+ "->"+e.dest,visitor);
                visitor[e.dest]=false;
            }
        }
    }
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter th value ");
int vortx =sc.nextInt();
ArrayList<Edge3> storearr[] = new ArrayList[vortx];
creatuGraph(storearr);
int sourcea =0;
int target =5;
        boolean vis[] = new boolean[vortx];
        vis[sourcea] = true ;
        printallpaths(storearr,sourcea,target,""+sourcea,vis);
    }
}
