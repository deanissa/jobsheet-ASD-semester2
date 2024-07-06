package latihan06;

public class HotelService06 {
    Hotel06 listHotel[] = new Hotel06 [5];
    int idx;
    //Method Tambah
    void tambah (Hotel06 h){
        if (idx<listHotel.length){
            listHotel[idx] = h;
            idx++;
        }else {
            System.out.println("Data Sudah Penuh!");
        }
    }
    
    //Method Tampil
    void tampil (){
        for (Hotel06 h : listHotel){
            h.tampil();
            System.out.println("--------------------------");
        }
    }
    //Bubble Sort untuk urutan Bintang (Tertinggi ke Terendah)
    void bubbleSort (){
        for (int i = 0; i < listHotel.length-1; i++) {
            for (int j = 1; j < listHotel.length-i; j++) {
                if (listHotel[j].bintang > listHotel[j-1].bintang){
                    Hotel06 tmp = listHotel[j];
                    listHotel[j] = listHotel[j-1];
                    listHotel[j-1] = tmp;
                }
            }
        }
    }
    //Selection Sort untuk urutan Harga (Termurah ke Tertinggi)
    void selectionSort (){
        for (int i = 0; i < listHotel.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listHotel.length; j++) {
                if(listHotel[j].harga < listHotel[idxMin].harga){
                    idxMin = j;
                }
            }
            Hotel06 tmp = listHotel[idxMin];
            listHotel[idxMin] = listHotel [i];
            listHotel[i] = tmp;
        }
    }
}
