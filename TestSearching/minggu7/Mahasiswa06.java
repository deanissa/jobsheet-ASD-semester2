/**
 * Mahasiswa06
 */
package minggu7;
public class Mahasiswa06 {
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa06 (int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }
    //Method Tampil
    void tampil (){
        System.out.println("Nim = " +nim);
        System.out.println("Nama = "+nama);
        System.out.println("Umur = "+umur);
        System.out.println("IPK = "+ipk);
    }
}