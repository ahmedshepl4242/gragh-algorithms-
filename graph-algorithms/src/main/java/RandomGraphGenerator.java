import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomGraphGenerator {
    static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        // Generate random number of vertices (between 5 and 20, for example)
        int numVertices = random.nextInt(100000) + 5;
        // Generate random number of edges (between 10 and numVertices*(numVertices-1)/2, for example)
        int maxNumEdges = numVertices * (numVertices - 1) / 2;
        int numEdges = random.nextInt(maxNumEdges - 10) + 10;
        String filename = "a.txt";

        List<Edge> edges = generateRandomEdges(numVertices, numEdges);
        writeGraphToFile(numVertices, edges, filename);
        System.out.println("Graph written to file: " + filename);
    }

   static public List<Edge> generateRandomEdges(int numVertices, int numEdges) {
        List<Edge> edges = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numEdges; i++) {
            int source = random.nextInt(numVertices);
            int destination = random.nextInt(numVertices);
            int weight = random.nextInt(100000) + 1; // Random weight between 1 and 10
            edges.add(new Edge(source, destination, weight));
        }

        return edges;
    }

    public static void writeGraphToFile(int numVertices, List<Edge> edges, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(numVertices + " " + edges.size() + "\n");
            for (Edge edge : edges) {
                writer.write(edge.source + " " + edge.destination + " " + edge.weight + "\n");
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
