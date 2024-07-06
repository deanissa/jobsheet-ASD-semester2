public class Kendaraan06 {
    private String noTNKB;
    private String namaPemilik;
    private String jenisKendaraan; 
    private int ccKendaraan;
    private int tahunKendaraan;
    private int bulanHarusBayar;

    public Kendaraan06(String noTNKB, String namaPemilik, String jenisKendaraan, int ccKendaraan, int tahunKendaraan, int bulanHarusBayar) {
        this.noTNKB = noTNKB;
        this.namaPemilik = namaPemilik;
        this.jenisKendaraan = jenisKendaraan;
        this.ccKendaraan = ccKendaraan;
        this.tahunKendaraan = tahunKendaraan;
        this.bulanHarusBayar = bulanHarusBayar;
    }
    public String toString() {
        return String.format("|%-11s| %-15s | %-5s | %-11d | %-4d | %-17d |", noTNKB, namaPemilik, jenisKendaraan, ccKendaraan, tahunKendaraan, bulanHarusBayar);
    }
    public String getNomorTNKB() {
        return noTNKB;
    }
    public int getCCKendaraan() {
        return ccKendaraan;
    }
    public int getTahunKendaraan() {
        return tahunKendaraan;
    }
    public String getNamaPemilik() {
        return namaPemilik;
    }
    public int getBulanHarusBayar() {
        return bulanHarusBayar;
    }
}
