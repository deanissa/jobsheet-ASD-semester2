package GraphArray;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GraphArray<T> {
    private final int[][] twoD_array;
    private final Map<T, Integer> vertexMap;
    private int vertexCount;

    public GraphArray(int v) {
        twoD_array = new int[v][v];
        vertexMap = new HashMap<>();
        vertexCount = 0;
    }
    public void addVertex(T vertex) {
        if (!vertexMap.containsKey(vertex)) {
            vertexMap.put(vertex, vertexCount++);
        }
    }
    public void makeEdge(T to, T from, int edge) {
        try {
            int toIndex = vertexMap.get(to);
            int fromIndex = vertexMap.get(from);
            twoD_array[toIndex][fromIndex] = edge;
        } catch (NullPointerException e) {
            System.out.println("Vertex tidak ada");
        }
    }
    public int getEdge(T to, T from) {
        try {
            int toIndex = vertexMap.get(to);
            int fromIndex = vertexMap.get(from);
            return twoD_array[toIndex][fromIndex];
        } catch (NullPointerException e) {
            System.out.println("Vertex tidak ada");
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GraphArray<String> graph;
        try {
            System.out.print("Masukkan jumlah vertices: ");
            int v = sc.nextInt();
            graph = new GraphArray<>(v);
            System.out.println("Masukkan vertices: ");
            sc.nextLine(); 
            for (int i = 0; i < v; i++) {
                System.out.print("Vertex " + (i + 1) + ": ");
                String vertex = sc.nextLine();
                graph.addVertex(vertex);
            }
            System.out.print("Masukkan jumlah edges: ");
            int e = sc.nextInt();

            System.out.println("Masukkan edges: <to> <from>");
            sc.nextLine(); 
            for (int i = 0; i < e; i++) {
                System.out.print("Edge " + (i + 1) + ": ");
                String to = sc.next();
                String from = sc.next();
                graph.makeEdge(to, from, 1);
            }
            System.out.println("Array 2D sebagai representasi graph sbb:");
            for (String vertex : graph.vertexMap.keySet()) {
                System.out.print("\t" + vertex);
            }
            System.out.println();
            for (String fromVertex : graph.vertexMap.keySet()) {
                System.out.print(fromVertex);
                for (String toVertex : graph.vertexMap.keySet()) {
                    System.out.print("\t" + graph.getEdge(fromVertex, toVertex));
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error Silahkan cek kembali\n" + e.getMessage());
        }
        sc.close();
    }
}
