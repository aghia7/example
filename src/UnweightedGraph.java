import java.util.*;

public class UnweightedGraph<Vertex> {
    private final boolean undirected;
    private final Map<Vertex, List<Vertex>> map = new HashMap<>();

    public UnweightedGraph() {
        this(true);
    }

    public UnweightedGraph(boolean undirected) {
        this.undirected = undirected;
    }

    public void addVertex(Vertex v) {
        if (hasVertex(v))
            return;

        map.put(v, new LinkedList<>());
    }

    public void addEdge(Vertex source, Vertex dest) {
        if (!hasVertex(source))
            addVertex(source);

        if (!hasVertex(dest))
            addVertex(dest);

        if (hasEdge(source, dest)
                || source.equals(dest))
            return; // reject parallels & self-loops

        map.get(source).add(dest);

        if (undirected)
            map.get(dest).add(source);
    }

    public int getVerticesCount() {
        return map.size();
    }

    public int getEdgesCount() {
        int count = 0;
        for (Vertex v : map.keySet()) {
            count += map.get(v).size();
        }

        if (undirected)
            count /= 2;

        return count;
    }


    public boolean hasVertex(Vertex v) {
        return map.containsKey(v);
    }

    public boolean hasEdge(Vertex source, Vertex dest) {
        if (!hasVertex(source)) return false;
        return map.get(source).contains(dest);
    }

    public List<Vertex> adjacencyList(Vertex v) {
        if (!hasVertex(v)) return null;

        return map.get(v);
    }
}

