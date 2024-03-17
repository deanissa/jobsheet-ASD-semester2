import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        String[] nilaiHuruf = {"A", "B+", "B", "C+", "C", "D", "E"};
        double[] nilaiSetara = {4.0, 3.5, 3.0, 2.5, 2.0, 1.0, 0.0};
        
        // Input data matakuliah, bobot SKS, nilai angka, dan nilai huruf
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah MK : ");
        int jumlahMatakuliah = sc.nextInt();
        sc.nextLine(); // Membuang karakter newline

        String[] namaMatakuliah = new String[jumlahMatakuliah];
        float[] bobotNilai = new float[jumlahMatakuliah];
        float [] nilaiAngka = new float [jumlahMatakuliah];
        String[] nilaiHurufMatakuliah = new String[jumlahMatakuliah];

        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.println("MK ke-" + (i + 1) + ":");
            System.out.print("Nama MK: ");
            namaMatakuliah[i] = sc.nextLine();
            System.out.print("Bobot Nilai: ");
            bobotNilai[i] = sc.nextFloat();
            System.out.print("Nilai angka: ");
            nilaiAngka[i] = sc.nextFloat();
            sc.nextLine(); // Membuang karakter newline
            System.out.print("Nilai huruf: ");
            nilaiHurufMatakuliah[i] = sc.nextLine();
        }

        // Hitung IP Semester
        double totalNilaiSetaraSKS = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatakuliah; i++) {
            // Cari nilai setara dari nilai huruf matakuliah
            double nilaiSetaraMatakuliah = 0;
            for (int j = 0; j < nilaiHuruf.length; j++) {
                if (nilaiHurufMatakuliah[i].equalsIgnoreCase(nilaiHuruf[j])) {
                    nilaiSetaraMatakuliah = nilaiSetara[j];
                    break;
                }
            }
            totalNilaiSetaraSKS += nilaiSetaraMatakuliah * bobotNilai[i];
            totalSKS += bobotNilai[i];
        }
        System.out.println("\nHasil Konversi Nilai ");
        System.out.println("=======================");
        System.out.println("Nama Matakuliah\t\tBobot Nilai\tNilai Angka\tNilai Huruf");
        for (int i = 0; i < jumlahMatakuliah; i++) {
        System.out.println(namaMatakuliah[i] + "\t\t\t" + bobotNilai[i] + "\t\t" + nilaiAngka[i] + "\t\t" + nilaiHurufMatakuliah[i]);
        }
        double ipSemester = totalNilaiSetaraSKS / totalSKS;
        System.out.println("===============================");
        System.out.println("\nIP : " + ipSemester);
        System.out.println("===============================");
    }
}
