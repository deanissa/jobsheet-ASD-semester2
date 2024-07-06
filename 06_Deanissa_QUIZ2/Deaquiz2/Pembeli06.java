package Deaquiz2;
/**
 * Pembeli06
 */
public class Pembeli06 {
    int noAntrian;
    String namaPembeli;
    String noHp;
    Pembeli06 prev, next;
    Pesanan_06 pesanan;

    public Pembeli06(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
        this.prev = null;
        this.next = null;
        this.pesanan = null;
    }

    public Pembeli06(String namaPembeli2, String noHp2, int i) {
        //TODO Auto-generated constructor stub
    }
}