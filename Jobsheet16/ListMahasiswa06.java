import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa06 {
    
    List<Mahasiswa06> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa06... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
    public void hapus(int index) {
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa06 mhs) {
        mahasiswas.set(index, mhs);
    }
    public void tampil() {
        mahasiswas.forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }
    int binarySearch(String nim) {
        Collections.sort(mahasiswas);
        Mahasiswa06 key = new Mahasiswa06(nim, "", "");
        return Collections.binarySearch(mahasiswas, key);
    }
    public void ascendingSort() {
        Collections.sort(mahasiswas);
    }
    public void descendingSort() {
        Comparator<Mahasiswa06> comparator = Collections.reverseOrder();
        Collections.sort(mahasiswas, comparator);
    }

    public static void main(String[] args) {
        ListMahasiswa06 lm = new ListMahasiswa06();
        Mahasiswa06 m = new Mahasiswa06("201234", "Noureen", "021xx1");
        Mahasiswa06 m1 = new Mahasiswa06("201235", "Akhleema", "021xx2");
        Mahasiswa06 m2 = new Mahasiswa06("201236", "Shannum", "021xx3");
        lm.tambah(m, m1, m2);
        // Ascending 
        System.out.println("Diurutkan berdasarkan Ascending :");
        lm.ascendingSort();
        lm.tampil();
        System.out.println("");
        // Descending 
        System.out.println("Diurutkan berdasarkan Descending :");
        lm.descendingSort();
        lm.tampil();
    }
}
