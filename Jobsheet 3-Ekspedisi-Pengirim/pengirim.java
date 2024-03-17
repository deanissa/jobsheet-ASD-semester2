/**
 * pengirim
 */
public class pengirim {

    public String username;
    public String password;
    public String namaPengirim;
    public String namaPenerima;
    public String alamatPengirim;
    public String alamatPenerima;
    public String noHpPengirim;
    public String noHpPenerima;
    public double beratPaket;
    public String layanan;

    public pengirim(String username, String password, String namaPengirim, String namaPenerima, String alamatPengirim, String alamatPenerima,
                    String noHpPengirim, String noHpPenerima, double beratPaket, String layanan) {
        this.username = username;
        this.password = password;
        this.namaPengirim = namaPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPengirim = alamatPengirim;
        this.alamatPenerima = alamatPenerima;
        this.noHpPengirim = noHpPengirim;
        this.noHpPenerima = noHpPenerima;
        this.beratPaket = beratPaket;
        this.layanan = layanan;
    }
    void tampilDataPengirim() {
        System.out.println("Data Pengirim:");
        System.out.println("Username: " + username);
        System.out.println("Nama Pengirim: " + namaPengirim);
        System.out.println("Nama Penerima: " + namaPenerima);
        System.out.println("Alamat Pengirim: " + alamatPengirim);
        System.out.println("Alamat Penerima: " + alamatPenerima);
        System.out.println("No HP Pengirim: " + noHpPengirim);
        System.out.println("No HP Penerima: " + noHpPenerima);
        System.out.println("Berat Paket: " + beratPaket);
        System.out.println("Layanan: " + layanan);
    }
}