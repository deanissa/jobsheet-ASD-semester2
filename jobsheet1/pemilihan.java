/**
 * pemilihan
 */
import java.util.Scanner;
public class pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai tugas : ");
        float tugas = sc.nextFloat();
        System.out.print("Masukkan nilai kuis : ");
        float kuis = sc.nextFloat();
        System.out.print("Masukkan nilai UTS : ");
        float uts = sc.nextFloat();
        System.out.print("Masukkan nilai UAS : ");
        float uas = sc.nextFloat();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        float akhir = (tugas * 0.2F) + (kuis * 0.2F) + (uts * 0.3F) + (uas * 0.3F);
        
         if (akhir > 80){
         System.out.print("Nilai Ahir : " + akhir );
         System.out.println("\n Nilai Huruf : A");
         } else if (akhir > 73){
         System.out.print("Nilai Ahir : " + akhir );
         System.out.println("\n Nilai Huruf : B+");
         } else if (akhir > 65){
         System.out.print("Nilai Ahir : " + akhir );
         System.out.println("\n Nilai Huruf : B");
         } else if (akhir > 60) {
         System.out.print("Nilai Ahir : " + akhir );
         System.out.println("\n Nilai Huruf : C+");
         } else if (akhir > 50) {
         System.out.print("Nilai Ahir : " + akhir );
         System.out.println("\n Nilai Huruf : C");
         } else if (akhir > 39) {
         System.out.print("Nilai Ahir : " + akhir );
         System.out.println("\n Nilai Huruf : D");
         } else {
         System.out.print("Nilai Ahir : " + akhir );
         System.out.println("\n Nilai Huruf : E");
         }
         String message = akhir > 39 ? "ANDA LULUS" : "ANDA TIDAK LULUS";
         System.out.println(message);
    }
}