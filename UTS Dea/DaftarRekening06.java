public class DaftarRekening06 {
    Rekening06 list[];
    Transaksi06 lis[];
    int idx;

    DaftarRekening06(int size) {
        list = new Rekening06[size];
        idx = 0;
    }

    void tampil() {
        for (Rekening06 r : list) {
            if (r != null) {
                r.tampil();
                System.out.println("--------------------------");
            }
        }
    }
    
    void tambah (Rekening06 r){
        if (idx<list.length){
            list[idx] = r;
            idx++;
        }else {
            System.out.println("Data Rekening Sudah Penuh!");
        }
    }
    void bubbleSort() {
    for (int i = 0; i < idx - 1; i++) {
        for (int j = 0; j < idx - i - 1; j++) {
            if (list[j] != null && list[j + 1] != null) {
                if (list[j].noRekening > list[j + 1].noRekening) {
                    Rekening06 tmp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = tmp;
                }
            }
        }
    }
}
    //Algoritma pencarian data Sequential Searching
    public int FindSeqSearch (int cari) {
        int posisi = -1;
        for (int j = 0; j < list.length; j++) {
            if (list[j].noRekening == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
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
            System.out.println("No Rekening \t : " + x);
            System.out.println("Nama \t : " +list[pos].nama);
            System.out.println("Phone \t : " +list[pos].phone);
            System.out.println("Email \t : " +list[pos].email);
            System.out.println("Saldo \t : " +lis[pos].saldo);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }
}
