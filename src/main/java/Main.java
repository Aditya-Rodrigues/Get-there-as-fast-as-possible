public class Main {
    public static void main(String[] args) {

        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 5);
        g.addEdge(2, 4);
        g.addEdge(4, 3);
        g.addEdge(3, 5);

        System.out.println("Starting Node    Ending Node    Output");

        printRow(g, 1, 2);
        printRow(g, 1, 5);
        printRow(g, 2, 5);
        printRow(g, 5, 1);
        printRow(g, 2, 1);
    }

    private static void printRow(Graph g, int start, int end) {
        int result = Dijkstra.shortestPath(g.getGraph(), start, end);
        System.out.printf("%-16d %-14d %d%n", start, end, result);
    }
}