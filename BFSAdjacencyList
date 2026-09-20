
import java.util.*;
class Main {

        static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");

        List<List<Integer>> adjList = new ArrayList<>();

         int V = 8;

        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }

        addEdge(adjList,1,4);
        addEdge(adjList,1,5);
        addEdge(adjList,1,2);
        addEdge(adjList,2,7);
        addEdge(adjList,2,6);
        addEdge(adjList,2,3);

        
    //BFS
        //int maxVertices = adjList.size();
        Queue<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean [V];
        List<Integer> vertices = new ArrayList<>();
        
        q.add(1);
        visited[1]=true;

        while(!q.isEmpty()){
            int v = q.poll();
            //visited[v+1]=true;
            vertices.add(v);


            for(int x : adjList.get(v)){
                if(!visited[x]){
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
        System.out.println("Graph Inorder : " + vertices);
    }
}
