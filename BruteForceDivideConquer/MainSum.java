import java.text.DecimalFormat;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    //System.out.println("=============================================================");
    //System.out.println("Program Menghitung Keuntungan Total (Saruan Juta. Misal 5.9) ");
    //System.out.print("Masukkan Jumlah Bulan : ");
    System.out.println("=============================================================");
    System.out.println("Program Menghitung Keuntungan Total untuk Beberapa Perusahaan");
    System.out.println("=============================================================");

    // Input jumlah perusahaan
    System.out.print("Masukkan jumlah perusahaan: ");
    int jmlPerusahaan = sc.nextInt();

    // Inisialisasi array 2 dimensi untuk menyimpan keuntungan perusahaan
    double[][] keuntungan = new double[jmlPerusahaan][];

    // Input jumlah bulan dan keuntungan perusahaan
    for (int i = 0; i < jmlPerusahaan; i++) {
        System.out.println("-------------------------------------------------------------");
        System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + ": ");
        int jumlahBulan = sc.nextInt();

    keuntungan[i] = new double[jumlahBulan]; 
    System.out.println("===================================================");
    for (int j = 0; j < jumlahBulan; j++) {
        System.out.print("Masukkan keuntungan bulan ke-" + (j + 1) + " untuk perusahaan ke-" + (i + 1) + ": ");
        keuntungan[i][j] = sc.nextDouble();
    }
}
    // Hitung total keuntungan untuk setiap perusahaan
    for (int i = 0; i < jmlPerusahaan; i++) {
        Sum sm = new Sum(keuntungan[i].length);
            System.out.println("====================================================");
            System.out.println("Algoritma Brute Force ");
            //Membatasi jumlah angka decimal dibelakang koma
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.println("Total keuntungan perusahaan ke- " +(i+1)+ " bulan adalah = " +df.format(sm.totalBF(keuntungan[i])));
            System.out.println("====================================================");
            System.out.println("Algoritma Divide Conquer ");
            System.out.println("Total keuntungan perusahaan ke- " +(i+1)+ " bulan adalah = " +df.format(sm.totalDC(keuntungan[i], 0, keuntungan[i].length - 1)));
            }
    }
}
