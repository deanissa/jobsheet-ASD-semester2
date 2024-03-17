import java.util.Scanner;
public class pengirimanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("|---------------------------------- |");
        System.out.println("|Input Data Pengirim dari Pengirim: |");
        System.out.println("|-----------------------------------|");
        System.out.print("Masukkan jumlah pengirim: ");
        int jumlahPengirim = sc.nextInt();
        sc.nextLine();

        // Buat array objek Pengirim dari pengirim
        pengirim[] Pengirim = new pengirim[jumlahPengirim];

        // Input data pengirim dari pengirim
        for (int i = 0; i < jumlahPengirim; i++) {
            System.out.println("Masukkan data untuk Pengirim " + (i + 1) + ":");
    
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();
            System.out.print("Nama Pengirim: ");
            String namaPengirim = sc.nextLine();
            System.out.print("Nama Penerima: ");
            String namaPenerima = sc.nextLine();
            System.out.print("Alamat Pengirim: ");
            String alamatPengirim = sc.nextLine();
            System.out.print("Alamat Penerima: ");
            String alamatPenerima = sc.nextLine();
            System.out.print("No HP Pengirim: ");
            String noHpPengirim = sc.nextLine();
            System.out.print("No HP Penerima: ");
            String noHpPenerima = sc.nextLine();
            System.out.print("Berat Paket: ");
            double beratPaket = sc.nextDouble();
            System.out.print("Layanan: ");
            String layanan = sc.next();

                // Buat objek Pengirim dan tambahkan ke dalam array
            Pengirim[i] = new pengirim(username, password, namaPengirim, namaPenerima, alamatPengirim, 
            alamatPenerima, noHpPengirim, noHpPenerima, beratPaket, layanan);
        }
        System.out.println("|---------------------------- |");
        System.out.println("|Data Pengirim dari Pengirim: |");
        System.out.println("|-----------------------------|");
        for (int i = 0; i < jumlahPengirim; i++) {
            System.out.println("Pengirim " + (i + 1) + ":");
            Pengirim[i].tampilDataPengirim();
            System.out.println();
        }


        System.out.println("|--------------------------------- |");
        System.out.println("|Input Data Pengirim dari Pegawai: |");
        System.out.println("|----------------------------------|");
        System.out.print("Masukkan jumlah pengirim: ");
        int jumlahPengiriman = sc.nextInt();
        sc.nextLine();
        // Buat array objek Pengirim dari pegawai
        pegawai[] Pegawai = new pegawai[jumlahPengiriman];

        // Input data pengirim dari pegawai
        for (int i = 0; i < jumlahPengiriman; i++) {
            System.out.println("Masukkan data untuk Pengirim " + (i + 1) + ":");
    
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();
            System.out.print("Nama Pengirim: ");
            String namaPengirim = sc.nextLine();
            System.out.print("Nama Penerima: ");
            String namaPenerima = sc.nextLine();
            System.out.print("Alamat Pengirim: ");
            String alamatPengirim = sc.nextLine();
            System.out.print("Alamat Penerima: ");
            String alamatPenerima = sc.nextLine();
            System.out.print("No HP Pengirim: ");
            String noHpPengirim = sc.nextLine();
            System.out.print("No HP Penerima: ");
            String noHpPenerima = sc.nextLine();
            System.out.print("Berat Paket: ");
            double beratPaket = sc.nextDouble();
            System.out.print("Layanan: ");
            String layanan = sc.next();

                // Buat objek Pengirim dan tambahkan ke dalam array
            Pegawai[i] = new pegawai(username, password, namaPengirim, namaPenerima, alamatPengirim, 
            alamatPenerima, noHpPengirim, noHpPenerima, beratPaket, layanan);
        }

        // Tampilkan data pengirim
        System.out.println("|--------------------------- |");
        System.out.println("|Data Pengirim dari Pegawai: |");
        System.out.println("|----------------------------|");
        for (int i = 0; i < jumlahPengiriman; i++) {
            System.out.println("Pengirim " + (i + 1) + ":");
            Pengirim[i].tampilDataPengirim();
            System.out.println();
        }
}
}