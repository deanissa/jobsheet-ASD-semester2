package minggu7;

/**
 * PencarianMhs
 */
public class PencarianMhs {
    Mahasiswa06 listMhs[];
        int idx;
    PencarianMhs (int size){
        listMhs = new Mahasiswa06[size];
        idx = 0;
    }


        void tampil(){
            for(Mahasiswa06 m : listMhs){
                m.tampil();
                System.out.println("----------------------------");
            }
        }
    //Method Tambah
    void Tambah (Mahasiswa06 m) {
        if (idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }
        else {
            System.out.println("Data Sudah Penuh! ");
        }
    }
    //Algoritma pencarian data Sequential Searching
    public int FindSeqSearch (int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    //Algoritma pencarian data Binary Searching
    public int FindBinarySearch (String cari, int left, int right) {
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int res = cari.compareToIgnoreCase(listMhs[mid].nama);
                if (res == 0)
                    return mid;
                if (res > 0)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            return -1;
        //int mid;
        //if (right >= left) {
            //mid = (left + right) / 2;
            //if (listMhs[mid].nim == cari) {
            //if (cari == listMhs[mid].nim) {
                //return (mid);
            //} else if (listMhs[mid].nim > cari ) {
                //return FindBinarySearch(cari, mid + 1, right);
                //return FindBinarySearch(cari, left, mid - 1);
            //} else {
                //return FindBinarySearch(cari, left, mid - 1);
                //return FindBinarySearch(cari, mid + 1, right);
            //}
        //}
        //return -1;
    }
    public void Tampilposisi (int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }
    public void TampilData (int x, int pos){
        if (pos != -1) {
            System.out.println("Nim \t : " + x);
            System.out.println("Nama \t : " +listMhs[pos].nama);
            System.out.println("Umur \t : " +listMhs[pos].umur);
            System.out.println("IPK \t : " +listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }
}