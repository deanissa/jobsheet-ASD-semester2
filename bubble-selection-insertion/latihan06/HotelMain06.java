package latihan06;

public class HotelMain06 {
    public static void main(String[] args) {
        HotelService06 list = new HotelService06();
        Hotel06 h1 = new Hotel06("Nusa", "Malang", 2000, (byte)5);
        Hotel06 h2 = new Hotel06("Rara", "Surabaya", 2500, (byte)2);
        Hotel06 h3 = new Hotel06("Agung", "Jakarta", 500, (byte)4);
        Hotel06 h4 = new Hotel06("Nunung", "Bogor", 1000, (byte)1);
        Hotel06 h5 = new Hotel06("Yaya", "Bandung", 1500, (byte)3);

        list.tambah (h1);
        list.tambah (h2);
        list.tambah (h3);
        list.tambah (h4);
        list.tambah (h5);
        
        System.out.println("Data Hotel sebelum sorting = ");
        list.tampil();

        System.out.println("Data Hotel setelah sorting DESC berdasarkan Bintang");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Hotel setelah sorting ASC berdasarkan Harga");
        list.selectionSort();
        list.tampil();

    
    }
}
