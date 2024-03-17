import java.util.Scanner;

import minggu5.Faktorial;
public class MainFaktorial {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println ("===========================================");
    System.out.print("Masukkan jumlah elemen yang ingin di hitung : ");
    int elemen = sc.nextInt();

    Faktorial [] fk = new Faktorial[elemen];
    for (int i = 0; i < elemen; i++) {
        fk[i] = new Faktorial();
        System.out.print("Masukkan nilai data ke-" +(i+1)+ ":");
        fk[i].nilai = sc.nextInt();
    }

    System.out.println("==============================================");
    System.out.println("Hasil Faktorial dengan Brute Force ");
    // Waktu eksekusi untuk metode Brute Force
    long startTimeBF = System.currentTimeMillis();
    for (int i = 0; i < elemen; i++) {
        System.out.println("Faktorial dari nilai " +fk[i].nilai+ "adalah : " +fk[i].faktorialBF(fk[i].nilai));
    }
    long endTimeBF = System.currentTimeMillis();
    System.out.println("Waktu eksekusi Brute Force: " + (endTimeBF - startTimeBF) + " milliseconds");

    System.out.println("==============================================");
    System.out.println("Hasil Faktorial dengan Divide and Conquer ");
    // Waktu eksekusi untuk metode Divide and Conquer
    long startTimeDC = System.currentTimeMillis();
    for (int i = 0; i < elemen; i++) {
        System.out.println("Faktorial dari nilai " +fk[i].nilai+ "adalah : " +fk[i].faktorialDC(fk[i].nilai));
    }
    long endTimeDC = System.currentTimeMillis();
    System.out.println("Waktu eksekusi Divide and Conquer: " + (endTimeDC - startTimeDC) + " milliseconds");
    System.out.println("==============================================");
    }
}
