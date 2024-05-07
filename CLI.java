//import java.io.*;
//import java.util.Scanner;
//
//public class CLI {
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String filePath;
//        Gragh graph;
//
//        System.out.print("Enter graph file path: ");
//        while (true) {
//            try {
//                filePath = scanner.nextLine();
//                graph = new Gragh(filePath);
//                break;
//            } catch (Exception e) {
//                System.out.print("Invalid file path, please renter the path: ");
//            }
//        }
//        mainMenu(scanner, graph);
//    }
//
//    private static void main(){
//        System.out.println("\n1. Find shortest paths from source node to all other nodes");
//        System.out.println("2. Find shortest paths between all pairs of nodes");
//        System.out.println("3. Check if the graph contains a negative cycle");
//        System.out.println("4. Exit");
//        System.out.println();
//    }
//
//    private static void subMain1_2(){
//        System.out.println("\nChoose an algorithm:");
//        System.out.println("1. Dijkstra's Algorithm");
//        System.out.println("2. Bellman-Ford Algorithm");
//        System.out.println("3. Floyd-Warshall Algorithm");
//        System.out.println("4- exit");
//        System.out.println();
//    }
//    private static void subMain3() {
//        System.out.println("\n1. Bellman-Ford Algorithm");
//        System.out.println("2. Floyd-Warshall Algorithm");
//        System.out.println("3. Exit");
//        System.out.println();
//    }
//    private static void mainMenu(Scanner sc, Gragh g){
//        int op;
//
//        while (true) {
//            main();
//
//            System.out.print("Enter option number: ");
//            op = sc.nextInt();
//
//            switch (op) {
//                case 1:
//                    Menu1(sc, g);
//                    break;
//                case 2:
//                    Menu2(sc, g);
//                    break;
//                case 3:
//                    Menu3(sc, g);
//                    break;
//                case 4:
//                    return;
//                default:
//                    System.out.println("Invalid option number");
//            }
//            System.out.println();
//        }
//    }
//
//    private static void Menu1(Scanner sc, Gragh g){
//        int op, src, dis, algorithm;
//
//        subMain1_2();
//        while (true) {
//            System.out.print("Select an algorithm: ");
//            algorithm = sc.nextInt();
//
//            src = -1;
//            System.out.print("Select a source node: ");
//            src = sc.nextInt();
//
//
//            switch (algorithm) {
//                case 1:
//                    int[] dijCosts = new int[g.size()];
//                    int[] dijParents = new int[g.size()];
//                    g.Dijkstra(src, dijCosts, dijParents);
//
//                    System.out.print("Choose destination node: ");
//                    dis = sc.nextInt();
//                    System.out.print("Choose 1 for path cost, 2 for shortest path: ");
//                    op = sc.nextInt();
//
//                    if (op == 1)
//                        System.out.println(dijCosts[dis]);
//                    else if (op == 2)
//                        /////////////////////////////////////////////////////////// print dijkstra path
//                    else
//                        System.out.println("Invalid option number");
//                    break;
//                case 2:
//                    int[] bellCosts = new int[g.size()];
//                    int[] bellParents = new int[g.size()];
//                    g.BellmanFord(src, bellCosts, bellParents);
//
//                    System.out.print("Choose destination node: ");
//                    dis = sc.nextInt();
//                    System.out.print("Choose 1 for path cost, 2 for shortest path: ");
//                    op = sc.nextInt();
//
//                    if (op == 1)
//                        System.out.println(bellCosts[dis]);
//                    else if (op == 2)
//                        /////////////////////////////////////////////////////////// print bellman path
//                    else
//                        System.out.println("Invalid option number");
//                    break;
//                case 3:
//                    int[][] floydCosts = new int[g.size()][g.size()];
//                    int[][] floydParents = new int[g.size()][g.size()];
//                    g.floydWarshall(floydCosts, floydParents);
//
//                    System.out.print("Choose destination node: ");
//                    dis = sc.nextInt();
//                    System.out.print("Choose 1 for path cost, 2 for shortest path: ");
//                    op = sc.nextInt();
//
//                    if (op == 1)
//                        System.out.println(floydCosts[src][dis]);
//                    else if (op == 2)
//                        ///////////////////////////////////////////////////////////// print floyd path
//                    else
//                        System.out.println("Invalid option number");
//                    break;
//                case 4:
//                    return;
//                default:
//                    System.out.println("Invalid option number");
//            }
//            System.out.println();
//        }
//    }
//
//    private static void Menu2(Scanner sc, Gragh g){
//        int op, src, dis, algorithm;
//
//        subMain1_2();
//        while (true) {
//            System.out.print("Select an algorithm: ");
//            algorithm = sc.nextInt();
//
//            switch (algorithm) {
//                case 1:
//                    int[][] dijCosts = new int[g.size()][g.size()];
//                    int[][] dijParents = new int[g.size()][g.size()];
//                    for (int i = 0; i < g.size(); i++)
//                        g.Dijkstra(i, dijCosts[i], dijParents[i]);
//
//                    while (true) {
//                        System.out.print("Choose 1 for path cost, 2 for shortest path, 3 for exit: ");
//                        op = sc.nextInt();
//
//                        if (op == 1) {
//                            System.out.print("Choose source node: ");
//                            src = sc.nextInt();
//                            System.out.print("Choose destination node: ");
//                            dis = sc.nextInt();
//                            System.out.println(dijCosts[src][dis]);
//                        } else if (op == 2){
//                            System.out.print("Choose source node: ");
//                            src = sc.nextInt();
//                            System.out.print("Choose destination node: ");
//                            dis = sc.nextInt();
//                            /////////////////////////////////////////////////////////// print dijkstra path
//                        } else if (op == 3)
//                            return;
//                        else
//                            System.out.println("Invalid option number");
//                        System.out.println();
//                    }
//                case 2:
//                    int[][] bellCosts = new int[g.size()][g.size()];
//                    int[][] bellParents = new int[g.size()][g.size()];
//                    for (int i = 0; i < g.size(); i++)
//                        g.BellmanFord(i, bellCosts[i], bellParents[i]);
//
//                    while (true) {
//                        System.out.print("Choose 1 for path cost, 2 for shortest path, 3 for exit: ");
//                        op = sc.nextInt();
//
//                        if (op == 1) {
//                            System.out.print("Choose source node: ");
//                            src = sc.nextInt();
//                            System.out.print("Choose destination node: ");
//                            dis = sc.nextInt();
//                            System.out.println(bellCosts[src][dis]);
//                        } else if (op == 2) {
//                            System.out.print("Choose source node: ");
//                            src = sc.nextInt();
//                            System.out.print("Choose destination node: ");
//                            dis = sc.nextInt();
//                            /////////////////////////////////////////////////////print bellman path
//                        } else if (op == 3)
//                            return;
//                        else
//                            System.out.println("Invalid option number");
//                        System.out.println();
//                    }
//                case 3:
//                    int[][] floydCosts = new int[g.size()][g.size()];
//                    int[][] floydParents = new int[g.size()][g.size()];
//                    g.floydWarshall(floydCosts, floydParents);
//
//                    while (true) {
//                        System.out.print("Choose 1 for path cost, 2 for shortest path, 3 for exit: ");
//                        op = sc.nextInt();
//
//                        if (op == 1) {
//                            System.out.print("Choose source node: ");
//                            src = sc.nextInt();
//                            System.out.print("Choose destination node: ");
//                            dis = sc.nextInt();
//                            System.out.println(floydCosts[src][dis]);
//                        } else if (op == 2) {
//                            System.out.print("Choose source node: ");
//                            src = sc.nextInt();
//                            System.out.print("Choose destination node: ");
//                            dis = sc.nextInt();
//                            /////////////////////////////////////////////////////print floyd path
//                        } else if (op == 3)
//                            return;
//                        else
//                            System.out.println("Invalid option number");
//                        System.out.println();
//                    }
//                case 4:
//                    return;
//                default:
//                    System.out.println("Invalid option number");
//            }
//            System.out.println();
//        }
//    }
//
//    private static void Menu3(Scanner sc, Gragh g){
//        int algorithm;
//
//        subMain3();
//        while (true) {
//            System.out.print("Select an algorithm: ");
//            algorithm = sc.nextInt();
//
//            switch (algorithm) {
//                case 1:
//                    int[] bellCosts = new int[g.size()];
//                    int[] bellParents = new int[g.size()];
//                    if (g.BellmanFord(0, bellCosts, bellParents))
//                        System.out.println("There is negative cycle!");
//                    else
//                        System.out.println("No negative cycles");
//                    break;
//                case 2:
//                    int[][] floydCosts = new int[g.size()][g.size()];
//                    int[][] floydParents = new int[g.size()][g.size()];
//                    if (g.floydWarshall(floydCosts, floydParents))
//                        System.out.println("There is negative cycle!");
//                    else
//                        System.out.println("No negative cycles");
//                    break;
//                case 3:
//                    return;
//                default:
//                    System.out.println("Invalid option number");
//            }
//            System.out.println();
//        }
//    }
//}