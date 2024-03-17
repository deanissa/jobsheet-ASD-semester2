import java.util.Scanner;

import minggu5.Pangkat;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("=======================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat [] png = new Pangkat [elemen];
        for (int i = 0; i < elemen; i++) {
            //png[i] = new Pangkat ();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke-" +(i+1)+ " : ");
            int nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke-" +(i+1)+ " : ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("==========================================");
        System.out.println("Pilih metode:");
        System.out.println("1. Pangkat dengan Brute Force");
        System.out.println("2. Pangkat dengan Divide and Conquer");
        System.out.print("Masukkan pilihan: ");
        int pilihan = sc.nextInt();

        switch (pilihan){
        case 1 :
        System.out.println("==========================================");
        System.out.print("Hasil Pangkat dengan Brute Force ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai "+png[i].nilai+ " Pangkat "+png[i].pangkat+ " adalah : "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        } break;

        case 2:
        System.out.println("==========================================");
        System.out.print("Hasil Pangkat dengan Divide and Conquer ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai "+png[i].nilai+ " Pangkat "+png[i].pangkat+ " adalah : "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        } break;
        default:
                System.out.println("Pilihan tidak valid");
        }
        System.out.println("============================================");
    }
}
