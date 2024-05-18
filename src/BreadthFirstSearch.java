import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<Vertex> extends Search<Vertex>{
    public BreadthFirstSearch(MyGraph<Vertex> graph, Vertex source) {
        super(source);

        bfs(graph, source);
    }

    private void bfs(MyGraph<Vertex> graph, Vertex current) {
        marked.add(current);


        Queue<Vertex> queue = new LinkedList<>();
        queue.add(current); //[0]

        while (!queue.isEmpty()) {
            Vertex v = queue.remove(); // []

            for (Vertex vertex : graph.adjacencyList(v)) {
                if (!marked.contains(vertex)) {
                    marked.add(vertex);
                    edgeTo.put(vertex, v); // {[1,0] [2,0] [3,0] [4 0] [5 1] [6 1] [7 2]}
                    queue.add(vertex); // [1,2,3,4]
                }
            }
        }
    }
}

