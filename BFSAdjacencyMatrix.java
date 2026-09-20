
import java.util.*;
class Main {

    static void addEdge(int[][] adj, int u, int v) {
        adj[u][v]=1;
        adj[v][u]=1;
    }
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");

        int V=8;
        int [][] adjMatrix = new int[V][V];

        // for(int i =0;i<V;i++){
        //     for(int j=0;j<V;j++){
        //         adjMatrix[i][j]=0;
        //     }
        // }

        addEdge(adjMatrix,1,2);
        addEdge(adjMatrix,1,4);
        addEdge(adjMatrix,1,5);
        addEdge(adjMatrix,2,3);
        addEdge(adjMatrix,2,6);
        addEdge(adjMatrix,2,7);
        
        //BFS
        
        boolean [] visited = new boolean[V];
        List<Integer> vertices = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        visited[1]=true;

        while(!q.isEmpty()){
            int v = q.poll();
            vertices.add(v);

            for(int i =0;i<V;i++){
                if(adjMatrix[v][i]==1){
                    if(!visited[i]){
                        q.add(i);
                        visited[i]=true;
                    }
                }              
            }
        }

        
       
        System.out.println("Graph Inorder : " + vertices);
    }
}
