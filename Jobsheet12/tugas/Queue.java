package tugas;

public class Queue {
    Node front, rear;
    int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void enqueue(int queueNumber, String name) {
        Node newNode = new Node(queueNumber, name);
            if (isEmpty()) {
                front = newNode;
            } else {
                rear.next = newNode;
                newNode.prev = rear;
            }
            rear = newNode;
            size++; 
    }

    public String dequeue() {
        if (isEmpty()) {
            return "Antrian kosong";
        }
        String name = front.name;
        front = front.next;
        if (front == null) {
            rear = null;
        } else {
            front.prev = null;
        }
        size--;
        return name + " telah divaksinasi";
    }

    public int getSize() {
        return size;
    }
}
