import java.util.Scanner;
public class BelanjaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackBelanja06 stack = new StackBelanja06(8); // Maksimal 8 struk belanja dalam 2 bulan
        
        // Menambahkan delapan struk belanja ke dalam stack
        stack.push(new belanja06(1001, "2024-01-05", 3, 150.0));
        stack.push(new belanja06(1002, "2024-01-12", 2, 80.0));
        stack.push(new belanja06(1003, "2024-01-19", 1, 30.0));
        stack.push(new belanja06(1004, "2024-01-26", 4, 200.0));
        stack.push(new belanja06(1005, "2024-02-02", 2, 100.0));
        stack.push(new belanja06(1006, "2024-02-09", 3, 120.0));
        stack.push(new belanja06(1007, "2024-02-16", 2, 90.0));
        stack.push(new belanja06(1008, "2024-02-23", 5, 250.0));
        System.out.println("Daftar Struk Belanja yang Tersimpan di dalam Stack:");
        stack.print();

        // Proses pengambilan lima struk belanja untuk ditukarkan dengan voucher
        System.out.println("\nProses Pengambilan Struk Belanja untuk Ditukarkan dengan Voucher:");
        for (int i = 0; i < 5; i++) {
            if (!stack.IsEmpty()) {
                stack.pop();
            } else {
                System.out.println("Stack sudah kosong, tidak bisa mengambil lebih banyak struk.");
                break;
            }
        }
    }
}
