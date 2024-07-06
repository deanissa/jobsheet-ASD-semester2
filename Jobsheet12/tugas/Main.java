package tugas;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        while (true) {
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("  PENGANTRI VAKSIN EXTRAVAGANZA ");
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin  ");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin     ");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("=============================");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("=============================");
                    System.out.println("Nomor Antrian: ");
                    int queueNumber = sc.nextInt();
                    System.out.println("Nama Penerima: ");
                    sc.nextLine(); 
                    String name = sc.nextLine();
                    queue.enqueue(queueNumber, name);
                    System.out.println(name + " telah ditambahkan ke dalam antrian vaksinasi.");
                    break;
                case 2:
                    String removed = queue.dequeue();
                    System.out.println(removed);
                    break;
                case 3:
                    System.out.println("++++++++++++++++++++++++");
                    System.out.println("Daftar Pengantri Vaksin ");
                    System.out.println("++++++++++++++++++++++++");
                    System.out.println("| No. |     Nama    |");
                   
                    Node current = queue.front;
                    while (current != null) {
                        System.out.printf("| %-4d| %-12s|\n", current.queueNumber, current.name);
                        current = current.next;
                    }
                    System.out.println("Sisa antrian: " + queue.getSize());
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program antrian vaksinasi.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        }
    }
}
