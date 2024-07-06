import java.util.Scanner;
public class MainRekening06 {
    public static void main(String[] args) {
        Scanner dea06 = new Scanner (System.in);
        Scanner dea = new Scanner (System.in);

        System.out.println("Masukkan Jumlah Transaksi : ");
        int jum = dea06.nextInt();
        dea06.nextLine();

        DaftarRekening06 data = new DaftarRekening06(jum);

        System.out.println("-----------------------------------------------------");
        System.out.println("Masukan data Rekening : ");
        for (int i = 0; i < jum; i++) {
            System.out.println("-----------------------------------------------------");
            System.out.print("No Rekening \t : ");
            int noRekening = dea06.nextInt ();
            dea06.nextLine();
            System.out.print("Nama \t : ");
            String nama = dea.nextLine ();
            System.out.print("Phone \t : ");
            String phone = dea06.nextLine ();
            System.out.print("Email \t : ");
            String email = dea.nextLine ();

            Rekening06 r = new Rekening06 (noRekening, nama, phone, email);
            data.tambah(r);
        }
            System.out.println("-----------------------------");
            System.out.println("Data Rekening : ");
            System.out.println("Data sebelum di Sorting = ");
            data.tampil();

            //Berdasarkan No Rekening
            System.out.println("Data setelah di Sorting berdasarkan Kecil - Besar =");
            data.bubbleSort();
            data.tampil();
        

        System.out.println("_____________________________________");
        System.out.println("_____________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan No Rekening yang dicari : ");
        System.out.print("No Rekening : ");
        int cari = dea06.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData (cari, posisi);
    }
}
