public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public PersegiPanjang (int p, int l){
        panjang = p;
        lebar = l;
    }
    public int hitungLuas() {
        return panjang * lebar;
    }
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
    public void cetakInfo() {
        System.out.println("panjang: " + panjang + ", lebar: " + lebar);
    }
}