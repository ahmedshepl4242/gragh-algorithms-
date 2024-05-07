import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class bellmanTest {
    @Test
    void negative() {
        Gragh v = new Gragh("D:\\projects year 2\\semster 2\\labs DS2\\graph-algorithms\\src\\test\\java\\graph_with_negative_cycle.txt");
        int parent[]=new int[v.NoVertices];
        int cost[] = new int[v.NoVertices];
        int source = 0;
        boolean result= v.BellmanFord(source,cost,parent);
        assertFalse(result);
    }
    @Test
    void testBellmanFord_NoNegativeCycle_ValidShortestPath() {
        Gragh graph = new Gragh("D:\\projects year 2\\semster 2\\labs DS2\\graph-algorithms\\src\\test\\java\\graph.txt");
        int source = 0;
        int[] cost = new int[graph.NoVertices];
        int[] parents = new int[graph.NoVertices];

        boolean result = graph.BellmanFord(source, cost, parents);

        assertTrue(result);

        // Assertions for the expected results based on the given graph
        assertEquals(0, cost[0]);
        assertEquals(1, cost[1]);
        assertEquals(3, cost[2]);
        assertEquals(4, cost[3]);
        assertEquals(6, cost[4]);

        assertEquals(-1, parents[0]);
        assertEquals(0, parents[1]);
        assertEquals(1, parents[2]);
        assertEquals(2, parents[3]);
        assertEquals(3, parents[4]);
    }
    @Test
    void testBellmanFord_NegativeWeightEdge() {
        Gragh graph = new Gragh("D:\\projects year 2\\semster 2\\labs DS2\\graph-algorithms\\src\\test\\java\\graph_with_negative_weight_edge.txt");
        int source = 0;
        int[] cost = new int[graph.NoVertices];
        int[] parents = new int[graph.NoVertices];

        boolean result = graph.BellmanFord(source, cost, parents);

        assertTrue(result);

        // Assertions for the expected results based on the given graph
        assertEquals(0, cost[0]);
        assertEquals(-1, cost[1]);
        assertEquals(2, cost[2]);
        assertEquals(0, cost[3]);
        assertEquals(-4, cost[4]);

        assertEquals(-1, parents[0]);
        assertEquals(0, parents[1]);
        assertEquals(0, parents[2]);
        assertEquals(2, parents[3]);
        assertEquals(3, parents[4]);
    }
    @Test
    void testBellmanFord_SingleVertexGraph() {
        Gragh graph = new Gragh("D:\\projects year 2\\semster 2\\labs DS2\\graph-algorithms\\src\\test\\java\\single_vertex_graph.txt");
        int source = 0;
        int[] cost = new int[graph.NoVertices];
        int[] parents = new int[graph.NoVertices];

        boolean result = graph.BellmanFord(source, cost, parents);

        assertTrue(result);

        // Assertions for the expected results based on the given graph
        assertEquals(0, cost[0]);
        assertEquals(-1, parents[0]);
    }
    @Test
    void testBellmanFord_NoNegativeCycle_UnreachableVertex() {
        Gragh graph = new Gragh("D:\\projects year 2\\semster 2\\labs DS2\\graph-algorithms\\src\\test\\java\\graph_unreachable_vertex.txt");
        int source = 0;
        int[] cost = new int[graph.NoVertices];
        int[] parents = new int[graph.NoVertices];

        boolean result = graph.BellmanFord(source, cost, parents);

        assertTrue(result);

        // Assertions for the expected results based on the given graph
        assertEquals(0, cost[0]);
        assertEquals(1, cost[1]);
        assertEquals(3, cost[2]);
        assertEquals(4, cost[3]);
        assertEquals(6, cost[4]);

        assertEquals(-1, parents[0]);
        assertEquals(0, parents[1]);
        assertEquals(1, parents[2]);
        assertEquals(2, parents[3]);
        assertEquals(3, parents[4]);
    }
}