package Deaquiz2;
import java.util.Scanner;
public class Main_06 {
    public static void main(String[] args) {
        Scanner scDea = new Scanner(System.in);
        DoubleLinkedList_06 pembeliList = new DoubleLinkedList_06();

        while (true) {
            System.out.println("========== QUIZ 2 PRATIKUM ASD========");
            System.out.println("Dibuat oleh : Deanissa Sherly Sabilla");
            System.out.println("NIM : 2341760187");
            System.out.println("Absen : 06");
            System.out.println("======================================");
            System.out.println("SISTEM ANTRIAN RESTO ROYAL DEA");
            System.out.println("======================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan Pesanan by nama");
            System.out.println("5. Hitung Total Pendapatan");
            System.out.println("6. Keluar");
            System.out.println("======================================");
            System.out.print("Pilih menu: ");
            int choice = scDea.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("-----------------------");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("-----------------------");
                    System.out.print("Nomor Antrian:");
                    int noAntrian = scDea.nextInt();
                    System.out.print("Nama Customer: ");
                    scDea.nextLine();
                    String namaPembeli = scDea.nextLine();
                    System.out.print("Masukkan No HP: ");
                    String noHp1 = scDea.nextLine();
                    pembeliList.addFirst(namaPembeli, noHp1,noAntrian);
                    System.out.println("Pembeli berhasil ditambahkan di awal.");
                    break;
                case 2:
                    pembeliList.displayPembeli();
                    break;
                case 3:
                    System.out.print("Masukkan indeks pembeli yang ingin dihapus: ");
                    int index5 = scDea.nextInt();
                    pembeliList.remove(index5 - 1);
                    System.out.println("Pembeli di indeks " + index5 + " berhasil dihapus.");
                    break;
                case 4:
        
                case 5:

                case 6:
        
                case 7:
                break;
        }
    }
}
}