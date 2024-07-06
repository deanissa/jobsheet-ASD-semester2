import java.util.Scanner;
public class ObatMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Obat : ");
        int jumlahObat06 = sc.nextInt();
        sc.nextLine(); 

        //Deklarasi dan inisialisasi array dari objek Obat06. 
        Obat06[] daftarObat06 = new Obat06[jumlahObat06]; //Nama variabel digunakan menyimpan array yang akan dibuat
        //Input informasi Data Obat
        for (int i = 0; i < jumlahObat06; i++) {
            System.out.println("Masukkan informasi untuk Obat ke-" + (i + 1));
            daftarObat06[i] = new Obat06("", "", 0, 0); // Membuat objek Mahasiswa baru

            System.out.print("Nama Obat: ");
            daftarObat06[i].setNama(sc.nextLine());
            System.out.print("Kategori Obat: ");
            daftarObat06[i].setKategori(sc.nextLine());
            System.out.print("Stok Obat: ");
            daftarObat06[i].setStok(sc.nextInt());
            System.out.print("Jumlah Obat: ");
            daftarObat06[i].setJumlah(sc.nextInt());
            sc.nextLine(); 
        }
        //Menampilkan seluruh Data Obat & sesuai Descending
        System.out.println("-------------------------------------------------");
        System.out.println("-----Tampilan Data Obat & Sesuai Descending------");
        System.out.println("-------------------------------------------------");
        Obat06.urutBerdasarkanNama(daftarObat06);
        for (Obat06 obat06 : daftarObat06) {
            System.out.println("Nama Obat: " + obat06.getNama());
            System.out.println("Kategori Obat: " + obat06.getKategori());
            System.out.println("Stok Obat: " + obat06.getStok());
            System.out.println("Jumlah Obat: " + obat06.getJumlah());
            System.out.println();
        }
        // Mencari obat yang paling banyak tidak terjual
        Obat06 obatTerjual06 = Obat06.cariObatTerjual(daftarObat06);
        System.out.println("---------------------------------");
        System.out.println("Obat Paling Banyak Tidak Terjual:");
        System.out.println("---------------------------------");
        System.out.println("Nama Obat: " + obatTerjual06.getNama());
        System.out.println("Kategori Obat: " + obatTerjual06.getKategori());
        System.out.println("Stok Obat: " + obatTerjual06.getStok());
        System.out.println("Jumlah Obat: " + obatTerjual06.getJumlah());
        System.out.println("Sisa Obat: " + obatTerjual06.hitungSisa());
    }
}
