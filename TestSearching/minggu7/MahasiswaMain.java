package minggu7;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Scanner s1 = new Scanner (System.in);

        System.out.println("Masukkan Jumlah Mahasiswa : ");
        int jumMhs = s.nextInt();
        s.nextLine();

        PencarianMhs data = new PencarianMhs (jumMhs);

        System.out.println("-----------------------------------------------------");
        System.out.println("Masukan data Mahasiswa secara urut daru Nim Terkecil ");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-----------------------------------------------------");
            System.out.print("Nim \t : ");
            int nim = s.nextInt ();
            System.out.print("Nama \t : ");
            String nama = s1.nextLine ();
            System.out.print("Umur \t : ");
            int umur = s.nextInt ();
            System.out.print("IPK \t : ");
            double ipk= s.nextDouble ();

            Mahasiswa06 m = new Mahasiswa06 (nim, nama, umur, ipk);
            data.Tambah(m);
        }

        System.out.println("-----------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("_____________________________________");
        System.out.println("_____________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
        //System.out.print("NIM : ");
        //int cari = s.nextInt();
        //System.out.println("Menggunakan sequential Search");
        //int posisi = data.FindSeqSearch(cari);
        //data.Tampilposisi(cari, posisi);
        //data.TampilData (cari, posisi);

        //System.out.println("=======================================");
        //System.out.println("Menggunakan Binary Search");
        System.out.print("Nama : ");
        String cari = s1.next();
        System.out.println("Menggunakan binary Search");
        int posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        if (posisi != -1) {
            System.out.println("Data dengan nama '" + cari + "' ditemukan pada indeks " + posisi);
            // Tampilkan data mahasiswa yang ditemukan
            data.listMhs[posisi].tampil();
            // Cek apakah ada data dengan nama yang sama setelahnya
            int i = posisi + 1;
            boolean multipleResults = false;
            while (i < jumMhs && data.listMhs[i].nama.equalsIgnoreCase(cari)) {
                multipleResults = true;
                i++;
            }
            if (multipleResults) {
                System.out.println("Catatan: Ada lebih dari satu hasil dengan nama yang sama.");
            }
        } else {
            System.out.println("Data dengan nama '" + cari + "' tidak ditemukan");
        //data.Tampilposisi(cari, posisi);
        //data.TampilData (cari, posisi);
    }
}
}

