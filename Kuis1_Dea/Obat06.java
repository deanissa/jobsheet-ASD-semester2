/**
 * Obat06
 */
public class Obat06 {
    public String nama06;
    public String kategori06;
    public int stok06;
    public int jumlah06;

    public Obat06(String nama06, String kategori06, int stok06, int jumlah06) {
        this.nama06 = nama06;
        this.kategori06=kategori06;
        this.stok06 = stok06;
        this.jumlah06 = jumlah06;
    }
    //Method untuk mengatur nilai atribut dalam objek.
    void setNama(String nama06) {
        this.nama06 = nama06;
    }
    void setKategori(String kategori06) {
        this.kategori06 = kategori06;
    }
    void setStok(int stok06) {
        this.stok06 = stok06;
    }
    void setJumlah(int jumlah06) {
        this.jumlah06 = jumlah06;
    }
    //Method untuk mangambil nilai atribut dalam objek.
    public String getNama() {
        return nama06;
    }
    public String getKategori() {
        return kategori06;
    }
    public int getStok() {
        return stok06;
    }
    public int getJumlah() {
        return jumlah06;
    }

    //Method untuk hitung sisa obat
    public int hitungSisa() {
        return stok06 - jumlah06;
    }

    // Method untuk mencari obat yang paling banyak tidak terjual
    public static Obat06 cariObatTerjual(Obat06[] daftarObat06) {
        Obat06 obatTerjual06 = daftarObat06[0];
        for (Obat06 obat06 : daftarObat06) {
            if (obat06.hitungSisa() > obatTerjual06.hitungSisa()) {
                obatTerjual06 = obat06;
            }
        }
        return obatTerjual06;
    }
    //Method untuk mengurutkan nama Obat sesuai Descending
    public static void urutBerdasarkanNama(Obat06[] daftarObat06) {
        boolean ditukar;
        do {
            ditukar = false;
            for (int i = 0; i < daftarObat06.length - 1; i++) {
                if (daftarObat06[i].getNama().compareTo(daftarObat06[i + 1].getNama()) < 0) {
                    Obat06 temp = daftarObat06[i];
                    daftarObat06[i] = daftarObat06[i + 1];
                    daftarObat06[i + 1] = temp;
                    ditukar = true;
                }
            }
        } while (ditukar);
    }
}