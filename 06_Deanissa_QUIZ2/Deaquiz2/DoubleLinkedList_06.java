package Deaquiz2;

public class DoubleLinkedList_06 {
        Pembeli06 head, tail;
        int size;
    
        public DoubleLinkedList_06() {
            head = null;
            tail = null;
            size = 0;
        }
        public boolean isEmpty() {
            return head == null;
        }
    
        public void addFirst(String namaPembeli, String noHp, int noAntrian) {
            Pembeli06 newPembeli = new Pembeli06(namaPembeli, noHp, size + 1);
            if (isEmpty()) {
                tail = newPembeli;
            } else {
                head.prev = newPembeli;
                newPembeli.next = head;
            }
            head = newPembeli;
            size++;
        }
        public void displayPembeli() {
            if (isEmpty()) {
                System.out.println("Daftar antrian kosong.");
                return;
            }
            System.out.println("Daftar Antrian:");
            System.out.println("| No Antrian | NamaCustomer           | No HP             |");
            System.out.println("|------------|------------------------|-------------------|");
            Pembeli06 current = head;
            while (current != null) {
                System.out.printf("| %-10d| %-22s| %-17s|\n",
                        current.noAntrian, current.namaPembeli, current.noHp);
                current = current.next;
            }
        }
        public void removeFirst() {
            if (isEmpty()) {
                System.out.println("Daftar film kosong.");
                return;
            }
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.prev = null;
            }
            size--;
        }
        public void removeLast() {
            if (isEmpty()) {
                System.out.println("Daftar film kosong.");
                return;
            }
            if (head == tail) {
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        } 
        public void remove(int index) {
            if (index < 0 || index >= size) {
                System.out.println("Indeks diluar batas.");
                return;
            }
            if (index == 0) {
                removeFirst();
            } else if (index == size - 1) {
                removeLast();
            } else {
                Pembeli06 current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                current.prev.next = current.next;
                current.next.prev = current.prev;
                size--;
            }
        }
}
