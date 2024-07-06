public class Transaksi06 {
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tanggalTransaksi;
    String type;

    public Transaksi06 (double sd, double sAwal, double sAkhir, String tglTran, String ty){
        saldo = sd;
        saldoAwal = sAwal;
        saldoAkhir = sAkhir;
        tanggalTransaksi = tglTran;
        type = ty;
    }
    //Method Tampil
    void tampil (){
        System.out.println("Saldo = " +saldo);
        System.out.println("Saldo Awal = "+saldoAwal);
        System.out.println("Saldo Akhir = "+saldoAkhir);
        System.out.println("Tanggal Transaksi = "+tanggalTransaksi);
        System.out.println("Type = "+type);
    }

  
    
}
