package tugas;

public class Node {
    String name;
    Node prev, next;
    int queueNumber;

    Node (int queueNumber, String name) {
        this.prev = null;
        this.name = name;
        this.next = null;
        this.queueNumber = queueNumber;
    }
}
