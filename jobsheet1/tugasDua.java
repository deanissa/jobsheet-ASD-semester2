/**
 * tugasDua
 */
import java.util.Scanner;
public class tugasDua {
    //Fungsi menghitung kecepatan
    static double kecepatan (double s, double t){
        return s/t;
    }
    //Fungsi menghitung jarak
    static double jarak (double v, double t){
        return v * t;
    }
    //Fungsi menghitung waktu
    static double waktu (double s, double v){
        return s/v;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Pilihan menu
        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu : ");
            int choice = sc.nextInt();
            
            if (choice == 4) {
                System.out.println("Keluar");
                break;
            }

            double v, s, t;
            switch (choice) {
                //Pilihan menghitung kecepatan
                case 1 :
                System.out.print("Masukkan Jarak (s) : ");
                s = sc.nextDouble();
                System.out.print("Masukkan Waktu (t) : ");
                t = sc.nextDouble();
                v = kecepatan (s, t);
                System.out.println("Kecepatan (v) adalah " +v);
                break;

                //Pilihan menghitung jarak
                case 2 :
                System.out.print("Masukkan Kecepatan (v) : ");
                v = sc.nextDouble();
                System.out.print("Masukkan Waktu (t) : ");
                t = sc.nextDouble();
                s = jarak (v, t);
                System.out.println("Jarak (s) adalah " +s);
                break;

                //Pilihan menghitung waktu
                case 3 :
                System.out.print("Masukkan Jarak (s) : ");
                s = sc.nextDouble();
                System.out.print("Masukkan Kecepatan (v) : ");
                v = sc.nextDouble();
                t = waktu (s, v);
                System.out.println("Waktu (t) adalah " +t);
                break;
                default : 
                System.out.println("Menu tidak valid");
            }
        }
        sc.close();
    }
}