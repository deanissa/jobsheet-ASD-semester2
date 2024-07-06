package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class Graph<T> {
    private Map<T, LinkedList<T>> adjacencyList;
    private boolean isDirected;

    public Graph(boolean isDirected) {
        this.isDirected = isDirected;
        adjacencyList = new HashMap<>();
    }
    public boolean isDirected() {
        return isDirected;
    }
    public void addVertex(T vertex) {
        adjacencyList.putIfAbsent(vertex, new LinkedList<>());
    }
    public void addEdge(T source, T destination) {
        adjacencyList.get(source).addFirst(destination);
        if (!isDirected) {
            adjacencyList.get(destination).addFirst(source);
        }
    }
    public void addEdgeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan vertex: ");
        T source = (T) sc.next();
        System.out.print("Masukkan destination vertex: ");
        T destination = (T) sc.next();
        addEdge(source, destination);
    }
    public void degree(T vertex) {
        int inDegree = 0, outDegree = adjacencyList.get(vertex).size();
        
        for (T key : adjacencyList.keySet()) {
            for (T value : adjacencyList.get(key)) {
                if (value.equals(vertex)) {
                    inDegree++;
                }
            }
        }
        System.out.println("Indegree of vertex " + vertex + ": " + inDegree);
        System.out.println("Outdegree of vertex " + vertex + ": " + outDegree);
        System.out.println("Degree of vertex " + vertex + ": " + (inDegree + outDegree));
    }
    public void removeEdge(T source, T destination) {
        adjacencyList.get(source).remove(destination);
        if (!isDirected) {
            adjacencyList.get(destination).remove(source);
        }
    }
    public void removeAllEdges() {
        for (T vertex : adjacencyList.keySet()) {
            adjacencyList.get(vertex).clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph() {
        for (T vertex : adjacencyList.keySet()) {
            System.out.print("Vertex " + vertex + " terhubung dengan : ");
            for (T neighbor : adjacencyList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah graphnya berarah  (true/false)? ");
        boolean isDirected = sc.nextBoolean();

        Graph<String> graph = new Graph<>(isDirected);
        
        System.out.print("Masukkan jumlah vertices: ");
        int vertices = sc.nextInt();
        sc.nextLine();  

        for (int i = 0; i < vertices; i++) {
            System.out.print("Masukkan vertex " + (i + 1) + ": ");
            String vertex = sc.nextLine();
            graph.addVertex(vertex);
        }

        System.out.print("Masukkan jumlah edges: ");
        int edges = sc.nextInt();
        sc.nextLine();  

        for (int i = 0; i < edges; i++) {
            graph.addEdgeInput();
        }
        graph.printGraph();
        System.out.print("Masukkan vertex untuk mencari degree : ");
        String vertex = sc.next();
        graph.degree(vertex);
        System.out.print("Masukkan vertex untuk menghapus edges : ");
        String source = sc.next();
        System.out.print("Masukkan destination vertex untuk menghapus edges : ");
        String destination = sc.next();
        graph.removeEdge(source, destination);
        graph.printGraph();
    }
}
