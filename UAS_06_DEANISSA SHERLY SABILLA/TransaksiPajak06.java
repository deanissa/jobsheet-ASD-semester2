class TransaksiPajak06 {
    private int kode;
    private String noTNKB;
    private String nama;
    private long nominal;
    private long denda;

    public TransaksiPajak06(long nominalBayar, long denda2, int bulanBayar, Kendaraan06 kendaraan) {
        this.kode = kode;
        this.noTNKB =noTNKB;
        this.nama =nama;
        this.nominal = nominal;
        this.denda = denda;
    }
    public void setNoTNKB(String noTNKB) {
        this.noTNKB = noTNKB;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public long getNominal() {
        return nominal;
    }
    public void setNominal(long nominal) {
        this.nominal = nominal;
    }
    public long getDenda() {
        return denda;
    }
    public void setDenda(long denda) {
        this.denda = denda;
    }
    public String toString() {
        return String.format("|%-15d|%-15s|%-10s|%-10d|%-10d|", kode, noTNKB, nama, nominal, denda);
    }
}    
