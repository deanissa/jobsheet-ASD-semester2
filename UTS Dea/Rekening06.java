/**
 * Rekening06
 */
public class Rekening06 {

    int noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;

    public Rekening06 (int noRek, String nm, String phn, String em) {
        noRekening = noRek;
        nama = nm;
        phone = phn;
        email = em;
    }
    //Method Tampil
    void tampil (){
        System.out.println("No Rekening = " +noRekening);
        System.out.println("Nama = "+nama);
        System.out.println("Phone = "+phone);
        System.out.println("Email = "+email);
    }
}