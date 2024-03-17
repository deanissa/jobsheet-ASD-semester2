import java.util.Scanner;
public class AkarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan : ");
        int jmlBilangan = sc.nextInt();

        Akar akar = new Akar();

        for (int i = 1; i <= jmlBilangan; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            int bilangan = sc.nextInt();

            // Menggunakan algoritma Brute Force
            int akarBruteForce = akar.bruteForce(bilangan);
            System.out.println("Akar dari " + bilangan + " (Brute Force) adalah: " + akarBruteForce);

            // Menggunakan algoritma Divide Conquer
            int akarDivideConquer = akar.divideConquer(bilangan);
            System.out.println("Akar dari " + bilangan + " (Divide Conquer) adalah: " + akarDivideConquer);
        }

        sc.close();
    }
}
