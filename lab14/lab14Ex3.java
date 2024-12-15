class lab14Ex3 {
    public static void main(String[] args) {
        Graph graph = new Graph(9);
        Graph.Pair pair = graph.new Pair(0, 0, 0);
        
        pair.addEdge(0, 4, 4);
        pair.addEdge(0, 3, 4);
        pair.addEdge(4, 3, 2);
        pair.addEdge(4, 7, 3);
        pair.addEdge(4, 8, 6);
        pair.addEdge(4, 5, 1);
        pair.addEdge(7, 8, 2);
        pair.addEdge(5, 8, 3);
        

        Graph g= graph.prim(0, 10);

        g.getAllNeighbour();
        

    }

    
}
