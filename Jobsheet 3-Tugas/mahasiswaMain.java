import java.util.Scanner;

public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlahMahasiswa = sc.nextInt();
        sc.nextLine(); 

        Mahasiswa[] daftarMahasiswa = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan informasi untuk Mahasiswa ke-" + (i + 1));
            daftarMahasiswa[i] = new Mahasiswa("", "", "", 0); // Membuat objek Mahasiswa baru

            System.out.print("Nama: ");
            daftarMahasiswa[i].setNama(sc.nextLine());

            System.out.print("NIM: ");
            daftarMahasiswa[i].setNim(sc.nextLine());

            System.out.print("Jenis Kelamin: ");
            daftarMahasiswa[i].setJenisKelamin(sc.nextLine());

            System.out.print("IPK: ");
            daftarMahasiswa[i].setIpk(sc.nextDouble());
            sc.nextLine(); 
        }

        System.out.println("---------------------------------");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Jenis Kelamin: " + mahasiswa.getJenisKelamin());
            System.out.println("IPK: " + mahasiswa.getIpk());
            System.out.println();
        }

        double totalIpk = 0;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            totalIpk += mahasiswa.getIpk();
        }
        double rataRataIpk = totalIpk / jumlahMahasiswa;

        System.out.println("Rata-rata IPK: " + rataRataIpk);

        sc.close();
    }
    }
