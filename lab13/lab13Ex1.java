import java.util.*;

class lab13Ex1 {
    public static void main(String args[]){
        Graph graph = new Graph(4);
        Graph.Edge edge = graph.new Edge();
    
        edge.addEdge(0,1);
        edge.addEdge(0,2);
        edge.addEdge(0,3);
        edge.addEdge(2,0);
        edge.addEdge(2,1);
        edge.addEdge(1,3);
    
        
        edge.findAllCircle(2, 3, new boolean[4], new ArrayList<>());
        edge.getAllNeighbour();

       
    }    
}


class Graph {
    int numVertices;
    ArrayList<ArrayList<Edge>> adjacencyList;

    Graph(int numVertics){
        this.numVertices = numVertics;

        adjacencyList = new ArrayList<>();
        for(int i=0; i<numVertics; i++){

            adjacencyList.add(new ArrayList<>() );
        
        }
    }

    void BFS(int startVertex){
        boolean flag[] = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startVertex);
        while(!queue.isEmpty()){
            int curr = queue.remove();
            if(flag[curr] != true){
                System.out.print(curr + " ");
                flag[curr] = true;

                for(int i=0; i<adjacencyList.get(curr).size(); i++){
                    queue.add(adjacencyList.get(curr).get(i).dest);
                }
            }
        }
    }

    void DFS(int startVertex, boolean vis[]){
        if(vis[startVertex] == true){
            return;
        }else{
            System.err.print(startVertex + " ");
            vis[startVertex] = true;

            for(int i=0; i<adjacencyList.get(startVertex).size(); i++){
                DFS(adjacencyList.get(startVertex).get(i).dest, vis);
            }
        }
    }

 
 class Edge{
 int source;
 int dest;

 public void addEdge(int source, int dest) {
    Edge edge = new Edge();
    edge.source = source;
    edge.dest = dest;
   
    adjacencyList.get(source).add(edge); 
    
 }
 
 public void getAllNeighbour() {
    for(int i=0; i<adjacencyList.size(); i++){
        System.out.print(i + " has edge with ");

        for(int j=0; j<adjacencyList.get(i).size(); j++){
            System.out.print(adjacencyList.get(i).get(j).dest + " ");
        }
        System.err.println();
    }
 }

 void findAllCircle(int start, int end, boolean vis[], ArrayList<Integer> path){

    if(start == end){
        path.add(start);
        System.out.println(path);
        path.remove(path.size()-1);
        vis[start] = false;
        return;
    }

    else{ 
        for(int i=0; i<adjacencyList.get(start).size(); i++){
            int temp = adjacencyList.get(start).get(i).dest;
            if(vis[temp] != true){
                path.add(start);
        vis[start] = true;
                findAllCircle(temp, end, vis, path);
                path.remove(path.size()-1);
                vis[temp] = false;
            }
        }
    }
 }
}
}