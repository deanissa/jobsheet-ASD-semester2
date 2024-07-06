public class DaftarTransaksi06 {
    Transaksi06 list[];
    int idx;

    DaftarTransaksi06(int size) {
        list = new Transaksi06[size];
        idx = 0;
    }

    void tampil() {
        for (Transaksi06 r : list) {
            if (r != null) {
                r.tampil();
                System.out.println("--------------------------");
            }
        }
    }
    
    void tambah (Transaksi06 r){
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
                if (list[j].saldo > list[j + 1].saldo) {
                    Transaksi06 tmp = list[j];
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
            if (list[j].saldo == cari) {
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
            System.out.println("Saldo \t : " +list[pos].saldo);
            System.out.println("Saldo Awal \t : " +list[pos].saldoAwal);
            System.out.println("Saldo Akhir \t : " +list[pos].saldoAkhir);
            System.out.println("Tanggal Transaksi \t : " +list[pos].tanggalTransaksi);
            System.out.println("Type \t : " +list[pos].type);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }   
}
