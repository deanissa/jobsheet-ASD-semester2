
public class Mahasiswa {
    public String nama;
    public String nim;
    public String jenisKelamin;
    public double ipk;

    public Mahasiswa(String nama, String nim, String jenisKelamin, double ipk) {
    this.nama = nama;
    this.nim = nim;
    this.jenisKelamin = jenisKelamin;
    this.ipk = ipk;
    }
    void setNama(String nama) {
        this.nama = nama;
    }
    void setNim(String nim) {
        this.nim = nim;
    }
    void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public double getIpk() {
        return ipk;
    }
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("IPK: " + ipk);
        System.out.println();
    }
}