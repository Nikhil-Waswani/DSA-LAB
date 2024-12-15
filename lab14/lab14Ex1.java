class lab14Ex1{
    public static void main(String[] args) {
        Graph graph = new Graph(7);
        Graph.Pair pair = graph.new Pair(0,0, 0);
        
        pair.addEdge(0, 1, 2);
        pair.addEdge(0, 2, 2);
        pair.addEdge(0, 3, 2);
        pair.addEdge(1, 3, 2);
        pair.addEdge(2, 0, 2);
        pair.addEdge(2, 1, 2);

        graph.getAllNeighbour();
        

    }
}
