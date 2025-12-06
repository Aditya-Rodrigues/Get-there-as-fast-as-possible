import java.util.*;

public class Dijkstra {

    public static int shortestPath(Map<Integer, List<Integer>> graph, int start, int end) {

        if (!graph.containsKey(start) || !graph.containsKey(end)) {
            return -1;
        }

        Map<Integer, Integer> dist = new HashMap<>();
        for (int n : graph.keySet()) {
            dist.put(n, Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{start, 0});
        dist.put(start, 0);

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0];
            int d = cur[1];

            if (node == end) return d;
            if (d > dist.get(node)) continue;

            for (int next : graph.get(node)) {
                int nd = d + 1;
                if (nd < dist.get(next)) {
                    dist.put(next, nd);
                    pq.add(new int[]{next, nd});
                }
            }
        }

        return -1;
    }
}
