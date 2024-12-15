import java.util.*;
class Graph {
    int numVertices;
    ArrayList<Pair> graph[];
    
    @SuppressWarnings("unchecked")
    Graph(int numVertices){
        this.numVertices = numVertices;
        graph = new ArrayList[numVertices];
           
        for (int i = 0; i < numVertices; i++){
            graph[i] = new ArrayList<>();
        }
    }

    void BST(int startVertis){
        boolean vis[] = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertis);
        
        while(!queue.isEmpty()){
            int curr = queue.remove();
            System.out.print(curr + " ");
            vis[curr] = true;
            for(int i=0; i<graph[curr].size(); i++){
                if(vis[graph[curr].get(i).node] != true)
                queue.add(graph[curr].get(i).node);
                vis[graph[curr].get(i).node] =true;
            }
        }
    }

    void DST(int startVertis, boolean[] visited){
        if(visited[startVertis] == false){
            System.out.print(startVertis + " ");
            visited[startVertis] = true;
            for(int i=0; i<graph[startVertis].size(); i++){
                int next = graph[startVertis].get(i).node;
                DST(next, visited);
            }
        }
    }

    void getAllPath(int startVertis, int dest, boolean[] visited, ArrayList<Integer> path){
        if(startVertis == dest){
            path.add(startVertis);
            System.out.println(path);
            return;
        }
        if(visited[startVertis] == false){
            path.add(startVertis);
            visited[startVertis] = true;
            for(int i=0; i<graph[startVertis].size(); i++){
                int next = graph[startVertis].get(i).node;
                getAllPath(next, dest, visited, path);
                path.remove(path.size()-1);
                visited[startVertis] = false;
            }
        }
    }

    void Dijkstra(int startVertis){
        boolean vis[] = new boolean[numVertices];
        PeriorityQueue pq = new PeriorityQueue();

        int weight[] = new int[numVertices];

        for(int i=0; i<weight.length; i++){
            weight[i] = Integer.MAX_VALUE;
        }

        weight[startVertis] = 0;
        pq.enqueue(new Graph.Pair(startVertis, startVertis, 0));

        while(pq.head != null){
            Graph.Pair curr = pq.dequeue();
            
            if(!vis[curr.node]) {
                vis[curr.node] = true;
                for(int i=0; i<graph[curr.node].size(); i++) {
                      Pair p = graph[curr.node].get(i);
    
            if(vis[p.node]!=true && weight[curr.node]+p.weight < weight[p.node]) {
            weight[p.node] = weight[curr.node] + p.weight;
            pq.enqueue(graph[curr.node].get(i));
            }
        }
    }
        }

    }
    
    Graph prim(int startVertis, int graphSize){
        PeriorityQueue pq = new PeriorityQueue();
        boolean visited[] = new boolean[numVertices]; 
        pq.enqueue(new Pair(startVertis, startVertis, 0));
        visited[startVertis] = true;
        Graph g = new Graph(graphSize+1);
        Graph.Pair newGraph = g.new Pair(0, 0, 0);
        Graph.Pair curr = pq.dequeue();

        for(int j=1; j<6; j++){
            visited[curr.node]=true;

            for(int i=0; i<graph[curr.node].size(); i++){
                if(visited[graph[curr.node].get(i).node] == false)
                pq.enqueue(graph[curr.node].get(i));
            }

            Graph.Pair temp = pq.dequeue();
            int source = temp.source;
            int dest = temp.node;
            int cost = temp.weight;

            newGraph.addEdge(source, dest, cost);
            curr = temp;
            
        }
                  
        

        return g;
    }

    void getAllNeighbour() {
        for(int i=0; i<graph.length; i++){
            if(graph[i].size() ==0){
                continue;
            }
            System.out.print(i + " has connection with ");
            for(int j=0; j<graph[i].size(); j++){
                System.out.print(graph[i].get(j).node);
            }
            System.out.println();
        }
    }
        
    class Pair implements Comparable<Pair>{
        int source;
        int node;
        int weight;
    
        Pair(int source, int node, int cost){
            this.source = source;
            this.node = node;
            this.weight = cost;
        }
        @Override public int compareTo(Pair node){
            return this.weight-node.weight;
        }
    
        void addEdge(int source, int dest, int weight) {
            graph[source].add(new Pair(source, dest,weight));
            graph[dest].add(new Pair(dest, source ,weight));
            
        }
        
        
    }}
    