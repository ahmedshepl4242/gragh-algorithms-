import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FloydTest {

    public void readFromOutFile(String path, long cost[][], int n,int source) {
        try {
            File file = new File(path);
            // Create a Scanner to read from the file
            Scanner scanner = new Scanner(file);
            // Read n numbers from the file
            for (int i = 1; i <= n; i++) {
                int number = scanner.nextInt();
                assertEquals(number, cost[source][i]);
            }
            // Close the Scanner
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Test
    public void test1() throws  FileNotFoundException {
        Gragh g = new Gragh("./tests/1.in");
        int parent[][] = new int[g.NoVertices][g.NoVertices];
        long cost[][] = new long[g.NoVertices][g.NoVertices];
        System.out.println(" number of nodes is " + g.NoVertices);
        System.out.print(" Enter  the source node:  ");
        g.floydWarshall(1, cost,parent);
         cost[1][1]=0;
        readFromOutFile("./tests/1.out", cost, g.NoVertices,1);
    }

    @Test
    public void test2() throws FileNotFoundException {
        Gragh g = new Gragh("./tests/2.in");
        int parent[][] = new int[g.NoVertices][g.NoVertices];
        long cost[][] = new long[g.NoVertices][g.NoVertices];
        System.out.println(" number of nodes is " + g.NoVertices);
        System.out.print(" Enter  the source node:  ");
        g.floydWarshall(1, cost,parent);
        cost[1][1]=0;
        readFromOutFile("./tests/2.out", cost, g.NoVertices,1);
    }

    @Test
    public void test3() throws FileNotFoundException {
        Gragh g = new Gragh("./tests/3.in");
        int parent[][] = new int[g.NoVertices][g.NoVertices];
        long cost[][] = new long[g.NoVertices][g.NoVertices];
        System.out.println(" number of nodes is " + g.NoVertices);
        System.out.print(" Enter  the source node:  ");
        g.floydWarshall(1, cost,parent);
        cost[1][1]=0;
        readFromOutFile("./tests/3.out", cost, g.NoVertices,1);
    }

    @Test
    public void test4() {
        Gragh g = new Gragh("./tests/4.in");
        int parent[][] = new int[g.NoVertices][g.NoVertices];
        long cost[][] = new long[g.NoVertices][g.NoVertices];
        System.out.println(" number of nodes is " + g.NoVertices);
        System.out.print(" Enter  the source node:  ");
        g.floydWarshall(1, cost,parent);
        cost[1][1]=0;
        readFromOutFile("./tests/4.out", cost, g.NoVertices,1);
    }

    @Test
    public void test5() {
        Gragh g = new Gragh("./tests/5.in");
        int parent[][] = new int[g.NoVertices][g.NoVertices];
        long cost[][] = new long[g.NoVertices][g.NoVertices];
        System.out.println(" number of nodes is " + g.NoVertices);
        System.out.print(" Enter  the source node:  ");
        g.floydWarshall(1, cost,parent);
        cost[1][1]=0;
        readFromOutFile("./tests/5.out", cost, g.NoVertices,1);
    }

    @Test
    public void test13() {
        Gragh g = new Gragh("./tests/13.in");
        int parent[][] = new int[g.NoVertices][g.NoVertices];
        long cost[][] = new long[g.NoVertices][g.NoVertices];
        System.out.println(" number of nodes is " + g.NoVertices);
        System.out.print(" Enter  the source node:  ");
        g.floydWarshall(1, cost,parent);
         readFromOutFile("./tests/13.out", cost, g.NoVertices,1);
    }

//    @Test
//    public void test9() {
//        Gragh g = new Gragh("./tests/9.in");
//        int parent[][] = new int[g.NoVertices][g.NoVertices];
//        long cost[][] = new long[g.NoVertices][g.NoVertices];
//        System.out.println(" number of nodes is " + g.NoVertices);
//        System.out.print(" Enter  the source node:  ");
//        g.floydWarshall(1, cost,parent);
//        cost[1][1]=0;
//        readFromOutFile("./tests/9.out", cost, g.NoVertices,1);
//    }
//    @Test
//    public void test18() {
//        Gragh g = new Gragh("./tests/18.in");
//        int parent[][] = new int[g.NoVertices][g.NoVertices];
//        long cost[][] = new long[g.NoVertices][g.NoVertices];
//        System.out.println(" number of nodes is " + g.NoVertices);
//        System.out.print(" Enter  the source node:  ");
//        g.floydWarshall(1, cost,parent);
//        cost[1][1]=0;
//        readFromOutFile("./tests/18.out", cost, g.NoVertices,1);
//    }
//    @Test
//    public void test17() {
//        Gragh g = new Gragh("./tests/11.in");
//        int parent[][] = new int[g.NoVertices][g.NoVertices];
//        long cost[][] = new long[g.NoVertices][g.NoVertices];
//        System.out.println(" number of nodes is " + g.NoVertices);
//        System.out.print(" Enter  the source node:  ");
//        g.floydWarshall(1, cost,parent);
//        cost[1][1]=0;
//        readFromOutFile("./tests/11.out", cost, g.NoVertices,1);
//    }
//    @Test
//    public void test23() {
//        Gragh g = new Gragh("./tests/23.in");
//        int parent[] = new int[g.NoVertices];
//        long cost[] = new long[g.NoVertices];
//        System.out.println(" number of nodes is " + g.NoVertices);
//        System.out.print(" Enter  the source node:  ");
//        g.Dijkstra(1, cost, parent);
//        readFromOutFile("./tests/23.out", cost, g.NoVertices);
//    }
//    @Test
//    public void test22() {
//        Gragh g = new Gragh("./tests/22.in");
//        int parent[] = new int[g.NoVertices];
//        long cost[] = new long[g.NoVertices];
//        System.out.println(" number of nodes is " + g.NoVertices);
//        System.out.print(" Enter  the source node:  ");
//        g.Dijkstra(1, cost, parent);
//        readFromOutFile("./tests/22.out", cost, g.NoVertices);
//    }
//    @Test
//    public void test20() {
//        Gragh g = new Gragh("./tests/20.in");
//        int parent[] = new int[g.NoVertices];
//        long cost[] = new long[g.NoVertices];
//        System.out.println(" number of nodes is " + g.NoVertices);
//        System.out.print(" Enter  the source node:  ");
//        g.Dijkstra(1, cost, parent);
//        readFromOutFile("./tests/20.out", cost, g.NoVertices);
//    }
//    @Test
//    public void test19() {
//        Gragh g = new Gragh("./tests/19.in");
//        int parent[] = new int[g.NoVertices];
//        long cost[] = new long[g.NoVertices];
//        System.out.println(" number of nodes is " + g.NoVertices);
//        System.out.print(" Enter  the source node:  ");
//        g.Dijkstra(1, cost, parent);
//        readFromOutFile("./tests/19.out", cost, g.NoVertices);
//    }
//    @Test
//    public void test21() {
//        Gragh g = new Gragh("./tests/21.in");
//        int parent[] = new int[g.NoVertices];
//        long cost[] = new long[g.NoVertices];
//        System.out.println(" number of nodes is " + g.NoVertices);
//        System.out.print(" Enter  the source node:  ");
//        g.Dijkstra(1, cost, parent);
//        readFromOutFile("./tests/21.out", cost, g.NoVertices);
//    }


}
