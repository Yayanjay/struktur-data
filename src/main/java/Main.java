
static int[][] graph = {
        {1, 3},   // a1 -> a2, a4
        {2, 4},   // a2 -> a3, a5
        {5},      // a3 -> a6
        {},       // a4 (leaf)
        {6},      // a5 -> a7
        {},       // a6 (leaf)
        {7},      // a7 -> a8
        {}        // a8 (leaf)
};

static boolean[] visited = new boolean[8];

public static void main(String[] args) {
    int start = 0; // mulai dari a1 (index 0)
    int target = 7; // cari a8 (index 7)

    System.out.println("DFS dari a1, nyari a8:");
    dfs(start, target);
}

static void dfs(int node, int target) {
    visited[node] = true;

    String namaNode = "a" + (node + 1);
    System.out.println("visited " + namaNode);

    if (node == target) {
        System.out.println("found target " + namaNode);
        return;
    }

    for (int tetangga : graph[node]) {
        if (!visited[tetangga]) {
            dfs(tetangga, target);
        }
    }
}
