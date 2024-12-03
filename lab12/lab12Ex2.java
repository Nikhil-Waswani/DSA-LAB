class lab12Ex2 {
    public static void main(String args[]){
        GraphUsingMatrix g = new GraphUsingMatrix(4);

        g.addEdge(1,3);
        g.addEdge(3,2);
        g.addEdge(2,1);

        g.printGraph();
    }
}

class GraphUsingMatrix{
    int graph[][];
    
    GraphUsingMatrix(int vertics){
        graph = new int[vertics][vertics];
    }

    public void addEdge(int source, int destination) {
        if(source < graph.length && destination < graph.length){
            graph[source][destination] = 1;
            graph[destination][source] = 1;
        }
    }
    
    public void printGraph() {
        if(graph.length > 0){
            for(int i=0; i<graph.length; i++){
                for(int j=0; j<graph[i].length; j++){
                    if(graph[i][j] == 1){
                        System.out.println(i + " has edge with " + j);
                    }
                }
            }
        }
       
        }

}

