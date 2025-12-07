import java.util.*;

static int[][] graph = {
        {1, 3},   // a1 -> a2, a4
        {2, 4},   // a2 -> a3, a5
        {5},      // a3 -> a6
        {},       // a4
        {6},      // a5 -> a7
        {},       // a6
        {7},      // a7 -> a8
        {}        // a8
};

public static void main(String[] args) {
    bfs(0, 7); // start di a1 (0), cari a8 (7)
}

public static void bfs(int start, int target) {
    boolean[] visited = new boolean[graph.length];
    Queue<Integer> queue = new LinkedList<>();

    queue.add(start);
    visited[start] = true;

    System.out.println("BFS dari a" + (start + 1) + " mencari a" + (target + 1));

    while (!queue.isEmpty()) {
        int node = queue.poll();
        System.out.println("Visited: a" + (node + 1));

        if (node == target) {
            System.out.println(">>> FOUND target: a" + (target + 1));
            return;
        }

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                queue.add(neighbor);
                visited[neighbor] = true;
            }
        }
    }

    System.out.println("Target tidak ditemukan");
}

