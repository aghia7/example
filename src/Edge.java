import java.util.Objects;

public class Edge<Vertex> {
    private Vertex source;
    private Vertex dest;
    private Double weight;

    public Edge(Vertex source, Vertex dest, Double weight) {
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }

    public Edge(Vertex source, Vertex dest) {
        this.source = source;
        this.dest = dest;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getSource() {
        return source;
    }

    public void setDest(Vertex dest) {
        this.dest = dest;
    }

    public Vertex getDest() {
        return dest;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // references compared

        if (o == null || getClass() != o.getClass()) return false;

        Edge<?> otherEdge = (Edge<?>) o;

        return Objects.equals(this.source, otherEdge.source) &&
                Objects.equals(this.dest, otherEdge.dest);
    }
}