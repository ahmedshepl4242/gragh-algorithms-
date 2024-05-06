import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
//            System.out.print("Enter  path");
//            String path = sc.nextLine();

            Gragh g = new Gragh("a.txt");
            Gragh v = new Gragh("a.txt");

            int parent[]=new int[g.NoVertices];
            int cost[] = new int[g.NoVertices];
            System.out.println(" number of nodes is "+g.NoVertices);
            System.out.print(" Enter  the source node:  ");
            int source = sc.nextInt();

            g.Dijkstra(source,cost,parent);
            System.out.println(" shortest path from "  +source+  " to node 1      "+cost[1]);
            System.out.println(" shortest path from"+source+" to node 2      "+cost[2]);
            // System.out.println(" shortest path from"+source+" to node 6       "+cost[6]);
            // System.out.println(" shortest path from"+source+" to node 4       "+cost[4]);
            // System.out.println(" shortest path from"+source+" to node 8       "+cost[8]);
            // System.out.println(" shortest path from"+source+" to node 9       "+cost[9]);


            boolean k= v.BellmanFord(source,cost,parent);

            System.out.println("  ---------------------------------------------------------------------     ");

          if(k){
            System.out.println(" shortest path from "  +source+  " to node 1      "+cost[1]);
            System.out.println(" shortest path from"+source+" to node 2      "+cost[2]);
            // System.out.println(" shortest path from"+source+" to node 8      "+cost[5]);
            // System.out.println(" shortest path from"+source+" to node 9      "+cost[9]);

          }
          else{
            System.out.println(" there is a negative cycles");
          }


//            System.out.println(Arrays.toString(cost) +"  cost ");
//            System.out.println(Arrays.toString(parent)+"  parent ");



//            System.out.println("Enter the   flights:");
//            String edges = sc.nextLine();
//
//            String[] airports = lists.split(", ");
//            String[] flights = edges.split(", ");
//
//
//            int number_vertex = airports.length;
//
//            adjList = new ArrayList[number_vertex];
//
//            dist = new int[number_vertex];
//            Arrays.fill(dist, Integer.MAX_VALUE);
//            vis = new boolean[number_vertex];
//            Arrays.fill(vis, false);
//
//            System.out.println(number_vertex);
//
//            for (int i = 0; i < number_vertex; i++) {
//                adjList[i] = new ArrayList<>();
//                correspond.put(airports[i], i);
//            }
//            int number_edges = flights.length;
//            System.out.println(number_edges);
//            System.out.println("The distance for each flight (in miles)");
//
//            for (int i = 0; i < number_edges; i++) {
//                System.out.print(flights[i] + ": ");
//                int weight = sc.nextInt();
//                String[] e = flights[i].split("-");
//                adjList[correspond.get(e[0])].add(new Pair<>(weight, e[1]));
//                adjList[correspond.get(e[1])].add(new Pair<>(weight, e[0]));
//            }
//            String sourcePrev = "";
//            path = new String[number_vertex];
//            while (true) {
//
//                System.out.print("Enter source airport:");
//                String source = sc.next();
//                if (!source.equalsIgnoreCase(sourcePrev)) {
//                    Arrays.fill(vis, false);
//                    Arrays.fill(dist, Integer.MAX_VALUE);
//                    Dijkstra_Algorithm(source);
//                }
//                sourcePrev = source;
//
//
//                System.out.print("Enter destination airport:");
//                String distenation = sc.next();
//                System.out.println("the Path is : " + path[correspond.get(distenation)]);
//                System.out.println("Total distance:  " + dist[correspond.get(distenation)]);
//
//
//                int fl;
//                System.out.println("Exit 0");
//                System.out.println("continue 1");
//                fl = sc.nextInt();
//                if (fl == 0) {
//                    break;
//                }
//                System.out.println("---------------------------------------------------");
//                sc.nextLine();
//            }
//
//            correspond.clear();
//            adjList = null;
//            sc.nextLine();

        }
    }
}
