package Pratikum03;

public class QueuePembeli06 {
    Pembeli06 [] antrian;
        int front;
        int rear;
        int size;
        int max;
        public QueuePembeli06(int n){
            max = n;
            antrian = new Pembeli06 [max];
            size = 0;
            front = rear = -1;
        }
        public boolean IsEmpty(){
            if (size == 0) {
                return true;
            } else {
                return false;
            }
        }
        public boolean IsFull() {
            if (size == max) {
                return true;
            } else {
                return false;
            }
        }
        public void peek() {
            if (!IsEmpty()) {
                System.out.println("Elemen terdepan : " + antrian[front].nama + " " + antrian[front].noID + " " + antrian[front].jenisKelamin + " " + antrian[front].umur);
            } else {
                System.out.println("Queue masih kosong");
            }
        }
        public void print() {
            if (IsEmpty()) {
                System.out.println("Queue masih kosong");
            } else {
                int i = front;
                while (i != rear){
                    System.out.println(antrian[i].nama + " " +antrian[i].noID + " " + antrian[i].jenisKelamin + " " + antrian[i].umur);
                    i = (i + 1) % max;
                }
                System.out.print(antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jenisKelamin + " " + antrian[i].umur);
                System.out.println("Jumlah elemen = "+size);
            }
        }
        public void Enqueue (Pembeli06 antri){
            if (IsFull()) {
                System.out.println("Queue sudah penuh");
            } else {
                if (IsEmpty()) {
                front = rear = 0;
                } else {
                    if (rear == max -1){
                        rear = 0;
                    } else {
                        rear++;
                    }
                }
                antrian[rear] = antri;
                size++;
            }
        }
        public Pembeli06 Dequeue(){
            Pembeli06 antri = new Pembeli06();
            if (IsEmpty()) {
                System.out.println("Queue masih kosong");
                System.exit(0);
            } else {
                antri = antrian[front];
                size--;
                if (IsEmpty()) {
                    front = rear = -1;
                } else {
                    if (front == max -1) {
                        front = 0;
                    } else {
                        front++;
                    }
                }
            }
            return antri;
        }
        public void peekRear() {
            if (!IsEmpty()) {
                System.out.println("Elemen terbelakang : " + antrian[rear].nama + " " + antrian[rear].noID + " " + antrian[rear].jenisKelamin + " " + 
                antrian[rear].umur);
            } else {
                System.out.println("Queue masih kosong");
            }
        }
        public void peekPosition(String nama) {
            if (IsEmpty()) {
                System.out.println("Queue masih kosong");
            } else {
                int posisi = -1;
                int count = 0;
                int i = front;
                while (i != rear) {
                    if (antrian[i].nama.equals(nama)) {
                        posisi = count;
                        break;
                    }
                    count++;
                    i = (i + 1) % max;
                }
                if (antrian[i].nama.equals(nama)) {
                    posisi = count;
                }
                if (posisi != -1) {
                    System.out.println("Posisi antrian " + nama + " adalah: " + posisi);
                } else {
                    System.out.println(nama + " tidak ditemukan dalam antrian");
                }
            }
        }
        public void daftarPembeli() {
            if (IsEmpty()) {
                System.out.println("Queue masih kosong");
            } else {
                int i = front;
                int count = 1;
                while (i != rear) {
                    System.out.println("Antrian ke-" + count + ": " + antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jenisKelamin + " " + antrian[i].umur);
                    count++;
                    i = (i + 1) % max;
                }
                System.out.println("Antrian ke-" + count + ": " + antrian[i].nama + " " + antrian[i].noID + " " + antrian[i].jenisKelamin + " " + antrian[i].umur);
                System.out.println("Jumlah elemen = " + size);
            }
        }        
}
