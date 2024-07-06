import java.util.Scanner;
public class Main {
    private static Kendaraan06[] kendaraanArray = new Kendaraan06[4];
    private static int bulanHarusBayar;
    public static void main(String[] args) {
        tambahkanKendaraan(new Kendaraan06("B 1233 AG", "Dea", "Mobil", 188,2020, 1));
        tambahkanKendaraan(new Kendaraan06("AB 2508 A", "Iqbal", "Motor", 125, 2010, 2));
        
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Menu");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan seluruh transaksi");
            System.out.println("4. Urutkan transaksi berdasar nama pemilik");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5) : ");
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    tampilkanDaftarKendaraan();
                    break;
                case 2:
                    bayarPajak();
                    break;
                case 3:
                    //tampilkanSeluruhTransaksi();
                    break;
                case 4:
                    //urutkanTransaksiBerdasarNamaPemilik();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }
    private static void tambahkanKendaraan(Kendaraan06 kendaraan) {
        for (int i = 0; i < kendaraanArray.length; i++) {
            if (kendaraanArray[i] == null) {
                kendaraanArray[i] = kendaraan;
                break;
            }
        }
    }
    private static void tampilkanDaftarKendaraan() {
        System.out.println("==============================");
        System.out.println("Daftar Kendaraan");
        System.out.println("==============================");
        System.out.println("|Nomor TNKB| Nama Pemilik    | Jenis | CC Kendaraan| Tahun| Bulan harus bayar");
        for (Kendaraan06 kendaraan : kendaraanArray) {
            if (kendaraan != null) {
                System.out.println(kendaraan);
            }
        }
    }

    private static void bayarPajak() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Masukkan Nomer TNKB: ");
        String nomorTNKB = scanner.nextLine();
    
        System.out.print("Bulan Bayar: ");
        int bulanBayar = scanner.nextInt();
    
        Kendaraan06 kendaraan = cariKendaraan(nomorTNKB);
    
        if (kendaraan != null) {
            int nominalPajak = hitungNominalPajak(kendaraan, bulanBayar);
            int denda = hitungDenda(bulanBayar, kendaraan.getBulanHarusBayar());
    
            System.out.println("==============================");
            System.out.println("Detail Pembayaran Pajak");
            System.out.println("==============================");
            System.out.println("Nomor TNKB: " + nomorTNKB);
            System.out.println("Nama Pemilik: " + kendaraan.getNamaPemilik());
            System.out.println("Nominal Pajak: " + nominalPajak);
            System.out.println("Denda: " + denda);
            System.out.println("Total Bayar: " + (nominalPajak + denda));
        } else {
            System.out.println("Kendaraan dengan nomor TNKB " + nomorTNKB + " tidak ditemukan.");
        }
    }
    private static int hitungDenda(int bulanBayar, Object bulanHarusBayar2) {
        int bulanHarusBayar = (int) bulanHarusBayar2;
        int selisihBulan = bulanBayar - bulanHarusBayar;
        int denda = 0;
        if (selisihBulan > 0) {
            denda = selisihBulan * 50000;
        }
        return denda;
    }
    
    private static int hitungNominalPajak(Kendaraan06 kendaraan, int bulanBayar) {
        int ccKendaraan = kendaraan.getCCKendaraan();
        int tahunKendaraan = kendaraan.getTahunKendaraan();
        double tarifPajak = 0.0; 
        double pajakDasar = tarifPajak * ccKendaraan;
        double penguranganPajak = 0.0; 
        double nominalPajak = pajakDasar - penguranganPajak;
        return (int) nominalPajak; 
    }
    
    private static Kendaraan06 cariKendaraan(String nomorTNKB) {
    for (Kendaraan06 kendaraan : kendaraanArray) {
        if (kendaraan != null && kendaraan.getNomorTNKB().equals(nomorTNKB)) {
            return kendaraan;
        }
    }
    return null;
    }   
}