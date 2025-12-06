public class Main {

    public static void main(String[] args) {

        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 5);
        g.addEdge(2, 4);
        g.addEdge(4, 3);
        g.addEdge(3, 5);

        System.out.println(Dijkstra.shortestPath(g.getGraph(), 1, 2));
        System.out.println(Dijkstra.shortestPath(g.getGraph(), 1, 5));
        System.out.println(Dijkstra.shortestPath(g.getGraph(), 2, 5));
        System.out.println(Dijkstra.shortestPath(g.getGraph(), 5, 1));
    }
}
