import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Gragh {

    ArrayList<Pair<Integer, Integer>> graghArrayList[];

    int NoVertices;
    int NoEdges;
    final int INF=100000000;

    public Gragh(String pathFile) {
        try {
            BufferedReader read = new BufferedReader(new FileReader(pathFile));

            String firstLine = new String();

            if ((firstLine = read.readLine()) != null) {

//                 VE number  of vertices and edges
                String[] VE = firstLine.split(" ");

                if (VE.length != 2) {
                    System.out.println("Error in receiving number  of vertices and edges ");
                }
                try {
                    NoVertices = Integer.parseInt(VE[0]);
                    NoEdges = Integer.parseInt(VE[1]);

                    graghArrayList = new ArrayList[NoVertices];

                    for (int i = 0; i < NoVertices; i++) {

                        graghArrayList[i] = new ArrayList<Pair<Integer, Integer>>();
                    }


                    String line = new String();

                    for (int i = 0; i < NoEdges; i++) {
                        line = read.readLine();
                        VE = line.split(" ");
                        if (Integer.parseInt(VE[0]) > NoVertices || Integer.parseInt(VE[1]) > NoVertices) {
                            System.out.println("vertice's number is greater than maximum number");
                        }
                        graghArrayList[Integer.parseInt(VE[0])].add(new Pair<>(Integer.parseInt(VE[1]), Integer.parseInt(VE[2])));
                    }
//                    for (int i = 0; i < graghArrayList.length; i++) {
//                        System.out.print("Vertex " + i + ": ");
//                        for (Pair<Integer, Integer> pair : graghArrayList[i]) {
//                            System.out.print("(" + pair.v + ", " + pair.w + ") ");
//                        }
//                        System.out.println();
//                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }


        } catch (Exception e) {
            System.out.println(e);

        }
    }


    void Dijkstra(int source, long[] cost, int[] parents) {


        PriorityQueue<Pair<Integer, Integer>> q = new PriorityQueue<>((p1, p2) -> p1.w - p2.w);
        q.add(new Pair(source, 0));
        parents[source] = 0;

        Arrays.fill(cost, Long.MAX_VALUE);
        cost[source] = 0;

        while (!q.isEmpty()) {

            Pair<Integer, Integer> temp = q.poll();

            int weight = temp.w;
            int currVertice = temp.v;

            if (graghArrayList[currVertice].size() == 0) {
                continue;
            }

            for (Pair<Integer, Integer> p : graghArrayList[currVertice]) {
                if ((cost[currVertice]!=Integer.MAX_VALUE)&&(cost[p.v] > (cost[currVertice] + p.w))) {
                    cost[p.v] = (cost[currVertice] + p.w);
                    q.offer(new Pair<>(p.v, p.w));
                    parents[p.v] = currVertice;
                }
            }
        }
//        System.out.println("kkk" + cost[4]);
//        return new int[][]{cost, parents};
    }

//    int[] FloydWarshall() {
//
//    }
//
boolean BellmanFord(int source, long[] cost, int[] parents) {
    Arrays.fill(cost, Integer.MAX_VALUE);
    cost[source] = 0;
    parents[source] = -1;

    for (int i = 1; i < NoVertices; i++) {
        for (int j = 0; j < NoVertices; j++) {
            for (Pair<Integer, Integer> p : graghArrayList[j]) {
                if (cost[j] != Integer.MAX_VALUE && cost[p.v] > cost[j] + p.w) {
                    cost[p.v] = cost[j] + p.w;
                    parents[p.v] = j;
                }
            }
        }
    }

    // Check for negative cycles
    for (int j = 0; j < NoVertices; j++) {
        for (Pair<Integer, Integer> p : graghArrayList[j]) {
            if (cost[j] != Integer.MAX_VALUE && cost[p.v] > cost[j] + p.w) {
                // Negative cycle detected
                return false;
            }
        }
    }


    return true;
}
boolean floydWarshall(long[][] matrix_cost,int predecessors [][]) {
    
    for (int i = 0; i < NoVertices; i++) {
        Arrays.fill(matrix_cost[i], INF);
        Arrays.fill(predecessors[i], -1);
    }
    for (int i = 0; i < graghArrayList.length; i++) {
        
        ArrayList<Pair<Integer, Integer>> list = graghArrayList[i];

        for (Pair<Integer, Integer> pair : list) {

            Integer first=i;
            Integer second = pair.v;
            Integer cost = pair.w;
            matrix_cost[first][second]=cost;
            predecessors[first][second]=first;
        }
    }
   
    long matrix[][] = new long[NoVertices][NoVertices];
    int i, j, k;

    for (i = 0; i < NoVertices; i++)
      for (j = 0; j < NoVertices; j++)
        matrix[i][j] = matrix_cost[i][j];

    for (k = 0; k < NoVertices; k++) {
      for (i = 0; i < NoVertices; i++) {
        for (j = 0; j < NoVertices; j++) {
          if (matrix[i][k] + matrix[k][j] < matrix[i][j])
            matrix[i][j] = matrix[i][k] + matrix[k][j];
            predecessors[i][j]=predecessors[k][j];
        }
      }
    }

    for (int ii = 0; ii < NoVertices; ii++) {
        if (matrix[ii][ii] < 0) {
            return false;
        }
    }
    return true;



}
//
//    int getSize() {
//        return NoVertices;
//    }

}

