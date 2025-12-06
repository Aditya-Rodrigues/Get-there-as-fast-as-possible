import java.util.*;

public class Graph {

    private Map<Integer, List<Integer>> adj = new HashMap<>();

    public void addEdge(int from, int to) {
        adj.putIfAbsent(from, new ArrayList<>());
        adj.putIfAbsent(to, new ArrayList<>());
        adj.get(from).add(to);
    }

    public Map<Integer, List<Integer>> getGraph() {
        return adj;
    }
}
