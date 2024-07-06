public class Mahasiswa06 implements Comparable<Mahasiswa06> {
    
    String nim;
    String nama;
    String notelp;

    public Mahasiswa06() {}

    public Mahasiswa06(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }

    @Override
    public int compareTo(Mahasiswa06 other) {
        return this.nim.compareTo(other.nim);
    }
}
