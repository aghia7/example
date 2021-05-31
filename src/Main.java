public class Main {




    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>(true);

        graph.addEdge("Almaty", "Astana", 2.1);
        graph.addEdge("Almaty", "Shymkent", 7.2);
        graph.addEdge("Shymkent", "Astana", 3.9);
        graph.addEdge("Astana", "Kostanay", 3.5);
        graph.addEdge("Shymkent", "Kyzylorda", 5.4);

        System.out.println("Dijkstra:");
        Search<String> djk = new DijkstraSearch<>(graph, "Almaty");
        outputPath(djk, "Kyzylorda");

//        System.out.println("DFS:");
//        Search<String> dfs = new DepthFirstSearch<>(graph, "Almaty");
//        outputPath(dfs, "Kyzylorda");
//
//        System.out.println("\n--------------------------------");
//
//        System.out.println("BFS:");
//        Search<String> bfs = new BreadthFirstSearch<>(graph, "Almaty");
//        outputPath(bfs, "Kyzylorda");
    }

    public static void outputPath(Search<String> search, String key) {
        for (String v : search.pathTo(key)) {
            System.out.print(v + " -> ");
        }
    }
}

